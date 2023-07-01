package pack

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark.SparkContext
import java.security.cert.X509Certificate
import javax.net.ssl._
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils
import scala.io.Source
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._
import scala.io._
import org.apache.spark.sql.functions._



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