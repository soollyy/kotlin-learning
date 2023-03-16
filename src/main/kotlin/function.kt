//A function is a block of code which only runs when it is called.

//You can pass data, known as parameters, into a function.

//Functions are used to perform certain actions, and they are also known as methods.

//println() is a function. It is used to output/print text to the screen

//CREATE YOUR OWN FUNCTION

//fun myFunction() {
//    println("I just got executed!")
//}
//
////Now that you have created a function, you can execute it by calling it.
//
////To call a function in Kotlin, write the name of the function followed by two parantheses ().
//
////In the following example, myFunction() will print some text (the action), when it is called
//
//fun main() {
//    myFunction() // Call myFunction
//}





//FUNCTION PARAMETERS

/* Information can be passed to functions as parameter. Parameters are specified after the function name,
inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
Just note that you must specify the type of each parameter (Int, String, etc). The following example has a function
that takes a String called fname as parameter. When the function is called, we pass along a first name, which is used
inside the function to print the full name  */

//fun myFunction(fname: String) {
//    println(fname + " Doe")
//}
//
//fun main() {
//    myFunction("John")
//    myFunction("Jane")
//    myFunction("George")
//}
//
//// John Doe
//// Jane Doe
//// George Doe






//MULTIPLE PARAMETERS

//fun myFunction(fname: String, age: Int) {
//    println(fname + " is " + age)
//}
//
//fun main() {
//    myFunction("John", 35)
//    myFunction("Jane", 32)
//    myFunction("George", 15)
//}
//
//// John is 35
//// Jane is 32
//// George is 15







//RETURN VALUES

/*In the examples above, we used functions to output a value. In the following example, we will use a function to
return a value and assign it to a variable.*/

//To return a value, use the return keyword, and specify the return type after the function's parantheses (Int in this example)

//fun myFunction(x: Int): Int {
//    return (x + 5)
//}
//
//fun main() {
//    var result = myFunction(3)
//    println(result)
//}
//
//// 8 (3 + 5)






//USING TWO PARAMETERS

//A function with two Int parameters, and Int return type:

//fun myFunction(x: Int, y: Int): Int {
//    return (x + y)
//}
//
//fun main() {
//    var result = myFunction(3, 5)
//    println(result)
//}
//
//// 8 (3 + 5)





//SHORTER SYNTAX FOR RETURN VALUES

/*There is also a shorter syntax for returning values.
You can use the = operator instead of return without specifying the return type.
Kotlin is smart enough to automatically find out what it is
 */

fun myFunction(x: Int, y: Int) = x + y

fun main() {
    var result = myFunction(3, 5)
    println(result)
}

// 8 (3 + 5)