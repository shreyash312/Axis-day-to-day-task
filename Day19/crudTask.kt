import java.sql.*
import kotlin.system.exitProcess

class crudTask {
    var conn: Connection?=null;
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            println("Successfully connected to mysql connector jar file")
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system","root","jadhavS")
            if(conn!=null){
                println("connection done with database")
            }
            else
            {
                println("failed to connecting database")
            }
        }
        catch (e: SQLException){
            println(e)
            println("Failed to connect with mysql.connector jar file")
        }

    }

    fun createTable(){
        var prepareStat:PreparedStatement?=null
        var sql="create table student(id int not null auto_increment,name varchar(255),place varchar(255),primary key(id));"
       try {
           prepareStat=conn!!.prepareStatement(sql)
           var status=prepareStat.executeUpdate()
           if(status==0){
               println("table is created")
           }else{
               println("Error in creating table")
           }
       }catch (e:SQLException){
           println(e)
       }
    }
    fun insertData(){
        var prepareStat1:PreparedStatement?=null
        var sql1="insert into student(name,place) values(?,?)"
        try {
            prepareStat1=conn!!.prepareStatement(sql1)
            println("Enter Name: ")
            prepareStat1.setString(1,readLine())
            println("Enter Place: ")
            prepareStat1.setString(2, readLine())
            var status=prepareStat1.executeUpdate()
            if(status>0){
                println("Data inserted")
            }else{
                println("Error in inserting data")
            }
        }catch (e:SQLException){
            println(e)
        }
    }

    fun searchData(){
        var prepareStat2:PreparedStatement?=null

        println("Enter name to search: ")
        var searchName=readLine()
        var sql2="select * from student where name='$searchName';"
        var res: ResultSet?=null
        try {
            prepareStat2=conn!!.prepareStatement(sql2)
            var res=prepareStat2.executeQuery()
            while (res!!.next()){
                println( res.getInt("id"))
                println( res.getString("name"))
                println( res.getString("place"))
            }
        }catch (e:SQLException){
            println(e)
        }
    }
}
fun main(){
    var crudObj=crudTask()
    crudObj.createConnection()
    while (true){
        println("1: Create table")
        println("2: Insert Data")
        println("3: Search data")
        println("4: Exit")
        println("Enter your choice: ")
        var ch= readLine()!!.toInt()

        when(ch){
            1 -> crudObj.createTable()
            2 -> crudObj.insertData()
            3 -> crudObj.searchData()

            4 -> exitProcess(1)
        }

    }
}