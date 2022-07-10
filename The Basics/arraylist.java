import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [5]; // made for 5 elements only 
        ArrayList<Integer> list = new ArrayList<>(); // like a vector in cpp with size increasing as per needs
        System.out.println("array length "+list.size());
        // to add elements to array
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.add(1,1000); //the previous value will shift

        list.add(40);
        //if we want to replace 
        list.set(4,2000); //40 replaced with 2000

        System.out.println("array length "+list.size());

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(1);
        System.out.println(list.get(1)); // elements are shifted
    }
}
