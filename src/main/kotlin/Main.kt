fun main() {
    val numbers = setOf("one","two","three")

    //associateWith -> create a value using the key
    println(numbers.associateWith { it.length })
    //associateBy -> create a key using the key from the list and the key from the list become the value E.X
    println(numbers.associateBy { it.first().uppercase() })
    // output [O=one, T=three] -> T=two did not print because setOf is immutable and not allowed repeated character
}