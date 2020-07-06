//Method Referencing - Lambda Expression

interface Finder{
    public String Concatinate(String s1,String s2);
}
public class MyClass {
    public static String doConcatinate(String s1, String s2){
        return s1+s2;
    }


        public static void main(String[] args){
            Finder finder = MyClass::doConcatinate;
            System.out.println(finder.Concatinate("abcd","abcd"));
    }
}
//Output- abcdabcd
