public class person {
    private String name;
    private int age;
    
    public person(String name , int age) { // constructor
        this.name = name;
        this.age = age;
    }
    public person(){
        this.name = "unknown";
        this.age = 999;
    }
    public int getAge() { // getter
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) { // setters
        this.age = age;
    }
    public void intro() {
        System.out.println("i am a person my name is "+ this.name + " and i am "+this.age+" years old");

    }
    //lets use person as a parent/super class
}

