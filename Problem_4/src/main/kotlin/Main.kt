fun main(args: Array<String>) {
 /*
rabbits like to throw fun parties, and at their parties,they like to munch on Reese's carrot juice cups.
But not too much of it, or they will feel sick!
A successful rabbits party
should have between 10 and 20 Reese's carrot juice cups unless it is the weekend.
In this case, they need 15 to 25 Reeses carrot juice cups, inclusive.
Write a Kotlin program that reads two values:
the first is the number of Reese's carrot juice cups;
the second is a boolean value that represents whether it is the weekend or not.
Output the boolean value that tells us whether the party is successful or not.
====
Sample Input 1:
5
true
=================
Sample Output 1:
false
=========================
Sample Input 2:
16
false
===========
Sample Output 2:
true

    */
    println("Please Enter the number of Reese's carrot juice cups")
    var num_of_cups = readln().toInt()
    println("Pleas if this day is a weekend enter \"true\", else enter \"false\"")
    var weekend = readln().toBoolean()

    when(weekend){
        true -> println(num_of_cups in 15..25)
        false -> println(num_of_cups in 10 .. 20)
    }
}