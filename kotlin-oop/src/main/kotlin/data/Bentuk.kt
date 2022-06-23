package data

open class Bentuk(val name: String, val shape: Int,val color: String) {
    constructor(name: String, shape: Int) : this (name, shape, "")
    constructor(name: String) : this (name, -1)
}