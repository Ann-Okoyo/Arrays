fun main() {
    learners()
    area()
    digits()
    details("Ann" ,"Masian" ,"Snider")

}


  fun learners (){
  val students = arrayOf("Ann", "Angela","Kate" ,"Burnice")
  println(students.contentToString ())
}

    fun area (){
   val cities = arrayOf("harare" ,"mumbai","Dodoma","jakarta")
     val capitalised=cities.map{it.capitalize()}.toTypedArray()
    println(capitalised .contentToString())

    }

    fun digits(){
    val numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
     val sum=numbers[2] + numbers[5]
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

    }
    fun details( name1:String ,name2:String,name3:String):Array<String>{
     return arrayOf(name1,name2,name3)



}










