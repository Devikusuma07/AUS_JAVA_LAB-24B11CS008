import java.util.Scanner;

public class greets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.println("Hello " + name + ", have a good day!");

    }
    
}
