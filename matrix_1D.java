import java.util.*;

class One_D {
    void one_matrix() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Matrix elements:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        One_D obj = new One_D();
        obj.one_matrix();
    }
}