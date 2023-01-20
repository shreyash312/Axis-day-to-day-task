class demoConstructor (){ //class along with paranthesis is primary constructor
    var name:String="";
    var age:Int=0;
    val pie=3.14;

    init { //body of primary constructor using init
        name="Yash"
        age=22
        println("Your name is $name and age is $age")
    }
}

fun main(){
    var obj=demoConstructor();
}