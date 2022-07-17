public class cube extends Box {
    private int side;
   
    public cube(int side) {
        //in java we cannot inherit constructors
        super(side,side,side); // because cube inherits box we have to pass parameters to its constructors and we do that by using constructor
        System.out.println("cube constructor with parameter" );
        this.side = side;     
        //if we pass a parameter, this constructor will be called   
    }   

    //overriding a constructor
    public cube(){
        super(0,0,0);
        System.out.println("cube constructor without parameter");
        this.side = 0;
    }
    public void description()
        {
            System.out.println("i am a cube of side " + this.side);
        }

}
