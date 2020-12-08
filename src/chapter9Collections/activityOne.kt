package chapter9Collections

fun main() {
    var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)

    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)
    if(a.indexOf("Four")!= 4) a.add("Ten")
    println(a)
    if(a.contains("Zero")) a.add("Twelve")
    println(a)

    val mFriendSet = mutableSetOf<String>("Joe","Sue")
    println(mFriendSet)
    mFriendSet.add("Paula")
    println(mFriendSet)
    mFriendSet.add("Sue")
    println(mFriendSet)
    mFriendSet.add("sue")
    println(mFriendSet)
    mFriendSet.remove("Pepe")
    println(mFriendSet)

    val mAdopting = mutableListOf<String>("Cat", "Dog", "Chicken")
    mAdopting.add("Hamster")
    println(mAdopting)

    mFriendSet.addAll(mAdopting)
    println(mFriendSet)


}
