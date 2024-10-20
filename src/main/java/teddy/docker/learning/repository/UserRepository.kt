package teddy.docker.learning.repository

import teddy.docker.learning.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>