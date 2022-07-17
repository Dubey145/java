import java.util.*;
//importing box class

public class oops{ 
    //this is a class

    public static void main(String[] args) throws Exception{ 
        // this is a method
        //class is a template for the object
        //check class box defined in this folder

        Box cuboid = new Box(20,10,10);
        //cube.length = 10;
        //cube.depth = 10;
        //cube.breadth = 10;
        cuboid.boxName = "THE first cuboid in the world";
        cuboid.color = "blue";
        System.out.println(cuboid.getLength());
        cuboid.desc();
        cuboid.setLength(25);
        cuboid.desc();

        //creating a class object of cube that inherits box

        cube newCube = new cube(265);
        newCube.description();
        //System.out.println(newCube.side); cant access as side is private
       cube secondCube = new cube();
    }
    
}
/*
--The Java Class Library-- 
in java we have a lot of classes available to us in different packages
example String, StringBuilder, System, Math etc 

https://docs.oracle.com/javase/8/docs/api/
*/