/***
 * @author: Dicxie Madrigal Brack
 * the basic struct of a programas in Kotlin
 * this progras disply "Hellow, World" in the console
 */
fun main(args : Array<String>){
    print("Hello, World " + add(3, 4));
}

fun add(x : Int, y : Int) : Int{
    return x + y;
}