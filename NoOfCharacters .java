import java.util.*;
class NoOfCharacters { 
    static final int MAX_CHAR = 256; 
  
    static void getChar(String str) 
    { 
   
        int count[] = new int[MAX_CHAR]; 
  
        int len = str.length(); 
  
      
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int a = 0; 
            for (int j = 0; j <= i; j++) { 
  
                
                if (str.charAt(i) == ch[j])  
                    a++;                 
            } 
  
            if (a == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        String str = "ZAHEER AHMAD";
        getChar(str); 
    } 
} 