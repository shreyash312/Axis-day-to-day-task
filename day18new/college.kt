open class college {

    var collegeName:String="VPKBIET"
    var collegePlace:String="MIDC"

    inner class branch{
        var branchName:String="IT"
        var branchPlace:String="Delhi"
    }
    inner class student{
        var studentName:String="Yash"
        var studentPlace:String="Mumbai"
    }
}

fun main(){
    var clg=college();
    var output:String=clg.student().studentName;
    var branchoutput:String=clg.branch().branchName;
    println("Student name is $output & Branch is $branchoutput ")

}