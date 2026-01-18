
import java.util.Scanner;

public class PerOfCBSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int s1;
        System.out.println("Enter the marks of subject 1: ");
        s1 = sc.nextInt();
        int s2;
        System.out.println("Enter the marks of subject 2: ");
        s2 = sc.nextInt();
        int s3;
        System.out.println("Enter the marks of subject 3: ");
        s3 = sc.nextInt();
        int s4;
        System.out.println("Enter the marks of subject 4: ");
        s4 = sc.nextInt();
        int s5;
        System.out.println("Enter the marks of subject 5: ");
        s5 = sc.nextInt();

        int Total = s1 + s2 + s3 + s4 + s5;
        System.out.println("The Total marks obtained is: " + Total);

        

        float percentage = (Total / 500.0f) * 100;

        System.out.println("The Percentage is: " + percentage);

        
    }
    
}
