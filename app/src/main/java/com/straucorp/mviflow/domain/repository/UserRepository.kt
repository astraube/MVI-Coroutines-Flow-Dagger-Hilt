package com.straucorp.mviflow.domain.repository

import com.straucorp.mviflow.domain.entity.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
  fun getUsers(): Flow<List<User>>

  suspend fun refresh()

  suspend fun remove(user: User)

  suspend fun add(user: User)
}