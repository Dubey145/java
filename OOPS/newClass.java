abstract public class newClass {

    public void cal(){
        System.out.println("hello i calculate");
        //this is a concrete method - with body and declaration
    }

    public abstract void rocket(); // but now the class will also have to be abstract
    //WE CANNOT CREATE AN OBJECT OF THE ABSTRACT CLASS
    //the inherited class will implement the abstract method
}
