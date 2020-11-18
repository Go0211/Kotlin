fun main() {
    val scopeFunction = ScopeFunctions()
    scopeFunction.letExample()
    scopeFunction.runExample()
    scopeFunction.withExample()
    scopeFunction.applyExample()
    scopeFunction.alsoExample()
}

class ScopeFunctions {
    val list : MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listOnlyRead = list

    //let 예시 (it / return : 람다함수의 마지막 결과)
    //리시버의 여러 함수들을 호출할 때 사용
    fun letExample() {
        println("list : $listOnlyRead")

        list.let {
            it.add(6)
            it.set(0, 2)
            println()
        }

        println("list(let) : $listOnlyRead")
    }

    // run ( this / return : 람다함수의 마지막 결과 ) ex) 리시버.run {람다함수}
    // 람다함수에서 여러 값을 초기화 + 리턴 값을 어떤 객체의 초기값으로 사용
    fun runExample() {
        list.run {
            this.add(7)
            this.set(0, 3)
            println()
        }

        println("list(run) : $listOnlyRead")
    }

    // with(this / return : 람다함수의 마지막 결과)	ex) with(리시버) {람다함수}
    // 리턴값 없을 때 사용하지 않을 때 권장
    fun withExample() {
        with(list) {
            this.add(8)
            this.set(0, 4)
            println()
        }

        println("list(with) : $listOnlyRead")
    }

    // this / return : 리시버 객체를 마지막에 리턴
    fun applyExample() {
        list.apply {
            this.add(9)
            this.set(0, 5)
            println()
        }

        println("list(apply) : $listOnlyRead")
    }

    // it / return : 리시버 객체를 마지막에 리턴
    fun alsoExample() {
        list.also {
            it.add(10)
            it.set(0, 6)
            println()
        }

        println("list(also) : $listOnlyRead")
    }
    //추가 복습이 필요한 것 같다. 활용법을 잘 모르겠으
}