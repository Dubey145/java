//hashmaps are used to store key value pairs 
//import java.util.HashMap;

import java.util.*;
public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> gameStats = new HashMap<String, Integer>();
        //storing values like <username, highscore>
        gameStats.put("user1", 1);
        gameStats.put("user2", 2);
        gameStats.put("user3", 3);
        gameStats.put("user4", 4);

        System.out.println(gameStats);  
        
        //accessing elements  
        System.out.println(gameStats.get("user1")); //pass the key and get the value
        //gameStats.clear(); empties the hashmap
        gameStats.remove("user1");
        System.out.println(gameStats);
        System.out.println(gameStats.size());

        //for each loops
        //item will hold the values 
        for(String item : gameStats.keySet()) {
            System.out.println(item);
        }
        //placeholder : what are you iterating through?
        for(int item : gameStats.values()){
            System.out.println(item);
        }

        for(String item : gameStats.keySet()) {
            System.out.println("key: " +item + " value: " + gameStats.get(item));
        }
    }
    //we cannot duplicate keys , values can be duplicated 
    
}