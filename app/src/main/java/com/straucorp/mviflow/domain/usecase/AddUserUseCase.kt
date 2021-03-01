package com.straucorp.mviflow.domain.usecase

import com.straucorp.mviflow.domain.entity.User
import com.straucorp.mviflow.domain.repository.UserRepository
import javax.inject.Inject

class AddUserUseCase @Inject constructor(private val userRepository: UserRepository) {
  suspend operator fun invoke(user: User) = userRepository.add(user)
}