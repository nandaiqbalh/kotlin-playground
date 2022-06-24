package data

class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getData(): T{
        return firstData
    }

    fun getSecond(): U{
        return secondData
    }

    fun printData(){
        return println("First data is ${firstData}, the second is ${secondData}")
    }
}