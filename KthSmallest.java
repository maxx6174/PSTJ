import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }
        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k (1 to " + n + "): ");
        int k = scanner.nextInt();
        
        if (k < 1 || k > n) {
            System.out.println("Invalid value of k! It must be between 1 and " + n + ".");
            scanner.close();
            return;
        }
        
        Arrays.sort(numbers);
        
        int kthSmallest = numbers[k - 1];
        
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        
        scanner.close();
    }
}
