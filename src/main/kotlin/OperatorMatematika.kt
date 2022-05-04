fun main() {
    val result = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    //augmented assigment
    var total:Int = 0
    val barang1 = 100
//    total = total + barang1
    total += barang1
    val barang2 = 200
//    total = total + barang2
    total += barang2
    val barang3 = 300
//    total = total + barang3
    total += barang3
    println(total)

    //unary operator
    total++
    total--
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}