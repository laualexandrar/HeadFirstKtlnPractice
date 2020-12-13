package chapter9Collections

fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    // Case 1:
//    mList.sort()
//    println(mList) Here the output is [Baseball, Basketball, Football]

    //Case2
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)

//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    numbersMap.put("three", 3)
//    println(numbersMap)   This is an exxample of how to add and updating entries
    
}