fun main() {
    val dataClassExample = DataClassExample()
    val enumClassExample = EnumClassExample()
//    val sealClassExample = SealClassExample()
    val objectClassExample = ObjectClassExample()
    dataClassExample.exampleData()
    enumClassExample.exampleEnum()
//    sealClassExample.exampleSeal()
    objectClassExample.objectClass()
}
//데이터 클래스 예제
class DataClassExample {
    fun exampleData() {
        data class DataClass(val name: String, val age: Int)

        val first = DataClass("Go", 22)
        val second = DataClass("Lee", 22)
        val third = DataClass("Jo", 20)
        val fourth = DataClass("Choi", 22)

        println("데이터 클래스 예제")
        println("first : $first")
        println("second : $second")
        println("third : $third")
        println("fourth : $fourth")

        println("first.copy1 : ${first.copy("Kim")}")
        println("first.copy2 : ${first.copy(age = 19)}")

        println("first.component1 : ${first.component1()}")
        println("first.component2 : ${first.component2()}")
        println()
    }
}

//열거형 클래스 예제
class EnumClassExample {
    enum class EnumClass {
        ALPHA, DELTA, GO;
    }

    fun exampleEnum() {
        println("열거형 클래스 예제")
        for (a in 1..3) {
            when(a) {
                1 -> println(EnumClass.ALPHA)
                2 -> println(EnumClass.DELTA)
                else -> println(EnumClass.GO)
            }
        }
        println()
    }
}

//seal Class 예제
//class SealClassExample {
//    sealed class Seal {
//        class seal1(num: Int) : Seal()
//        class seal2(ex1: Seal, ex2: Seal) : Seal()
//        class seal3 : Seal()
//    }
//
//    fun exampleSeal(seal: Seal) {
//        when(seal) {
//            is Seal.seal1 -> println(seal)
//            is Seal.seal2 -> println(seal)
//            is Seal.seal3 -> println(seal)
//        }
//    }
//}

class ObjectClassExample {
    fun objectClass() {
        println("Object클래스 예시")

        val exam = object {
            var a: Int = 10
            var b: Int = 20
            var c: Int = 30
        }

        val total = exam.a + exam.b + exam.c
        println("object클래스 예시1 : $total")
        exam2.exam2()
        exam3("이게", "가능하네?") /*companion object 이름제외*/
        println()
    }

    object exam2 {
        fun exam2() {
            println("object클래스 예시2")
        }
    }

    companion object exam3 {
        fun exam3(a: String , b: String) {
            println("object클래스 예시3 : ${a} ${b}")
        }
    }
}