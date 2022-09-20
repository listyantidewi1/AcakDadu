package Dadu

class Dadu(val jmlSisi: Int, val warna:String) { //class-abstract-blueprint

    fun putar():Int{ //kata kerja-func / method
        val angkaAcak = (1..jmlSisi).random()
        return angkaAcak
    }
}

fun main(){
    val daduFajrul = Dadu(9, "black") //object
    println("Acakan dadu Fajrul yang berwarna " + daduFajrul.warna + " adalah " + daduFajrul.putar())

    val daduIkhsan = Dadu(20, "pink") //object
    println("Acakan dadu Ikhsan yang berwarna " + daduIkhsan.warna + " adalah "+ daduIkhsan.putar())

    val daduBrendha = Dadu(100, "blue") //object
    println("Acakan dadu Brendha yang berwarna "+ daduBrendha.warna + " adalah " +daduBrendha.putar())
}