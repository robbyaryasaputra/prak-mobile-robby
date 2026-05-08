package com.example.appasikk.Home.pertemuan_2

fun main() {
    println("Hai rekan-rekan...")
    println("Selamat datang ddi bahasa pemograman kotlin")

    println("==================")

    var angka = 15
    println("hasil dari 15 + 10 = ${angka + 10}")

    val nilaiInt = 10000
    val nilaiDouble = 100.003
    val nilaiFloat = 1000.0f

    println("nilaiInt = $nilaiInt")
    println("nilaiDouble = $nilaiDouble")
    println("nilaiFloat = $nilaiFloat")

    println("========= STRING =========")
    val huruf = 'a'
    println("ini adalah pengguna karakter '$huruf'")

    val nilaiString = "mawar"
    println("hallo $nilaiString!\nApa kabar?")

    println("========= KONDISI =========")

    val nilai = 10
    if (nilai > 0)
        println("nilai negatif")
    else {
        if (nilai%2== 0)
            println("nilai genap")
        else
            println("nilai ganjil")
    }

    println("========= Perulangan =========")
    val kampusKu: Array<String> = arrayOf("kampus","politeknik","caltex","Riau")
    for (kampus: String in kampusKu){
        println(kampus)
    }



}