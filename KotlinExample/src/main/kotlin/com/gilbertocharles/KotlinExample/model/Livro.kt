package com.gilbertocharles.KotlinExample.model

import com.gilbertocharles.KotlinExample.model.AbstractModel
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Livro(@Id 
          @GeneratedValue var id: Long,
          val titulo: String,
          val autor: String,
          val descricao: String) : AbstractModel() {
            override fun get() : Long {
                return this.id
            }

            override fun set(id: Long) {
                this.id = id
            } 
          }