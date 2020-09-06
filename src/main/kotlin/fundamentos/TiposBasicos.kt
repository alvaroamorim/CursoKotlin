package fundamentos

fun main() {
    // Tipos Numéricos Inteiros
    val num1: Byte = 127 // Short (2 x Byte = 2 bytes)
    val num2: Short = 32767 // Int (2 x Short = 4 bytes)
    val num3: Int = 2_147_483_647 // Long (2 x Int = 8 bytes)
    val num4: Long = 9_223_372_036_854_775_807 // Long.MAX_VALUE

    // Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14 // Dobro do Float

    // Tipo Caractere
    val char: Char = '?' // Outros exemplos... '1', 'g', ' '

    // Tipo booleano
    val boolean: Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    // Tudo é objeto em kotlin
    println(10.dec())
}