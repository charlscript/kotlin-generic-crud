package com.gilbertocharles.KotlinExample.controller

import com.gilbertocharles.KotlinExample.model.Livro
import com.gilbertocharles.KotlinExample.repository.LivroRepository
import com.gilbertocharles.KotlinExample.service.AbstractService
import com.gilbertocharles.KotlinExample.service.LivroService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(value = "Api de Livros", tags = ["Livros"])
@RestController
@RequestMapping("Livros")
class LivroController : AbstractController<Livro>(){
    @Autowired
    lateinit var service: LivroService

    override fun getService() : AbstractService<Livro> {
        return this.service
    }
}