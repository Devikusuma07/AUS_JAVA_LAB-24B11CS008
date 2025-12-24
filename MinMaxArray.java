import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int x[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int min = x[0];
        int max = x[0];

        for (int i = 1; i < n; i++) {
            if (x[i] < min) {
                min = x[i];
            }
            if (x[i] > max) {
                max = x[i];
            }
        }

        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);

        sc.close();
    }
}
