package com.myapp.devcap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform