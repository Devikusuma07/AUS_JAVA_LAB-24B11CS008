public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.err.println("Day" + i);

            for(int j = 1; j <= 9; j++){
                System.err.println(" " + (j+8) + " - " + (j+9));
            }

        }
    }
    
}
