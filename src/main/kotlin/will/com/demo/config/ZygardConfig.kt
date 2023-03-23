package will.com.demo.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import zygarde.data.jpa.dao.ZygardeJpaRepository

@Configuration
@EnableJpaRepositories(
    basePackages = ["will.com.demo.data.dao"],
    repositoryBaseClass = ZygardeJpaRepository::class
)
class ZygardConfig