import java.awt.SystemColor.text

fun main() {
myArray(arrayOf(1,2,3))
    calculate(23)
    isPalindrome("madam")

}

//number 2
fun myArray(numbers:Array<Int>){
    println(numbers.count())
    println(numbers.sum())

    var average = numbers.sum() / numbers.count()
    println(average)

}
//number 3
fun calculate(num:Int){
    var radius = 3.14159
    var pie = 3.14
    var volume = 4/3 * pie * radius * radius * radius
    println(volume)
}
//number 4
fun isPalindrome(word:String):Boolean{
    var palindrome = "madam"
    if(word == palindrome){
        println(true)
        return true
    }
    else {
        println(false)

    }
    return false
}