fun main() {
    val higherOrderExample = HigherOrderExample()
    val lambdaExample = LambdaExample()
    higherOrderExample.total()
    lambdaExample.lambda()
}

//Higher-Order Functions
class HigherOrderExample() {
    fun highOrder(x: Int, y: Int, calculator: (Int, Int) -> Int): Int {
        return calculator(x, y)
    }

    fun sum(x: Int, y: Int) = x + y

    fun total() {
        println("Higher-Order의 예시")
        println("::를 이용한 예시 : ${highOrder(1,1, ::sum)}")
        println("직접 대입을 한 예시 : ${highOrder(1,1, {x, y -> x + y})}")
        println()
    }
}

//Lambda Functions
class LambdaExample {
    fun lambda() {
        println("Lambda 예시")

        val example1: (String) -> String = { str: String -> str + " "}
        val example2: (String) -> String = { str -> str + " "}
        val example3 = {str: String -> str + " "}
        val example4: (String) -> String = {it + " "}

        print(example1("Hello"))
        print(example2("My"))
        print(example3("Practice"))
        println(example4("Work"))
        println()
    }
}

//Extension Functions and Properties