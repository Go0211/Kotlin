fun main() {
    val listExample = ListExample()
    val setExample = SetExample()
    val mapExample = MapExample()
    val restExample = RestExample()
    listExample.classMain()
    setExample.setMain()
    mapExample.mapMain()
    restExample.filterMapMain()
    restExample.anyAllNoneMain()
    restExample.findFindLastMain()
    restExample.firstLastMain()
    restExample.countMain()
    restExample.associateByGroupByPartitionMain()
    restExample.flatMapMain()
    restExample.minMaxMain()
    restExample.sortedMain()
    restExample.mapElementAccessMain()
    restExample.zipMain()
    restExample.getOrElseMain()
}

//List 예시
class ListExample{
    private val list: MutableList<Int> = mutableListOf(1, 2 ,3)
    private val list1: List<Int> = list

    private fun addList(addNumber: Int) {
        list.add(addNumber)
    }
    private fun getList(getNumber: Int): Int{
        val getListValue = list1.get(getNumber)
        return getListValue
    }
    private fun setList(setNumber: Int, setValue: Int) {
        list.set(setNumber, setValue)
    }
    private fun removeAtList(removeNumber: Int) {
        list.removeAt(removeNumber)
    }

    fun classMain() {
        println("List 예시")

        println("초기 list : $list1")
        addList(4)

        println("add(4)한 후 list : $list1")

        println("list.get(1) : ${getList(1)}")

        setList(3,1)
        println("[3]을 1로 set : $list1")

        removeAtList(1)
        println("[1]을 removeAt : $list1")

        println("list의 사이즈 : ${list1.size}")
        println()
    }
}

//Set 예시
class SetExample {
    private val set: MutableSet<String> = mutableSetOf("A", "B", "C")
    private val set1: Set<String> = set

    private fun addSet(text: String): Boolean {
        return set.add(text)
    }
    private fun checkSet(check: Boolean): String {
        return if (check)
            "$check 추가 가능 (중복 x)"
        else
            "$check 추가 불가능 (중복 O)"
    }
    private fun removeSet(removeText: String) {
        set.remove(removeText)
    }

    fun setMain() {
        println("set 예시")

        println("초기 set : $set1")

        println(checkSet(addSet("D")) + " 현재 set : $set1")
        println(checkSet(addSet("A")) + " 현재 set : $set1")

        removeSet("B")
        println("삭제 후 set : $set1")

        println()
    }
}

//Map
class MapExample {
    private val map: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    private val map1: Map<Int, String> = map

    private fun putMap(key: Int, value: String) {
        map.put(key, value)
    }
    private fun getMap(key: Int) {
        map.get(key)
    }
    private fun remove(key: Int) {
        map.remove(key)
    }

    fun mapMain() {
        println("Map 예시")

        println("초기 map : $map1")

        putMap(5, "e")
        println("추가 후 map : $map1")
        putMap(1, "f")
        println("변경 후 map : $map1")

        println("map(1)의 값 : ${map.get(1)}")

        remove(2)
        println("삭제 후 map : $map1")

        println()
    }
}

class RestExample {
    private val list: List<Int> = listOf(1, 2, 3, 4, 5)
    private val empty = listOf<Int>()

    //filter, map 예시
    fun filterMapMain() {
        val odd = list.filter { x -> x % 2 != 0 }
        val evenNumber = list.filter { it % 2 == 0}
        val sum = list.map { x -> x + 1 }
        val mul = list.map {it * 2}

        println("filter 예제")

        println("list : $list")
        println("홀수(filter) : $odd")
        println("짝수(filter) : $evenNumber")
        println("+1(map) : $sum")
        println("*2(map) : $mul")

        println()
    }

    //any, all, none
    fun anyAllNoneMain() {
        val have = list.any { it < 2 }
        val all = list.all { x -> x < 5 }
        val nothing = list.none { x -> x < 0}

        println("any, all, none 예시")

        println("list : $list")
        println("any : $have")      //조건에 1개만 만족해도 true
        println("all : $all")       //조건에 모두 만족해야 true
        println("none : $nothing")  //조건에 모두 불만족해야 true

        println()
    }

    //find, findLast
    fun findFindLastMain() {
        val first = list.find { x -> x % 1 == 0 }   //조건에 만족하는 첫번째 값
        val last = list.findLast { it % 1 == 0 }    //조건에 만족하는 마지막 값
        val nullValue = list.find { x -> x > 10 }   //조건에 만족 => 0 / null를 리턴

        println("find, findLast 예시")

        println("list : $list")
        println("first : $first")
        println("last : $last")
        println("nullValue : $nullValue")

        println()
    }

    //first, last
    fun firstLastMain() {

        val first = list.first()
        val last = list.last()
        val firstCondition = list.first { x -> x < 3 }
        val lastCondition = list.last { it < 3 }
        val firstOrNull = empty.firstOrNull()
        val lastOrNull = empty.lastOrNull()
        val firstOrNullC = list.firstOrNull { it < 4 }
        val lastOrNullC = list.lastOrNull { x -> x < 4 }

        println("first, last 예시")

        println("first() : $first \t first{~} : $firstCondition")
        println("last() : $last \t\t last{~} : $lastCondition")
        println("firstOrNull() : $firstOrNull \t firstOrNull{~} : $firstOrNullC")
        println("lastOrNull() : $lastOrNull \t lastOrNull{~} : $lastOrNullC")

        println()
    }

    //count
    fun countMain() {
        val countCondition = list.count { x -> x %  2 == 0}

        println("count 예시")

        println("초기 list : $list")
        println("list.count() : ${list.count()}")
        println("list.count{~} : $countCondition")

        println()
    }

    //associateBy, groupBy, partition
    fun associateByGroupByPartitionMain() {
        data class alpha(val i: Int, val you: String)
        val sample = listOf(
            alpha(1, "a"),
            alpha(2, "b"),
            alpha(3, "c"),
            alpha(4, "a")
        )

        val changeMap1 = sample.associateBy { it.i }    // i를 Key, map을 만듬
        val changeMap2 = sample.groupBy { x -> x.you}   // you를 중점으로 map을 구성
        val partition1 = list.partition { it <= 3 }
        val (first, second) = list.partition { x -> x <= 3 }

        println("associateBy, groupBy, partition 예시")

        println("sample : $sample")
        println("associateBy : $changeMap1")
        println("groupBy : $changeMap2")

        println("list : $list")
        println("partition(true) : ${partition1.first}")
        println("partition(false) : ${partition1.second}")
        println("partition(first parameter) : $first")
        println("partition(second parameter) : $second")

        println()
    }

    //flatMap
    fun flatMapMain() {
        println("flatMap 예시")

        println("list : $list")
        println("flatMap : ${list.flatMap { listOf(it, it+10) }}")  //값을 flatMap의 조건?에 맞게 표현?

        println()
    }

    //min, max
    fun minMaxMain() {
        println("min, max 예시")

        println("list : $list \t max : ${list.max()} \t\t min : ${list.min()}")
        println("empty : $empty \t\t\t\t max : ${empty.max()} \t min : ${empty.min()}")

        println()
    }

    //sorted 정렬
    fun sortedMain() {
        println("sorted 예시")

        println("list : $list")
        println("list.sorted : ${list.sorted()}")
        println("list.sortedBy : ${list.sortedBy { -it }}")
        println("list.sortedDescending : ${list.sortedDescending()}")
        println("list.sortedByDescending : ${list.sortedByDescending { -it }}")

        println()
    }

    //Map Element Access
    fun mapElementAccessMain() {
        println("Map Element Access 예시")

        val a = mapOf("key1" to 30)
        val b = a.getValue("key1")     //예외유발 가능해서 예외처리 필요
                                            //map의 key를 이용해서 값을 뽑아낼 수 있다.
        println("map : $a")
        println("map.getValue(key) : $b")

        println()
    }

    //zip
    fun zipMain() {
        val list1 = listOf("a1a", "a2a", "a3a", "a4a", "a5a")
        val zip1 = list zip list1                               // zip파일 처럼 묶어주는 역할
        val zip2 = list.zip(list1) {x, y -> "$x$y"}

        println("zip 예시")

        println("list : $list")
        println("list1 : $list1")
        println("list zip list1 : $zip1")
        println("list.zip(list1) : $zip2")

        println()
    }

    //getOrElse
    fun getOrElseMain() {
        val a = list.getOrElse(1) {"없어용"}   //index에 값 존재 : 값  return
        val b = list.getOrElse(7) {"없어용"}   //index에 값 없음 : {~} return

        println("getOrElse 예시")

        println("list : $list")
        println("list.getOrElse(1) : $a")
        println("list.getOrElse(7) : $b")

        println()
    }
}