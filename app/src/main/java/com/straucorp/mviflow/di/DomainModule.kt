package com.straucorp.mviflow.di

import com.straucorp.mviflow.data.UserRepositoryImpl
import com.straucorp.mviflow.domain.dispatchers.CoroutineDispatchers
import com.straucorp.mviflow.domain.dispatchers.CoroutineDispatchersImpl
import com.straucorp.mviflow.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
@InstallIn(ApplicationComponent::class)
abstract class DomainModule {
  @Binds
  abstract fun bindCoroutineDispatchers(coroutineDispatchersImpl: CoroutineDispatchersImpl): CoroutineDispatchers

  @Binds
  abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository
}
