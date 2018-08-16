package com.mongodb;

import org.apache.log4j.BasicConfigurator;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class HellowWorldSparkStyle {
    public static void main(String[] args) {

        BasicConfigurator.configure();

        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return "Hello World from Spark Again some times...";
            }
        });
    }
}
