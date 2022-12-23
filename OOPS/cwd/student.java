class student{
    //instance variables
    public int id;
    String name;
    String schoolName;

    //methods and functions
    public void study(){
        //this("java");
        System.out.println(this.name + " is studying");
        //we can even call another constructor with 'this' but it must be the first line in ths constructor
    }
    //this keyword refers to the current invoking object

    // public double study(){
        //return type does not matter in overloading
    // }

    public void study(String subject){
        System.out.println(this.name + " is studying " + subject);
    }

    public void showDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(schoolName);
    }

    student(){
        //constructor
        //or write public student()
        id = -1;
        name = "StudentName";
        schoolName = "StudentSchoolName";
    }

    student(int id, String name, String schoolName){ 
        // formal parameters
        //constructor with parameter
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }
    /*
    multiple constructors were made so this is constructor overloading 
    same can be done with methods with the same name but the arguments must be different
    
    to overload we can
    - have different number of arguments
    - change the type of arguments
    - change the order of arguments
    the return type does not matter in overloading
    */

    /*
     * Inheritance 
     * a mechanism where a class is allowed to inherit features from another clas
     * eg. dog can inherit from animal
     * It is done with the extends keyword
     * class dog extends animal{
     *  
     *  }
     * parent class is also called base or super class
     * there is single, multiple, multi-level, Hierarchial, Multiple
     * In java multiple inheritance - one child has many base class, this is not possible in classes but it is possible with interfaces
     * Hybrid inheritance is a combination, but multiple type must not be included
     * cyclic Inheritance
     * class A extends A or A extends B and B extends A this forms a loop this is not supported in java
     */
}
