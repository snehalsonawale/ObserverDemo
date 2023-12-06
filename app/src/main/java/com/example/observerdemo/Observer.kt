package com.example.observerdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun OnCreate()
    {

        Log.d("%%MAIN","Observer- Oncreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun OnStart()
    {

        Log.d("%%MAIN","Observer- ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun OnResume()
    {

        Log.d("%%MAIN","Observer- ON_RESUME")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun OnPause()
    {

        Log.d("%%MAIN","Observer- ON_PAUSE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun OnStop()
    {

        Log.d("%%MAIN","Observer- ON_STOP")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun OnSestroy()
    {

        Log.d("%%MAIN","Observer- ON_DESTROY")
    }

}