// Databricks notebook source
//val, var
val variable1: String  = "hello world!"



// COMMAND ----------

var variable1_var : String = "hello worllldd 2"
variable1_var


// COMMAND ----------

var value1 = "hello"

// COMMAND ----------

val value1 : Int = 3
val var_byte : Byte = 126

// COMMAND ----------

val variable1 = "hey"
variable1 = "hey" + "world!"

// COMMAND ----------

var value2 = "hey"
value2 = "hey" + "world!"

// COMMAND ----------

val var_byte :Byte = 126
val val_int : Int =2

// COMMAND ----------

print(f"hello, $val_int")

// COMMAND ----------

//switch statement
var n: Int = 3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("holla found value 3")
  case _  => print("not found")
}

// COMMAND ----------

var a=2
if(a==2){
  print("value 2")
}
else{
  print("no value")
}

// COMMAND ----------

for ( i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh =4
while(wh >= 0){
  print(f"wh,$wh")
  wh=wh-1
}

// COMMAND ----------

/*function def <name>(arguement : <Type>) Return datatype Int :{
  commands
}
*/
def squareInt(x: Int): Int ={
  //squaring the given value
  x*x
}
//calling a function
squareInt(2)


// COMMAND ----------

def noDivisor(x: Float,y: Float): Float ={
  x/y
}
 noDivisor(0.01f,0.11f)

// COMMAND ----------

def primeNumber(a : Int): Unit =
{
  var count : Int = 0
  for(i<- 1 to a)
  {
    if(a%i == 1)
    {
      
      count = count + 1
    
    }
        
  }


println(count)
}
primeNumber(17)

// COMMAND ----------

def funcParameter(x : Double,y : Double) : Double ={
  x/y
  }
funcParameter(1.234d,2.654d)

// COMMAND ----------


def addNumber(variable1 : Double,variable2 : Double,func : (Double,Double) => Double) : Double ={
  func(variable1,variable2)
}
addNumber(2.345,3.234,funcParameter)

// COMMAND ----------

var tup =("hello","goyal",4)
tup._3

// COMMAND ----------

var list1 = List("tushar","goyal")
list1(0)

// COMMAND ----------

var dict = 1 -> "hello"
dict._2


// COMMAND ----------

var list1= List("satya","lakshmi")
var list2= List("sonu","chinnu")
list1 ++ list2

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter ( (x: Int) => x<5 )

// COMMAND ----------

var liststring = List("hey","hello")
liststring.map((x:String) => x.length)

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.reduce( (a: Int, b:Int) => a+b)

// COMMAND ----------

var list2 = List("hey","satya","class","is","boring")
list2.map((a:String) => (a,1))

// COMMAND ----------

var ss : Byte =124
ss.toInt

// COMMAND ----------


