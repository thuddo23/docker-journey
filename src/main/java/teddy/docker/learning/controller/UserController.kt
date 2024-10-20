package teddy.docker.learning.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.ExampleObject
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import teddy.docker.learning.domain.User
import teddy.docker.learning.repository.UserRepository

@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    private lateinit var userRepository: UserRepository

    @Operation(
        description = "Get all Users",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully get users!", // Changed to "users"
                content = [
                    Content(
                        mediaType = "application/json",
                        examples = [
                            ExampleObject(
                                value = """
                            {
                                "code" : 200, 
                                "Status": "OK", 
                                "Message" : "Successfully retrieved users!" 
                            }
                            """,
                            ),
                        ],
                    ),
                ],
            ),
        ],
    )
    @GetMapping
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}