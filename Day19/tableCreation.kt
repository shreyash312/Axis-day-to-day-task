import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException
import java.sql.Statement

class tableCreation {
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
        var prestate:PreparedStatement?=null
        var sql="create table demoThree(id int not null auto_increment,name varchar(255),age int not null,primary key(id));"
        try {
            prestate=conn!!.prepareStatement(sql)
            var status=prestate.executeUpdate()
            println(status)
            if(status==0){
                println("table is created")
            }
            else{
                println("Table not created")
            }
        }catch (e:SQLException)
        {
            println(e)
        }
    }

    fun createTableusingStatement(){
        var stmt:Statement?=null
        var sql="create table demoFour(id int not null auto_increment,name varchar(255),age int not null,primary key(id));"
        try {
            stmt=conn!!.createStatement()
            stmt.execute(sql)
            println("tbl created")
        }catch (e:SQLException){
            println(e)
        }
    }

    fun insertIntoTbl(){
        var preStat:PreparedStatement?=null
        var sql="insert into demo(name,age) values(?,?)"
        try {
            preStat=conn!!.prepareStatement(sql)
            println("Enter name: ")
            preStat.setString(1, readLine())
            println("Enter age: ")
            preStat.setInt(2, readLine()!!.toInt())
            var status=preStat.executeUpdate()
            println(status)
            if(status>0){
                println("Data inserted...")
            }
        }catch (e:SQLException){
            println(e)
        }
    }

    fun updateTbl(){
        var preStat:PreparedStatement?=null
        var sql ="update demo SET name=? where id=?"
        try {
            preStat=conn!!.prepareStatement(sql)
            var name= readLine()
            preStat.setString(1,name)
            var id= readLine()!!.toInt()
            preStat.setInt(2,id)
            var status=preStat.executeUpdate()
            println(status)
            if(status>0){
                println("table is updated")
            }
        }catch (e:Exception){
            println(e)
        }
    }

    fun deleteData(){
        var preStat:PreparedStatement?=null
        var sql ="DELETE FROM demo where id=?"
        try {
            preStat=conn!!.prepareStatement(sql)
            var id= readLine()!!.toInt()
            preStat.setInt(1,id)
            var status=preStat.executeUpdate()
            if(status>0){
                println("Data is deleted")
            }
        }catch (e:SQLException){
            println(e)
        }
    }
    fun dropTbl(){
        var preStat:PreparedStatement?=null
        var sql="DROP TABLE demo"
        try {
            preStat=conn!!.prepareStatement(sql)
            var status=preStat.executeUpdate()
            if(status==0){
                println("Tbl is dropped")
            }
        }catch (e:SQLException){
            println(e)
        }
    }

    fun truncateTbl(){
        var preStat:PreparedStatement?=null
        var sql="TRUNCATE TABLE demo"
        try {
            preStat=conn!!.prepareStatement(sql)
            var status=preStat.executeUpdate()
            if(status==0){
                println("Tbl is truncated")
            }
        }catch (e:SQLException){
            println(e)
        }
    }

}
fun main()
{
    var tbl=tableCreation()
    tbl.createConnection()
    tbl.createTable()
    tbl.insertIntoTbl()
    tbl.createTableusingStatement()
    tbl.updateTbl()
    tbl.deleteData()
    tbl.truncateTbl()
    tbl.dropTbl()
}