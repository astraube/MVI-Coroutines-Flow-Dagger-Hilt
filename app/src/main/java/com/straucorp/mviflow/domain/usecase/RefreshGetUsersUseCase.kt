package com.straucorp.mviflow.domain.usecase

import com.straucorp.mviflow.domain.repository.UserRepository
import javax.inject.Inject

class RefreshGetUsersUseCase @Inject constructor(private val userRepository: UserRepository) {
  suspend operator fun invoke() = userRepository.refresh()
}