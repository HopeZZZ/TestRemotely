package com.zhongke.core.init

import android.app.Application
import android.os.Build
import android.util.SparseArray
import androidx.annotation.IntDef
import com.zhongke.core.init.ZKInitTrigger.InitTime.time
import java.util.*

/**
 * Created by wpt on 2021/7/26.
 */
class ZKInitTrigger private constructor() {
    private val mTaskChain: MutableList<ZKIInitTask> = ArrayList()
    private val mDelayRunTaskChain = SparseArray<MutableList<ZKIInitTask>>()
    var application: Application? = null
        private set

    fun prepare(application: Application?) {
        this.application = application
    }

    fun addTask(initTask: ZKIInitTask): ZKInitTrigger {
        mTaskChain.add(initTask)
        return this
    }

    fun addTaskDelayRun(initTask: ZKIInitTask, @time initTime: Int): ZKInitTrigger {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            var tasks = mDelayRunTaskChain[initTime]
            if (tasks == null) {
                tasks = ArrayList()
            }
            tasks.add(initTask)
            mDelayRunTaskChain.put(initTime, tasks)
            this
        } else {
            addTask(initTask)
        }
    }

    fun bind() {
        val firstTask = mTaskChain[0]
        if (firstTask != null) {
            val realInitTaskChain = ZKRealInitTaskChain(this, mTaskChain, 0)
            val product = firstTask.exe(realInitTaskChain)
        }
    }

    fun bind(@time time: Int) {
        val taskChain: List<ZKIInitTask>? = mDelayRunTaskChain[time]
        if (taskChain == null || taskChain.isEmpty()) {
            return
        }
        val firstTask = taskChain[0]
        if (firstTask != null) {
            val realInitTaskChain = ZKRealInitTaskChain(this, taskChain, 0)
            val product = firstTask.exe(realInitTaskChain)
        }
    }

    object InitTime {
        /**
         * APP获取到IMEI
         */
        const val INIT_TIME_IMEI = 0x1

        /**
         * 获取到读写文件权限
         */
        const val INIT_TIME_GET_FILE_PERMISSION = 0x2

        @IntDef(value = [INIT_TIME_IMEI, INIT_TIME_GET_FILE_PERMISSION])
        annotation class time
    }

    companion object {
        val instance = ZKInitTrigger()
    }
}