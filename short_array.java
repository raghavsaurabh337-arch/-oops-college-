import java.util.Scanner;

public class short_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        short[] arr = new short[n];

        
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextShort();
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    short temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}