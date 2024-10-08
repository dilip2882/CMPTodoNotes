package org.dilip.cmmnotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform