fun main() {
    println("함수 예시")
    var function = Function()
    println(function.insertReturn(1, 2))
    function.noReturn(1, 2)
    println(function.noInsert())
    println(function.basicValue())
    println()

    println("클래스 생성자 예시")
    First("Hello")
    Second(1)
    Second(1,"World")
    Third(1,2)
    println()

    println("데이터 클래스 + companion object + copy() 예시")
    var dataClass = DataClass()
    dataClass.printNormal()
    DataClass.printCompanion()
    dataClass.copy()
    println()

    println("상속 + 오버라이드")
    var animal = Animal(10, 10)
    var rabbit = Rabbit(11, 11)
    animal.beforeOverride()
    rabbit.beforeOverride()
    println()

}

//함수 예시
class Function {
    fun insertReturn(x: Int, y: Int): Int {
        return x + y
    }

    fun noReturn(x: Int, y: Int) {
        println(x - y)
    }

    fun noInsert(): Int{
        var x = 1
        var y = 2
        return x * y
    }

    fun basicValue(x: Int = 1, y: Double = 2.0): Double{
        return x / y
    }
}

//클래스(생성자) 예시
class First {
    constructor(value: String) {
        println("Second Constructor : " + value)
    }
}
class Second(var a: Int) {
    init {
        println("Primary Constructor : " + a)
    }
    //Primary생성자+Second생성자
    //Second생성자에 꼭 Primary생성자의 파라미터를 넣어주어야 된다.
    //Second생성자가 실행 시, Primary생성자가 실행된 뒤 실행
    constructor(a: Int, value: String) : this(a) {
        println("Second Constructor : " + value)
    }
}
class Third(var a: Int, var b:Int) {
    init {
        println("Primary Constructor : " + (a+b))
    }
}

//데이터 클래스 + companion object 예시
class DataClass {
    data class NormalData(val a: String, var b: Int)
    var normalData = NormalData("Gost", 22)
    fun printNormal() {
        println(normalData)
    }

    companion object {
        data class CompanionData(val a: String, var b: Int)
        var companionData = CompanionData("Gostae", 22)
        fun printCompanion() {
            println(companionData)
        }
    }

    fun copy() {
        var newData = normalData.copy()
        println("copy -> " + newData)
    }
}

//상속 + 오버라이드 + 익스텐션
open class Animal(moveSpeed: Int) {
    init {
        print("Animal속도 : $moveSpeed ")
    }
    constructor(moveSpeed: Int, visualRange: Int): this(moveSpeed){
        println("Animal시야 : $visualRange")
    }
    open var beforeOverride: Int = 10
    open fun beforeOverride() {
        println("오버라이드 전 : $beforeOverride")
    }
}

class Rabbit(moveSpeed: Int) : Animal(moveSpeed) {
    init {
        print("Rabbit속도 : $moveSpeed ")
    }
    constructor(moveSpeed: Int, visualRange: Int): this(moveSpeed){
        println("Rabbit시야 : $visualRange")
    }

    override var beforeOverride: Int = 11
    override fun beforeOverride() {
        println("오버라이드 후 : $beforeOverride")
    }
}

//추상화 + 인터페이스 + 제네릭
