package com.zhongke.core.init

import android.app.Application

/**
 * Created by wpt on 2021/7/26.
 */
class ZKRealInitTaskChain(
    private val mInitTask: ZKInitTrigger,
    private val mInitTasks: List<ZKIInitTask>,
    private val mIndex: Int
) : ZKIInitTask.Chain {
    override val product: ZKInitTaskProduct?
    override val application: Application?
        get() = mInitTask.application

    override fun process(): ZKInitTaskProduct? {
        if (mIndex == mInitTasks.size - 1) {
            return product
        }
        //执行下一个任务
        val nextChain = ZKRealInitTaskChain(mInitTask, mInitTasks, mIndex + 1)
        product?.result()?.putAll(mInitTasks[mIndex + 1].exe(nextChain)!!.result())
        return product
    }

    init {
        product = ZKInitTaskProduct()
    }
}