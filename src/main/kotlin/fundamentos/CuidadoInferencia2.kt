package fundamentos

fun main() {
    // var a: Double = 1 - erro de tipo
    var a: Double = 1.0
    var b = 2

    // Só funciona se a for Double - fortemente tipada.
    a = 2.3

    print(a + b)
}