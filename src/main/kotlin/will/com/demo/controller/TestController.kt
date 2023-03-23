package will.com.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import will.com.demo.data.dao.RoleDao
import will.com.demo.entity.search.name
import zygarde.data.jpa.dao.searchOne

@RestController
@RequestMapping
class TestController(
    private val roleDao: RoleDao
) {
    @GetMapping("/data")
    fun getData(): String {
        val data = roleDao.searchOne { name() eq "root" }
        return data?.description ?: "empty"
    }

}
