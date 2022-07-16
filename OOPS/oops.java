import java.util.*;
//importing box class
 
public class oops{ 
    //this is a class

    public static void main(String[] args) throws Exception{ 
        // this is a method
        //class is a template for the object
        //check class box defined in this folder

        Box cube = new Box();
        cube.length = 10;
        cube.depth = 10;
        cube.breadth = 10;
        cube.boxName = "first cube in the world";
        cube.color = "white";
        System.out.println(cube.length);

    }
    
}