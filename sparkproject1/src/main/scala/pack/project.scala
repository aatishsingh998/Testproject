package pack

import org.apache.spark.sql.SparkSession


object project {
  
  def main(args: Array[String]): Unit = {
    
    println("spark project started")
    
    val spark =SparkSession.builder().appName("project")
                                     .master("local[*]")
                                     .getOrCreate()
   
    val sc =spark.sparkContext
    
    sc.setLogLevel("Error")
    
    import spark.implicits._ 
    
    println("test")
    
    
    
  }
}