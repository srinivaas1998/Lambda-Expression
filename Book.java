//Using methodreference as Lambda

interface Book{
    public void bookName(String str);
} 
public class Book_Class{
    public static void main(String[] args){
        Book obj = System.out::println; // Method Reference
        obj.bookName("Alita"); 
    }
}
//Output:  Alita
