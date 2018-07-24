package functional

import java.io.FileReader

fun main(args: Array<String>) {

   // CTRL + N : open up class (Closeable.java)
   // CTRL + H (on selected class) : see hierarchy of classes that implement this class
   // You can use "use" on any of these closeable classes
    // FileReader only available within 'use' block
   FileReader("mayexist.txt").use {
       val str = it.readText()
       println(str)
   }
}