package com.zhongke.core.http.httpbase

import androidx.lifecycle.MutableLiveData
import com.zhongke.core.http.BaseResponse
import com.zhongke.core.http.httpbase.exception.AppException
import com.zhongke.core.http.httpbase.exception.ExceptionHandle

/**
 * 作者　: hegaojian
 * 时间　: 2020/4/9
 * 描述　: 自定义结果集封装类
 */
sealed class HttpResultState<out T> {

    companion object {

        fun <T> onHttpSuccess(data: T): HttpResultState<T> = Success(data)

        fun <T> onAppLoading(loadingMessage: String): HttpResultState<T> = Loading(loadingMessage)

        fun <T> onHttpError(error: AppException): HttpResultState<T> = Error(error)
    }

    data class Loading(val loadingMessage: String) : HttpResultState<Nothing>()
    data class Success<out T>(val data: T) : HttpResultState<T>()
    data class Error(val error: AppException) : HttpResultState<Nothing>()
}

/**
 * 处理返回值
 * @param result 请求结果
 */
fun <T> MutableLiveData<HttpResultState<T>>.paresResult(result: BaseResponse<T>) {
    value = when {
        result.isSuccess() -> {
            HttpResultState.onHttpSuccess(result.getResponseData())
        }
        else -> {
            HttpResultState.onHttpError(
                AppException(
                    result.getResponseCode(),
                    result.getResponseMsg()
                )
            )
        }
    }
}

/**
 * 不处理返回值 直接返回请求结果
 * @param result 请求结果
 */
fun <T> MutableLiveData<HttpResultState<T>>.paresResult(result: T) {
    value = HttpResultState.onHttpSuccess(result)
}

/**
 * 异常转换异常处理
 */
fun <T> MutableLiveData<HttpResultState<T>>.paresException(e: Throwable) {
    this.value = HttpResultState.onHttpError(ExceptionHandle.handleException(e))
}

