package com.gilbertocharles.KotlinExample.controller

import com.gilbertocharles.KotlinExample.service.AbstractService
import com.gilbertocharles.KotlinExample.model.AbstractModel
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

abstract class AbstractController<T : AbstractModel> {

    @ApiOperation(value = "Recuperar todos os registros")
    @GetMapping
    fun get(): List<T> {
        return this.getService().findAll()
    }

    @ApiOperation(value = "Recuperar registro por ID")
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): T {
        return this.getService().findById(id)
    }

    @ApiOperation(value = "Salvar um registro")
    @PostMapping
    fun save(@RequestBody registro: T): T {
        return this.getService().save(registro)
    }

    @ApiOperation(value = "Apagar um registro por ID")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): T {
        return this.getService().delete(id)
    }

    @ApiOperation(value = "Alterar um registro")
    @PutMapping("/{id}")
    fun put(@RequestBody registro: T): T {
        return this.getService().put(registro)
    }

    abstract fun getService() : AbstractService<T>
}