fun main(){
    hobbies(arrayOf("Swimming","Cooking","Reading","Studying"))
    cities()
    list()
    var x =details(arrayOf("Jack","Peter","Casey"))
    println(x)

}
fun hobbies(types:Array<String>){
    println(types.contentToString())
}
fun cities(){
    var places = arrayOf("harare","mombai","dodoma","jakarta")
    for (place in places)
        println(place.capitalize())
}
fun list(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))

    var integers = numbers.sortedArray()
    println(integers.contentToString())

}
fun details(names:Array<String>):String{
    var lastname = names.contentToString()
    return lastname
}

