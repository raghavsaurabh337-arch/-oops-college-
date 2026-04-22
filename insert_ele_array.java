import java.util.Scanner;

public class insert_ele_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //    System.out.print("Enter size of array: ");
        int n = sc.nextInt(5);

        int[] arr = new int[n + 1]; 

      
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

     
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;

        System.out.println("Updated array:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}