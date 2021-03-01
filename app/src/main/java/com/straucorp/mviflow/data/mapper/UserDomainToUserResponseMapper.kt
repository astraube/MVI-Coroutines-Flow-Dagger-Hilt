package com.straucorp.mviflow.data.mapper

import com.straucorp.mviflow.data.remote.UserResponse
import com.straucorp.mviflow.domain.Mapper
import com.straucorp.mviflow.domain.entity.User
import javax.inject.Inject

class UserDomainToUserResponseMapper @Inject constructor() : Mapper<User, UserResponse> {
  override fun invoke(domain: User): UserResponse {
    return UserResponse(
        id = domain.id,
        avatar = domain.avatar,
        email = domain.email,
        firstName = domain.firstName,
        lastName = domain.lastName
    )
  }
}