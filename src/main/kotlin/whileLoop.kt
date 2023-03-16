//fun main(){
//    var i = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }
//}
//
////break
//fun main(){
//    var i = 0
//    while (i < 10) {
//        println(i)
//        i++
//        if (i == 4) {
//            break
//        }
//    }
//}

//continue
//fun main(){
//    var i = 0
//    while (i < 10) {
//        if (i == 8) {
//            i++
//            continue
//        }
//        println(i)
//        i++
//    }
//}

//change array element
//fun main(){
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    cars[0] = "Opel"
//    println(cars[0])
//// Now outputs Opel instead of Volvo
//}

//fun main(){
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    println(cars.size)
//// Outputs 4
//}

//check if element array exists
//You can use the in operator to check if an element exists in an array
//fun main(){
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    if ("Volvo" in cars) {
//        println("It exists!")
//    } else {
//        println("It does not exist.")
//    }
//}

//loop through an array
fun main(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
}