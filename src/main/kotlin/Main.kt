//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user1 = Users("paul")
    val user2 = Users("john")
    val user3 = Users("pracullos")
    val users = listOf(user1, user2, user3)

    val purchase1 = Purchase("milk")
    val purchase2 = Purchase("goods")
    val purchase3 = Purchase("junk foods")

    val purchases = listOf(purchase1, purchase2, purchase3)

    println(users)
    println(purchases)
    println(users.zip(purchases))

    //ALSO

    println(users zip purchases)


    /* --- UNZIP --- */

    val numbersZip = listOf("one" to 1, "two" to 2, "three" to 3)

    println(numbersZip)
    println(numbersZip.unzip())
}

data class Users(val name: String);
data class Purchase(val productName: String)