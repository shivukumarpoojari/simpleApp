package com.apache.scala

class Triangle(width:Double, height:Double) extends Polygon {
  override def area: Double = width*height/2
}
