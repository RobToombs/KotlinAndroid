package functional

import java.io.File

fun main(args: Array<String>) {

    // Reader is only available within this let block
    File("example.txt").bufferedReader().let {
        reader ->
        if(reader.ready()) {
            println(reader.readLine())
        }
    }

    // Alternatively we can use "it" as it is implicitly the reader
    File("example.txt").bufferedReader().let {
        if(it.ready()) {
            println(it.readLine())
        }
    }

    // Working with nullables
    val str: String? = "Kotlin for Android"
    // This will be an error as str could be null
    // we could use the unsafe operator instead: str!!.isNotEmpty()
    //if(str?.isNotEmpty()) {
    //    str?.toLowerCase()
    //}

    //Alternatively we can use let block and if str is null, it wont do this block
    str?.let {
        if(str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}