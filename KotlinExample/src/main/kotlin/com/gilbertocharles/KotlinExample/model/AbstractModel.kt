package com.gilbertocharles.KotlinExample.model

abstract class AbstractModel(){
    abstract fun get(): Long
    abstract fun set(id: Long)
}