package com.abbisea.utils

fun withTextResourceFromPath(path: String, work: String.() -> Unit): String? =
    path.javaClass.classLoader.getResource(path)?.readText()?.apply(work)
