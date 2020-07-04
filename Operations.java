// Lambda Expression to perform multiple operation in the same class
public class Operations {

 
 interface FuncInter1 
 { 
     int operation(int a, int b); 
 } 
 interface FuncInter2 
 { 
     void sayMessage(String message); 
 } 
 private int operate(int a, int b, FuncInter1 fobj) 
 { 
     return fobj.operation(a, b); 
 } 

 public static void main(String[] args) 
 { 
     FuncInter1 add = (int x, int y) -> x + y; 
     FuncInter1 multiply = (int x, int y) -> x * y; 
     Operations obj = new Operations(); 
     System.out.println("Addition is " + obj.operate(6, 3, add)); 
     System.out.println("Multiplication is " + obj.operate(6, 3, multiply)); 

     FuncInter2 fobj = message ->System.out.println("Hello "+ message); 
     fobj.sayMessage("Ram"); 
 } 
} 


//Output
/*
Addition is 9
Multiplication is 18
Hello Ram
*/
