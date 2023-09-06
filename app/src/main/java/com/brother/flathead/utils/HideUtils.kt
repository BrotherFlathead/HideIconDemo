package com.brother.flathead.utils

import android.content.ComponentName
import android.content.pm.PackageManager
import com.brother.flathead.CustomApp
import com.brother.flathead.MainActivity

object HideUtils {

    /**
     * 恢复icon显示
     */
    fun resumeIconShow() {
        CustomApp.sApp.packageManager.setComponentEnabledSetting(
            ComponentName(CustomApp.sApp, MainActivity::class.java),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        )
    }
}