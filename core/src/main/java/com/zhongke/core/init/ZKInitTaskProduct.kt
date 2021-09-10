package com.zhongke.core.init

import java.util.*

/**
 * Created by wpt on 2021/7/26.
 */
class ZKInitTaskProduct {
    private val PRODUCT: MutableMap<String, Any> = HashMap()
    fun produce(key: String, product: Any) {
        PRODUCT[key] = product
    }

    fun result(): MutableMap<String, Any> {
        return PRODUCT
    }
}