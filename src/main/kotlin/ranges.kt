//With the for loop, you can also create ranges of values with ".."

//Print the whole alphabet

//fun main(){
//    for (chars in 'a'..'x') {
//        println(chars)
//    }
//}

//You can also create ranges of numbers

//fun main(){
//    for (nums in 5..15) {
//        println(nums)
//    }
//}

//check if a value exists
//You can also use the in operator to check if a value exists in a range

//fun main(){
//    val nums = arrayOf(2, 4, 6, 8)
//    if (2 in nums) {
//        println("It exists!")
//    } else {
//        println("It does not exist.")
//    }
//}

//fun main() {
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    if ("mercedes" in cars) {
//        println("It exists!")
//    } else {
//        println("It does not exist.")
//    }
//}

//break a range
//fun main(){
//    for (nums in 5..15) {
//        if (nums == 10) {
//            break
//        }
//        println(nums)
//    }
//}
//
//continue a range
fun main(){
    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }
}