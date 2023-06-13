package org.example;

import org.apache.spark.sql.SparkSession;

/**
 * <pre>
 * @Description:
 *
 * </pre>
 *
 * @version v1.0
 * @ClassName: SparkDemo
 */
public class Main {


  public static void main(String[] args) {

    System.out.println("Testing 1...2...3..");

    SparkSession sparkSession = SparkSession.builder()
        .getOrCreate();

    if (sparkSession != null && sparkSession.conf() !=null) {
      System.out.println(sparkSession.conf().getAll());
    }
  }
}