package com.spark.core

object LoadCreditCardData {
  def main(args: Array[String]): Unit = {
    val masterOfCluster = args(0)
    val inputPath = args(1)
//    val sparkSession = SparkSession
//      .builder()
//      .master(masterOfCluster)
//      .appName("Load Credit card data")
//      .config("spark.some.config.option", "some-value")
//      .getOrCreate()
//
//
//    val transactionRdd = sparkSession.sparkContext.textFile(inputPath)
//
//    val result = transactionRdd.collect().toList
//
//    /*just print 10 records*/
//    result.take(10).foreach(println)
  }
}
  }
}
