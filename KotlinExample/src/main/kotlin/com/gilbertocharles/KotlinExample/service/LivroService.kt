package com.gilbertocharles.KotlinExample.service

import com.gilbertocharles.KotlinExample.repository.LivroRepository
import com.gilbertocharles.KotlinExample.service.AbstractService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import com.gilbertocharles.KotlinExample.model.Livro
import org.springframework.stereotype.Service;

@Service
class LivroService() : AbstractService<Livro>() {
    @Autowired
    lateinit var repository: LivroRepository

    override fun getRepository() : CrudRepository<Livro, Long> {
        return this.repository
    }
}