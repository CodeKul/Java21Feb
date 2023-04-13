package collectionframework

import java.util.*

    fun main(args: Array<String>) {
        val vector1 = Vector<Int>()
        vector1.add(10)
        vector1.add(20)
        vector1.add(30)
        vector1.add(40)
        vector1.add(40)
        vector1.add(40)
        println(vector1)
        println(vector1.capacity())
    }
