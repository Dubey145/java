public class Box {
    private int length;
    private int breadth;
    private int depth;
    String boxName;
    String color;

    //adding methods

    public void desc(){
        System.out.println("i am " + this.boxName + "  and i am " + this.color + " with length " + this.length ); 
    }
    //constructor
    
    public Box(int length, int breadth, int depth){
        this.length = length;
        this.depth = depth;
        this.boxName = null;
        this.color = null;
        this.breadth = breadth;
        //System.out.println("called from cube");
    }
    //private members are updated with getters and setters
    //getter 
    public int getLength(){
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
