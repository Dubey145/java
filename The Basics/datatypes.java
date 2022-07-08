import java.util.*;

public class datatypes{
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //data types - for numbers and chars 
        /*
            byte -- 1 byte --
            short -- 2 byte
            int -- 4 byte -- 
            long -- 8 byte

            char - 2bytes 

            float - 4 bytes
            double - 8 bytes 
            boolean - 1 byte 

            ****there are no pointers in java****
            the swapping code in c++, that method will not work in java, elements are sent by value 
            if we actually want to swap we will have to declare variables as GLOBAL
        */
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("swapping values");

        swap();

        System.out.println("a = " + a);
        System.out.println("b = " + b);    
    }
    public static void swap(){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
}