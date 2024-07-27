fun main() {
    val user1 = User("user 1")
    val user2 = User("user 2")
    val user3 = User("user 3")
    val user4 = User("user 4")
    val user5 = User("user 5")

    /* ---ListOF---- */
    //Emutable

    val listOfEmmutable = listOf(user1, user2, user3, user4, user5)

    listOfEmmutable.forEach { " Emmutable list of: ${println(it.name)}" }


    //Mutable
    val listOF = mutableListOf(user1, user2, user3, user4, user5);
    listOF.add(User("user 5"))
    listOF.forEach { " Mutable list of: ${println(it.name)}" }


    /*  --SetOf---   */

    // Emmutable
    val setOf1 = setOf("set1", "set 2", "set 3")
    setOf1.forEach { "Emmutable set of ${println(it)}" }

    //Mutable
    val setOf2 = mutableSetOf("set 1", "set 2", "set 3")

    setOf2.add("set 4")

    setOf2.forEach { " Mutable Set Of: ${println(it)} " }


    /* -- Emmutable mapOf -- */

    val mapOf1 = mapOf<Int, String>(1 to "john", 2 to "paul", 3 to "pracullos")

    //to get value from the map
    println("Map : ${mapOf1[1]}")

    mapOf1.forEach { (t, u) -> println("$t and $u") }

    // mutable mapof
    val mapof2 = mutableMapOf<Int, String>(1 to "john", 2 to "paul", 3 to "pracullos")
    // in mutable type we can add another value
    mapof2[4] = "Mario"

    mapof2.forEach { (t, u) -> println("$t and $u") }
}

data class User(val name: String?)
