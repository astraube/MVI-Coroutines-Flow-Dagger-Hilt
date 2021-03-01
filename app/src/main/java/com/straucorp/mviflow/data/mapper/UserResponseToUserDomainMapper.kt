package com.straucorp.mviflow.data.mapper

import com.straucorp.mviflow.data.remote.UserResponse
import com.straucorp.mviflow.domain.Mapper
import com.straucorp.mviflow.domain.entity.User
import javax.inject.Inject

class UserResponseToUserDomainMapper @Inject constructor() : Mapper<UserResponse, User> {
  override fun invoke(response: UserResponse): User {
    return User(
        id = response.id,
        avatar = response.avatar,
        email = response.email,
        firstName = response.firstName,
        lastName = response.lastName
    )
  }
}