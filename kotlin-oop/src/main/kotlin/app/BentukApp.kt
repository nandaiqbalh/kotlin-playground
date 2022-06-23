package app

import data.Bentuk

class Persegi : Bentuk{

    constructor() : super("Persegi", 4)
    constructor(color: String) : super ("Persegi", 4, color)
}