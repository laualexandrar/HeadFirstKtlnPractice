package chapter9Collections

fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    // Case 1:
//    mList.sort()
//    println(mList) Here the output is [Baseball, Basketball, Football]

    //Case2
//    val mMap = mutableMapOf("0" to "Netball")
//    var x = 0
//    for (item in mList) {
//        mMap.put(x.toString(), item)
//        x++
//    }
//    println(mMap.values)     Here the outPut is [basketball]

    //case3
    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)


//Example
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    numbersMap.put("three", 3)
//    println(numbersMap)   This is an example of how to add and updating entries

    //Both put() and putAll() overwrite the values if the given keys already exist in the map. Thus, you can use them to update values of map entries.

//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    val previousValue = numbersMap.put("one", 11)
//    println("value associated with 'one', before: $previousValue, after: ${numbersMap["one"]}")
//    println(numbersMap)



}