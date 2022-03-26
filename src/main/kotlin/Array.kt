fun main() {
    //array pada kotlin hanya bisa menampung satu jenis type data
    val name: Array<String> = arrayOf("eko", "budi", "joko")
    name.set(0, "rudi")
    println(name[0])

    val nilai: Array<Int> = arrayOf(10, 9, 8)
    println(nilai.get(0))

    //array nullable
    val member: Array<String?> = arrayOfNulls(10)
    member[0] = "eko"
    member[1] = "eko"
    member[2] = "eko"
    member[3] = null
    member[4] = "eko"
    println(member[0])
    println(member.size)
}