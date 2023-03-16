// Often when you work with arrays, you need to loop through all of the elements
// To loop through array elements, use the for loop together with the in operator

//Unlike Java and other programming languages, there is no traditional for loop in Kotlin.

//In Kotlin, the for loop is used to loop through arrays, ranges, and other things that contains a countable number of values.

//You will learn more about ranges in the next chapter - which will create a range of values

fun main(){
    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }
}