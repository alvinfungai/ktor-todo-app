package com.realsimplecoding.todo

data class TodoDraft(
    var title: String,
    var content: String?,
    var done: Boolean = false
)
