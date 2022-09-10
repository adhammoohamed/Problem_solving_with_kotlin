
var first_number : Int? = null
var second_number : Int? = null
var third_number : Int? = null

fun main(args: Array<String>) {
/*
* write a program that reads three integer numbers and prints true
* if the first number lies between the second and third one (inclusive).
* Otherwise, it is to print false.
* The sorting order of the two last can be any.
*
* ======
* sample input
* 40
* 30
* 50
* ==
* sample output
* true
* =============================
* sample input
* 2
* 3
* 4
* ==
* sample output
* false
* */
    get_numbers()
    get_the_result(first_number , second_number , third_number)
}

fun get_numbers(){
    println("Please enter the first number")
    first_number = readln().toIntOrNull()

    while (first_number == null){
        println("You should enter a number")
        println("Please enter the first number")
        first_number = readln().toIntOrNull()
    }

    println("Please enter the second number")
    second_number  = readln().toIntOrNull()

    while (second_number == null){
        println("You should enter a number")
        println("Please enter the second number")
        second_number = readln().toInt()
    }

    println("Please enter the third number")
    third_number = readln().toIntOrNull()

    while (third_number == null){
        println("You should enter a number")
        println("Please enter the third number")
        third_number = readln().toInt()
    }
}

fun get_the_result(num1 : Int? , num2 : Int? , num3 : Int?){
    if (num1!! > num2!! && num2!! < num3!!){
        println(true)
    }else {
        println(false)
    }
}
