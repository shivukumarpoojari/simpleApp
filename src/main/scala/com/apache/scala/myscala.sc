val x={
  val a:Int=500;
  val b:Int=200;
  a+b;
}

val name="mark";
val age=18;
println(s"$name is $age");
println(f"$name%s is $age%d ")
def math(x:Int, y:Int, f:(Double,Double)=> Double): Double =f(x,y)

val add = math(10,20,_+_)
math(10,10,_*_)

def sum(a:Int, b:Int, f:(Int,Int)=>Int)=f(a,b)
val add = sum(100,200,_+_)
val sub = sum(200,100,_-_)

val str ="wstfyuiuhiunnubyuvtyvy7uhuygyutftyut"
str.split("u")

val tup = (1,2,4,"one","two",("hello",("hi","shivu")))
tup._6._2._2


import scala.util.Random

val arr = Array(1,2,3,4,5,6)
arr.map(x => (x*5))
arr.map(_*5)
arr.map(x=> (x, x*5,x+100))
