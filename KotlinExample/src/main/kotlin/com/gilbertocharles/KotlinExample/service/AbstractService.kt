package com.gilbertocharles.KotlinExample.service

import com.gilbertocharles.KotlinExample.model.AbstractModel
import org.springframework.data.repository.CrudRepository


abstract class AbstractService<T : AbstractModel> {

    abstract fun getRepository() : CrudRepository<T, Long>

    fun findAll() : List<T> {
        return this.getRepository().findAll().toList()
    }

    fun findById(id: Long) : T {
        return this.getRepository().findById(id).get()
    }

    fun save(registro: T) : T {
        return this.getRepository().save(registro)
    }

    fun delete(id: Long) : T {
        val registro = this.findById(id)
        this.getRepository().delete(registro)
        return registro
    }

    fun put(registro: T) : T {
        this.getRepository().findById(registro.get()).get();
        return this.getRepository().save(registro);
    }
}