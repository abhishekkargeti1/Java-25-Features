// Now super should  not be the first statement in the constructor of child class.
// Before Super we cannot user this statement 
class Parent{
 Parent(){
     IO.println("Parent Constructor");
 }   
}
public class Flexible_Constructor extends Parent{
    Flexible_Constructor (){
        
        IO.println("Child Constructor");  // Prologue Statement
        super(); 
        IO.println("Hello World");        // Epilogue Statement
    }
    public static void main(String[] args){
        Flexible_Constructor fc = new Flexible_Constructor();
    }
}
