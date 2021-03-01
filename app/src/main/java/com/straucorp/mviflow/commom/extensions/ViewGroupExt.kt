package com.straucorp.mviflow.commom.extensions

import androidx.annotation.CheckResult
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

/**
 * ViewGroup extensions and derived components
 */

@ExperimentalCoroutinesApi
@CheckResult
fun SwipeRefreshLayout.refreshes(): Flow<Unit> {
    return callbackFlow {
        setOnRefreshListener { offer(Unit) }
        awaitClose { setOnRefreshListener(null) }
    }
}