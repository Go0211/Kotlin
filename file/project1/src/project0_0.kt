import kotlin.reflect.typeOf

//메인
fun main() {
    var conditionalSentence = ConditionalSentence()
    var arrayCollection = ArrayCollection()
    var repetitiveSentence = RepetitiveSentence()

    println("변수 예시")
    variable()

    println("조건문 예시")
    conditionalSentence.ifSentence()
    conditionalSentence.whenSentence()

    println("배열 예시")
    arrayCollection.array()

    println("ListCollection 예시")
    arrayCollection.listCollection()
    println("SetCollection 예시")
    arrayCollection.setCollection()
    println("MapCollection 예시")
    arrayCollection.mapCollection()
    println("Immutable Collection 예시")
    arrayCollection.immutableCollection()

    println("for문 예시")
    repetitiveSentence.forSentence()
    println("while문 예시")
    repetitiveSentence.whileSentence()

    println()

}

//변수
fun variable() {
    var integerValue: Int = 1
    var floatValue: Float = 1.1F
    var doubleValue: Double = 1.234_567_890
    var longValue: Long = 1L
    var shortValue: Short = 2
    var byteValue: Byte = 2
    var charValue: Char = '3'
    var stringValue: String = "4"
    var booleanValue: Boolean = true

    val PI = 3.141592F

    println("Int타입 : $integerValue")
    println("Float타입 : $floatValue")
    println("Double타입 : $doubleValue")
    println("Long타입 : $longValue")
    println("Short타입 : $shortValue")
    println("Byte타입 : $byteValue")
    println("Char타입 : $charValue")
    println("String타입 : $stringValue")
    println("Boolean타입 : $booleanValue")
    println("상수 PI : $PI")
    println()
}

//조건문
class ConditionalSentence() {
    //if문
    fun ifSentence() {
        var a = 1
        var b = 2
        var bigger =
            if(a < b)
                println(b)
            else if(a == b)
                println(a)
            else
                println(a)

        return bigger
    }
    //when문
    fun whenSentence() {
        var a = 10
        var b = 0
        when(a) {
            b, 1,2 -> {
                println("0 or 1 or 2")
            }
            in 3..10 -> {
                println("3에서 10사이")
            }
            else -> {
                println("다시 시도하세요.")
            }
        }
        println()
    }
}

class ArrayCollection {
    //배열 예시
    fun array() {
        var a = IntArray(2)
        a.set(0, 1)
        a[1] = 2
        var b = intArrayOf(3, 4)

        var stringArray = Array(10, {item->""}) //?
        stringArray[0] = "H"
        stringArray.set(1, "e")

        println("${a[0]}, ${a[1]}")
        println("${b[0]}, ${b[1]}")
        println("${stringArray[0]}${stringArray[1]}")
        println()
    }
    //컬렉션 예시
    fun listCollection() {
        var list = mutableListOf("MON", "TUE", "MON")
        println("${list}")
        list.add("WED")
        println("add실행 후 추가된 값 list[3] -> ${list[3]}")
        list.set(2, "TUE")
        println("set실행 후 변경된 값 MON -> ${list[2]}")
        list.removeAt(0)
        println("removeAt실행 후 최종 list : ${list}")

        var emptyList = mutableListOf<String>()
        println("빈 리스트 emptyList의 초기 사이즈 : " + emptyList.size)
        println()
    }
    fun setCollection() {
        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        println("JAN추가 전 set : $set")
        set.add("JAN")
        println("JAN추가 후 set : " + set)
        set.remove("JAN")
        println("JAN삭제 후 set : " + set)
        println()
    }
    fun mapCollection() {
        var map = mutableMapOf<String, String>()
        map.put("key1", "value1")
        map.put("key2", "value2")
        map.put("key3", "value3")
        println("값 삽입 후 map : " + map)
        map.put("key2", "수정")
        println("수정 후 map : " + map)
        map.remove("key2")
        println("삭제 후 map : " + map)
        println()
    }
    fun immutableCollection() {
        val DAY_LIST = listOf("월", "화", "수", "목", "금", "토", "일")
        println(DAY_LIST)
        println()
    }
}

//반복문 예시
class RepetitiveSentence {
    fun forSentence() {
        val DAYLIST = listOf("월", "화", "수", "목", "금", "토", "일")

        print("normal : ")
        for (normal in 1..10) {
            print("$normal ")
        }
        println()

        print("lastException : ")
        for (lastException in 1 until 10) {
            print("$lastException ")
        }
        println()

        print("step : ")
        for (step in 1..10 step 2) {
            print("$step ")
        }
        println()

        print("downTo : ")
        for (downTo in 10 downTo 1) {
            print("$downTo ")
        }
        println()

        print("week : ")
        for (week in DAYLIST) {
            print("$week ")
        }
        println()

        println()
    }
    fun whileSentence() {
        println("JAVA와 동일해서 제외")
        println()
    }
}
