public class employee extends person { 
    //an employee will be a person, employee will have all the public methods and the attributes of the person class
    private int id;
    int salary;

    public void SetId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    @Override
    public void intro() {
        super.intro();// this will call the intro methon in the super class, we can use return values to perform operations 
        System.out.println("i am an employee, my name is "+ this.getName() + " and i am "+this.getAge()+" years old");
    }
}
