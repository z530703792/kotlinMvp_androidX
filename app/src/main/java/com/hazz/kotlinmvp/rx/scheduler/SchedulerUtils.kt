package com.hazz.kotlinmvp.rx.scheduler

/**
 * Created by zcq on 2017/11/17.
 * desc:
 */

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
