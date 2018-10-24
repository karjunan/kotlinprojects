package com.cls

interface Signatory {

    fun sign()
}

class Person(val name:String,var lastName:String) : Signatory {

    init {
        println("Started Init")
    }

    override fun sign() = println("Hello dude "+ name + " ," + lastName+ " signed the doc")

    companion object {
        fun new() {
            var list : MutableList<String> = ArrayList()
            list.add("krishna")
            list.add("krishna")
            for (s in list) {
                println(s)
            }
        }
    }

}