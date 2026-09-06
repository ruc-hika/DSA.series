public class ArrayExample {
    public static void main(String[] args) {
        
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements using a loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
//Another Example: Taking Input into an Array
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("You entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
