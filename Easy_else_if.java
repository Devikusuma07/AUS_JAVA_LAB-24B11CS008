public class Easy_else_if {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int z = 14;

        if(x>y && x>z){
            System.out.println(x);
        } 
        else if(y>z){
            System.err.println(y);
        } else {
            System.err.println(z);
        }

    }
    
}
