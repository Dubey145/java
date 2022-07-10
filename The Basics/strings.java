import java.util.*;

public class strings {
    public static void main(String[] args) throws Exception {
        String s = "hello world"; // s in stack hello world in heap 
        System.out.println(s);
        Scanner sc = new Scanner(System.in);

        //s = sc.nextLine(); // input till first space only
        //System.out.println(s);

        String s2;
        //System.out.println("enter s2");
        s2 = sc.nextLine(); // takes the complete input 
        System.out.println(s2);

        //some important functions 
        //length 
        System.out.println(s2.length()); // in array length is a data-member so we call it like array.length but in strings it is a function so we use s2.length()
        
        //accessing a character
        System.out.println(s2.charAt(0));
        //we cannot change the value of a character there is no setChar() 
        //strings are immutable

        //substrings - takes out a piece of the string form the start to end-1 chars
        System.out.println(s2.substring(1, 3)); // we can pass just one parameter and that will be taken as the start index
        
        //printing all substrings
        for(int i = 0; i < s2.length(); i++){
            for(int j = i+1; j<=s2.length(); j++){
                System.out.println(s2.substring(i,j));
            }
        }
        
        //adding 2 strings
        String s1 = "hello";
        s2 = "world";
        String s3 = s1+" "+s2;
        System.out.println(s3);
    
        //split function 
        String s4 = "abc def ghi jkl";
        String [] parts = s4.split(" ");
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }
    }    
}
