import java.util.Scanner;

public class short_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Creating short array
        short[] arr = new short[n];

        // Taking array elements input
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextShort();
        }

        // Displaying array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
} {
     
}
