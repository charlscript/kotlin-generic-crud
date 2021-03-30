package com.gilbertocharles.KotlinExample.repository

import com.gilbertocharles.KotlinExample.model.Livro
import org.springframework.data.repository.CrudRepository

interface LivroRepository : CrudRepository<Livro, Long> {}