fun main(args: Array<String>) {
/*
* Write a program that reads five words from the standard input and outputs the words in one line.
* In the output the words should be separated by a single space.
* =======
* sample input
* never
* give
* up
* =======================
* sample output
*
* never give up
* */

    println("Please enter five words")
    var words : List<String> = List(5 ){ readln().toString() }
    words.forEach{ print("$it ") }



}