package com.cfox.mvvmprot.base.eventstrategy.impl

import com.cfox.mvvmprot.base.eventdata.ActivityEventData
import com.cfox.mvvmprot.base.eventstrategy.IActivityStrategy

internal class DefaultActivityStrategy :
    IActivityStrategy {
    override fun execute(data: ActivityEventData) {
        data.getContext()?.let { context ->
            data.getActivityIntent()?.let { intent ->
                context.startActivity(intent)
            }
        }
    }
}