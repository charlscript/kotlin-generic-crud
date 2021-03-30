# kotlin-generic-crud

A Ideia desse projeto é fornecer uma estrutura genérica para criação de CRUDs, assim, reduzindo a repetição de código ao usar classes e tipos genéricos para reaproveitar o código.

O Projeto utiliza Kotlin, SpringBoot, Gradle, SwaggerUI e roda em Docker.
Também foi incluso um docker-compose e um script python para subir o projeto dentro de uma dockerVM.

### Como utilizar

Para criar um CRUD funcional, devemos estender (*No Kotlin, o extend é um sinal de dois pontos **:***) as classes genéricas criadas com seus devidos Overrides.

O projeto já vem com um CRUD de uma entidade Livros, no que seria uma API de Livraria.

Vamos criar então uma entidade Funcionario. Dentro do diretório /model, crie a classe Funcionario.kt e estenda a classe **AbstractModel**, além de os overrides *get* e *set*.
Lembrando que para salvar no banco de dados, estamos utilizando as anotações JPA/javax:

`package com.gilbertocharles.KotlinExample.model

import com.gilbertocharles.KotlinExample.model.AbstractModel

import javax.persistence.Entity

import javax.persistence.GeneratedValue

import javax.persistence.GenerationType

import javax.persistence.Id



@Entity

class Funcionario(@Id 

​          @GeneratedValue var *id*: Long,

​          val *nome*: String,

​          val *idade*: String) : AbstractModel() {

​            override fun get() : Long {

​                return *this*.id

​            }



​            override fun set(*id*: Long) {

​                *this*.id = id

​            } 

​          }`

