package com.apache.scala

class Rectangle(var width:Double,var height:Double ) extends Polygon {
  override def area: Double = width*height

}
class Rect with Shape{
  color("Red")
}
