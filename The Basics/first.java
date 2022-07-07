//java is cross platform but slower than cpp 
//in cpp the output file is an exe file that has machine code for the program to run on a specific operating system
// but java outputs a class file which is code in intermediate language then JVM (java virtual machine) starts compiling the class file at runtime to execute it according to the OS so it's cross platform but slower than cpp

//JVM is the program that translates the java output file to machine code for the OS 

//JDK is a toolkit use for programming in java eg. javac (java compiler) 

//developer machine will have JDK and user machine must have JVM to run java programs
import java.util.*;

//#include is import

public class first{ // public class name must be file name 
    public static void main(String[] args) throws Exception {

        //to take input we need a scanner class object
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // int input
        

        String s = sc.nextLine(); // string input//next line is like getline(), next is cin>>

        //to print
        System.out.println("your integer :"+n);
        System.out.println("your string :"+s); 

        // all loops, for while do while are the same and work in the same way
        //statements like break, continue, switch are also the same 
        // if, else, if-else are also the same
    }
}
