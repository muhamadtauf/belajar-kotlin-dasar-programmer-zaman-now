fun main(){
    //string satu baris
    var name: String = "eko"
    var last: String = "kurniawan"

    //string lebih satu baris
    var address: String = """
        jalan jlan xxx
        kabupaten xxx
    """.trimIndent()
    var address2: String = """
        |jalan jlan xxx
        |kabupaten xxx
    """.trimMargin()
    var address3: String = """
        >jalan jlan xxx
        >kabupaten xxx
    """.trimMargin(">")
    var address4: String = """
        jalan jlan xxx
        kabupaten xxx
    """

    println(name)
    println(address)
    println(address2)
    println(address3)
    println(address4)

    //menggabungkan string
    //cara yang tidak direkomendasikan
    var fullName: String = name + " " + last
    println(fullName)
    //cara yang direkomendasikan
    var fullname2: String = "$name $last"
    println(fullname2)
    var desc: String = "$fullname2 length = ${fullname2.length}"
    println(desc)

}