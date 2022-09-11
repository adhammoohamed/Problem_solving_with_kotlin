fun main(args: Array<String>) {
/*
Write a program that reads one word and prints it repeatedly as many times as there are letters in it. Use string templates.
Input: a single string.
Output: a single string. Use the following template:
"N repetitions of the word string: ...", where N is the number of letters in the entered word,
string is the entered string, and instead of ... there should be the word repetitions.
Sample Input 1:
four
Sample Output 1:
4 repetitions of the word four: fourfourfour four
Sample Input 2:
*/

    println("Please Enter word")
    var word : String = readln()!!.toString()
    var repetition : Int = word.length
    print("$repetition repetitions of the word $word : ")
    for (i in 1..repetition){
        print("$word ")
    }
}