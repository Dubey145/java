import java.util.*;

public class twod_arr {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        //declaring 2d arrays in java
        int [][] arr = new int [2][3]; // 2x3 array
        
        //we can also make arrays of uneven size 
        int [][] arr2 = new int[2][];
        arr2[0] = new int[4];
        arr2[1] = new int[3];

        //array input
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
