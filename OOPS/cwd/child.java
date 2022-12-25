public class child extends newClass {

    //now child inherits an abstract class so we have to provide definition of all the abstract methods
    
    public void rocket() {
        System.out.println("child class will launch rocket");
    }

    public static void main(String[] args) {
        child c1 = new child();
        c1.rocket();
        /*
        IMPORTANT NOTE
        the child class does not provide abstraction, the parent class does
        */
        newClass obj = new child(); // a newClass object holds the reference of a child object
        obj.rocket(); // obj calls rocket but rocket was not defined in newClass 
        //but still the program runs with the rocket method definition of child class
        //this is abstraction, we used a newClass object method by hiding the definition

        /*
         * interfaces provide 100% abstraction
         */

    }    
}

