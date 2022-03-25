fun main(){
    var age: Byte = 20
    var age2: Int = 200
    var age3: Short = 200
    var age4: Long = 200L
    println(age2)

    //floating point
    var sample: Float = 10.10F
    var sample2: Double = 20.20
    println(sample2)

    //literals
    var decimalLiteral: Int = 100
    var hexadecimalLieral: Int = 0xFF
    var binaryLiteral: Int = 0b101010
    println(binaryLiteral)
    println(hexadecimalLieral)

    //underscore in number
    //pada tipe data number lain juga bisa
    var price: Long = 9_000_000_000L
    println(price)

    //conversion
    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binaryLiteral.toDouble()
    println(doubleBinary)
}