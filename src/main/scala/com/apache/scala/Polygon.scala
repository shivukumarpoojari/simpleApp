package com.apache.scala

class Polygon {
  def area:Double =_

}
object Polygon{
  def main(args: Array[String]): Unit = {
    val poly = new Polygon
    val rect = new Rectangle(20,30)
    val tri = new Triangle(10,20)
    println(rect.area)
    println(tri.area)
    printArea(poly)
  }
  def printArea(p:Polygon): Unit ={
    println(p.area)
  }
}

