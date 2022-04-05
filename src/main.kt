fun main() {
    printName("Amekwi")
    var result= getRemainder(8,3)
    println(result)
    var sum= sum(3,6,4,9)
    println(sum)
    printfact("strength")

}





fun printName(name: String){
    println("who is " + " " + name)



}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus =num1 % num2
    return modulus
}
fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum =a+b+c+d
    return sum
}
fun printfact(fact:String){
    println("God is my" + " " + fact)
}