import java.util.*;

public class array{
    public static void main(String[] args) throws Exception {
        //declaring arrays
        /*
        in cpp we can declare arrays either in the stack or in the heap 
        in java there is just one method, and it creates the array in the heap 
        */
        int [] array = new int[5]; 
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        printer(array);
    }
    public static void printer(int[] arr ) {
        //there is no need to pass the size of the array explicitly 
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //another method to print 
        for(int val: arr) {
            System.out.println(val);
        }
    }
}