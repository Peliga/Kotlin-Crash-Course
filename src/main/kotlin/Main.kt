//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf(1,2,3,4,5)

    println(numbers.map { it * 20 })
    println(numbers.mapIndexedNotNull { index, i -> if(index == 0) null else index * i  })

    val numberMap = mapOf("number 1" to 1,"number 2" to 2)

    println(numberMap.mapKeys { it.key.uppercase() })
    println(numberMap.mapValues { it.value * it.key.length })
}