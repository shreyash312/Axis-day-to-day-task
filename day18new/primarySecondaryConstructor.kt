class primarySecondaryConstructor (c_place:String,c_name: String) {

    var place:String="";
    var company:String=""
    var id:Int=0;

    init {
        company=c_name
        place=c_place

    }

    constructor(id:Int):this(c_place="mysore",c_name="Infy"){
        this.id=id
        println(place)
        println(company)
        println(id)
    }
    constructor(c_place: String,c_name: String,id: Int):this(c_place,c_name){
       this.id=id
        println(place)
        println(company)
        println(id)
    }
}
fun main(){
    var obj=primarySecondaryConstructor(101)
    var obj1=primarySecondaryConstructor("Mumbai","Axis",102)

}