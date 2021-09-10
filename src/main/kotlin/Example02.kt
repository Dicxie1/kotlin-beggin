/***
 * @author Dicxie Madrigal Brack
 * program that use two variable for add and display the result
 */
import java.util.Scanner;
fun main(args:Array<String>){
    //declare three variable
    val input = Scanner(System.`in`);
    var a: Int = 20;
    var b: Int = 10;
    var result: Int;
    //entrada por teclado
    a = input.nextInt();
    //add value of the variable a + b and sort in result
    result = b + a;
    print("El resultado: " + result)
}