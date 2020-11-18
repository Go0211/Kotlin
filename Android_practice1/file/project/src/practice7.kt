fun main() {
    val delegate3 = Delegate3("Hello")
    val delegate4 = Delegate4("Hello")
    delegate3.nothing()
    delegate4.nothing()
}

interface Interface {
    fun nothing()
}

// Delegation Pattern 예시
// 위임의 필요성과 활용법을 잘 이해 못하겠다
class Delegate1 (val string: String) : Interface {
    override fun nothing() = println("String : ${string.toUpperCase()}")
}
class Delegate2 (val string: String) : Interface {
    override fun nothing() = println("String : ${string.toLowerCase()}")
}

class Delegate3 (val string: String) : Interface by Delegate1(string)
class Delegate4 (val string: String) : Interface by Delegate2(string)

// Delegated Properties
// 이해 안됌
class Delegate() {

}

class DelegatedProperties {
    fun delegatedProperties() {

    }
}