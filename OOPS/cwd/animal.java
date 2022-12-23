public class animal {
    String name;
    String color;
    String type;

    animal(){
        //sub class will use super() to call base class constructor
        //we can even pass parameters
        //super must be the first line of the base class constructor
    }
    public void details(){
        System.out.println(name + " " + color + " " + type);
    }
}
