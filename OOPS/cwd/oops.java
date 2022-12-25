public class oops {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "student";
        s1.id = 1;
        s1.schoolName = "school";
        s1.showDetails();
        
        student s2 = new student();
        s2.name = "misti";
        s2.schoolName = "moti";
        s2.id = 999;

        s2.showDetails();

        student s3 = new student(-1,"default","defaultSchool");//actual parameters
        s3.showDetails();

        s1.study("maths");
        
        dog d1 = new dog();
        d1.color = "brown";

        d1.name = "doggie";

        d1.type = "mammal";
        d1.details();

        d1.bark();
        d1.eat();

        /*
            Encapsulation 
            wrapping data members and the methods that work on them together
            
            Abstraction :
            Hiding of data
            showing whats relevant and hiding internal details 
            
            in Java we can use interfaces for 100% abstraction (COMPLETE)
            abstract classes can also they provide 0 - 100% abstraction 

            abstract methods
            a function that only has declation 
             public void calculate();
            we also have to declate it as abstract
            
            abstract public void calculate();
            
        */        


    }
    
}

