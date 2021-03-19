import java.util.*

fun main(){
    random("Easter", "music", "10", "family")
    gramatical()
    add()
    var names = name("Kalunde", "Mwende", "Becky")
    println(Arrays.toString(names))



}
fun random(w: String, x:String, y:String, z:String){
    var combine = arrayOf("$w", "$x", "$y", "$z")
    println(Arrays.toString(combine))
}
fun gramatical() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakatar")
    for (city in cities) {
        println(city.capitalize())
    }
}
fun add() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.get(1)+numbers.get(4))


    println(numbers.lastIndex -1)


    for ( numbers in numbers.sorted()){
    println(numbers)}
};
fun name(f:String, j: String, k:String): Array<String> {
    var line = arrayOf("$f","$j","$k")

    return (line)
}
