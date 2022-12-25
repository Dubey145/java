public class dog extends animal{
    //super keyword will refer to the intermediate parent
    //this will be used to refer to current class data
    String name;
    dog(){
        super();

    }
    public void bark(){
        System.out.println(super.name + " woof ");
        //use super when the base class also has the same vairable name;
    }
    public void eat(){  
        //this is method overriding the base class has a method eat that has been overridden
        //this is the overiding method
        //the return type can be either the same or you can narrow it down
        //the access specifier can only be increased 
        // public>protected>default>private               
        System.out.println("Dog eats Meat");
    }
}
