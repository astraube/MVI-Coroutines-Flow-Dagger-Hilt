package com.straucorp.mviflow.data.mapper

import com.straucorp.mviflow.data.remote.UserBody
import com.straucorp.mviflow.domain.Mapper
import com.straucorp.mviflow.domain.entity.User
import javax.inject.Inject

class UserDomainToUserBodyMapper @Inject constructor() : Mapper<User, UserBody> {
  override fun invoke(domain: User): UserBody {
    return UserBody(
        email = domain.email,
        avatar = domain.avatar,
        firstName = domain.firstName,
        lastName = domain.lastName
    )
  }
}