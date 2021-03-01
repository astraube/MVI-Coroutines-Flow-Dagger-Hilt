package com.straucorp.mviflow.domain.usecase

import com.straucorp.mviflow.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val userRepository: UserRepository) {
  operator fun invoke() = userRepository.getUsers()
}