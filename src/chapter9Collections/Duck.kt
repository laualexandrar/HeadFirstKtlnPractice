package chapter9Collections

class Duck(val size: Int = 17) {
    override fun equals(other: Any?): Boolean {
//        if(this === other) return true
//        if(other is Duck && size == other.size) return true
        return true
    }

    override fun hashCode(): Int {
        return (Math.random() * 100).toInt()
    }
}

fun main() {
    val set = setOf(Duck(), Duck(17))
    println(set)
}