package com.straucorp.mviflow

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@Suppress("unused")
@FlowPreview
@ExperimentalCoroutinesApi
@HiltAndroidApp
open class AppStr : Application()