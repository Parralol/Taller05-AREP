package clase.arep;

import static spark.Spark.*;

public class SparkWebServer {
    public static void main(String... args){
        port(getPort());
        get("/hello", (req,res) -> "Hello Docker!" );
        get("/", (req,res) -> "Hello Docker!" );
        get("/calculadora", (req,res) -> "");
  }



private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
