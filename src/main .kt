import javax.sound.sampled.Mixer

fun main(){
    hobbies("Swimming","Cooking","Eating","Singing")
    cities("Mombai","Nairobi","Harare","Seychelles")
    list(4,27,158,98,112,78)
    var sisters = details("Sarah","Shamim","Shaucuen")
    println(sisters.contentToString())

    var total = sumIntArray(arrayOf(6,8,22,34,7))
    println(total)

    var addition = sumIntegers(arrayOf("Hellen",5.0, 65, true, 38, 2.7F))
    println(addition)

   var y = sumNumeric(arrayOf(3,2.5F,"School",20))
    println(y)


}
fun hobbies(a:String,b:String,c:String,d:String){
    var types = arrayOf(a,b,c,d)
    println(types.contentToString())
}
fun cities(townA:String,townB:String,townC:String,townD:String){
    var places = arrayOf(townA,townB, townC, townD)
    for (place in places)
        println(place.capitalize())
}
fun list(a:Int,b:Int,c:Int,d:Int,e:Int,f:Int){
    var numbers = arrayOf(a,b,c,d,e,f)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))

    var order = numbers.sortedArray()
    println(order.contentToString())

}
fun details(name1:String,name2:String,name3:String):Array<String>{
    var sisters = arrayOf(name1,name2,name3)
    return sisters
}
//create a function that takes in an array of integers
//and returns their sum without using the inbuilt .sum() fn
//eg given [1,2,3,4] it returns 10
fun sumIntArray(numbers: Array<Int>): Int{
    var sum = 0
    numbers.forEach { number->
        sum += number
    }
    return sum
}
//create function takes in an array of mixed types
//and sums up the integers only.Returns the sum
fun sumIntegers(mixedArray:Array<Any>):Int{
    var add =0
    mixedArray.forEach{ num ->
        if (num is Int){
            add += num
        }
    }
   return add
}
//create a function that takes in an array of mixed types and sums up all the numeric types .return the sum
//["Helen"]
fun sumNumeric(mixedArray:Array<Any>): Number{
    var sum =0.0
    mixedArray.forEach { x ->
        if (x is Double || x is Int || x is Float) {
            sum += x.toString().toDouble()
        }
    }
    return sum
}



