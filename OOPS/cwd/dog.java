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
}
