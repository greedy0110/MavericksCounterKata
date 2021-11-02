package com.greedy0110.mvrxcounter

import android.app.Application
import com.airbnb.mvrx.Mavericks

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}