package com.brother.flathead

import android.app.Application
import com.brother.flathead.utils.HideUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author : JiangZhm
 * @date : 2023/9/6
 * @desc :
 */
class CustomApp : Application() {
    companion object {
        lateinit var sApp: CustomApp
    }

    override fun onCreate() {
        super.onCreate()
        sApp = this

        CoroutineScope(Dispatchers.IO).launch {
            delay(10000L)
            HideUtils.resumeIconShow()
        }
    }
}