fun main() {

    val names: Map<Int,String> = mapOf(
        1 to "Tom",
        2 to "Redik",
        3 to "Helen",
        4 to "Peter",
        5 to "Cody",
        6 to "Tom",
        7 to "Redik",
        8 to "Helen",
        9 to "Peter",
        10 to "Cody",
        11 to "Sara",
        12 to "Klara"
    )

    println(names.filter { it.value.endsWith('a') })
}