// Command  javap java.lang.IO
// Compiled from "IO.java"
// public final class java.lang.IO {
//   public static void println(java.lang.Object);
//   public static void println();
//   public static void print(java.lang.Object);
//   public static java.lang.String readln();
//   public static java.lang.String readln(java.lang.String);
//   static synchronized java.io.BufferedReader reader();
// }
import static java.lang.IO.*; // It is use to import static method of IO class
void main(){
  IO.println("Hello world"); // TO print any thing in Console
  String userInput = IO.readln(); // TO read any thing from Console
  println(userInput);
}