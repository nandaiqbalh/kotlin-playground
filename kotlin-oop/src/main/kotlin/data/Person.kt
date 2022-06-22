package data

class Person(firstNameParam: String, middleNameParam: String?, lastNameParam:String) {

    // properties
    var firstName = firstNameParam
    var middleName = middleNameParam
    var lastName = lastNameParam

    // secondary constructor
    constructor(firstNameParam: String, lastNameParam:String) :
            this (firstNameParam, null , lastNameParam)
    {
                // do something here
                println("Secondary Constructor")

            }
}
