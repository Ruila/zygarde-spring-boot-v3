package will.com.demo.entity

import jakarta.persistence.*
import zygarde.codegen.ZyModel
import java.io.Serializable

@Table(schema = "public", name = "roles")
@ZyModel
@Entity
class Role(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    val name: String,

    val description: String? = null,

    val available: Boolean? = null,

    @Column(name = "project_id")
    val projectId: Int? = null
) : Serializable
