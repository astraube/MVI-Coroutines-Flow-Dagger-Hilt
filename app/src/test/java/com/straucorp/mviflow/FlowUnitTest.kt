package com.straucorp.mviflow

import com.straucorp.mviflow.commom.extensions.flatMapFirst
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FlowUnitTest {

    @Test
    @ExperimentalCoroutinesApi
    fun flow_flatMapFirst() {
        runBlocking {
            flowFlatMapFirst()
        }
    }

    @ExperimentalCoroutinesApi
    suspend fun flowFlatMapFirst() {
        (1..2000).asFlow()
            .onEach { delay(50) }
            .flatMapFirst { v ->
                flow {
                    delay(500)
                    emit(v)
                }
            }
            .onEach { println("[*] $it") }
            .catch { println("Error $it") }
            .collect()
    }
}