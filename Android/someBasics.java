//creating main method 
public class someBasics
    {
        public static void main (String[] args){ // this is a method 
            System.out.println("just another java program");
            String name = "heyheyeyeyey";
            System.out.println(name + " bruhhh");
            
            String str = "hehheheheh ";
            int i = 202013;
            long l = 243142343453465L; // L specifies the integer as long

            float f = 45.9f;
            double d = 12.2212d; //double is more precise than float

            //byte holds 8 bits
            //short holds 16 bits
            byte  mybyte = 120; // 127 is the limit, 128 will be error
            short myShort = 129;
            
            //char holds one charachter - 16 bits;
            char A = 'A'; // - char will be stored in ''  and strings in " "
            boolean b = false; 


            //casting 
            double a = 2022;
            int be = (int) a;
            
            //Methods - enclose body that operates and returns and results 
            showName("dubey");
            add(12,22);
            System.out.println("12*22 = " + multiply(12,22));
            System.out.println(concat("Aayush ","Dubey"));

        }
        public static void showName(String name) {
            System.out.println("your name is : "+ name);
        }
        public static void add(int x, int y) {
            System.out.println("x + y = " + x+y); // this will concatenate the parameters
            System.out.println("x + y = " + (x+y)); // this will add, put operations in parentheses
        }
        public static int multiply(int x, int y){
            return x*y;
        }
        public static String concat(String  a , String b) {
            return a+b;
        }
    }