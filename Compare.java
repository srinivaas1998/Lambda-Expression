//To check whether the string contains only alphabet using Lambda Expression

public interface Compare {
  
  void onlyAlphabet(String str);

}
  
class TestComparison{    
    public static void main(String[] args) 
    { 
   
        Compare c=(String str)->{
        	if((str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter))) {
        		System.out.println("True");
        		
        	}
        	else {
        		System.out.println("False");
        	}
        };
        String str1 = "JavaScript"; 
        System.out.println(str1);
        c.onlyAlphabet(str1) ;
   
        String str2 = "One2Three"; 
        System.out.println(str2); 
        c.onlyAlphabet(str2); 
    }

	 
} 


//Output
/*
JavaScript
True
One2Three
False
*/
