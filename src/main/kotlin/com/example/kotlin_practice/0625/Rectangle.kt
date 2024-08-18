package com.example.kotlin_practice.`0625`

import jdk.incubator.foreign.SymbolLookup

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

}
