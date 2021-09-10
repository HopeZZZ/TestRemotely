package com.zhongke.core.init

import android.app.Application

/**
 * Created by wpt on 2021/7/26.
 * 初始化任务接口
 */
interface ZKIInitTask {
    fun exe(chain: Chain?): ZKInitTaskProduct?
    interface Chain {
        val application: Application?
        val product: ZKInitTaskProduct?
        fun process(): ZKInitTaskProduct?
    }
}