package com.realsimplecoding.todo

import org.jetbrains.exposed.sql.Table

data class Todo(
    val id: Int,
    var title: String,
    var content: String?,
    var done: Boolean = false
)

object Todos : Table() {
    val id = integer(name = "id").autoIncrement()
    val title = varchar(name = "title", length = 64)
    val content = varchar(name = "content", length = 140)
    val done = bool(name = "done")

    override val primaryKey = PrimaryKey(id)
}