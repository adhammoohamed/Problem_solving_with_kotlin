var arr : ArrayList<String> = ArrayList<String>()


fun main(args: Array<String>) {
/*
* Write a program that reads two strings and outputs them in reverse order,
* each a new line
*
* sample input :
* Kotlin
* language
* ================
* sample output :
* language
* kotlin
* */

    add_strings()
    print_strings()
}

fun add_strings(){
    while (true){
        println("Please enter the string ,")
        println("and if u wanna stop entering press the Enter button in ur keyboard")
        var input = readln()
         if (input.isEmpty())break

        arr.add(input)
        }
    }

fun print_strings(){
    for (i in arr.lastIndex downTo 0){
        println(arr.get(i))
    }
}