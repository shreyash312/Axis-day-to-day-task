class child1:parent1 {

    override var place:String=""
    constructor(name:String):super (name){
        println("$name")
    }

     override fun display() {
    println("i am child 1")
         //super.display() super method calls the parent
    }
}
fun main(){
    var obj=child1("yash")
    obj.display()


}