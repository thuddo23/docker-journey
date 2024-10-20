package teddy.docker.learning.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import jakarta.persistence.*
import jakarta.validation.constraints.Size
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@Table(name = "users", schema = "DOCKER_JOURNEY_APP")
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder("name", "email")
data class User(
    @Id
    @SequenceGenerator(
        name = "user_id_sequence",
        sequenceName = "user_id_sequence",
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_id_sequence",
    )
    @JsonIgnore
    @JsonProperty("userId")
    val id: Long = 0,
    @Size(min = 2)
    @JsonProperty("name")
    val name: String,
    @JsonProperty("email")
    val email: String,
)
