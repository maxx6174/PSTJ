import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedNumbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        int resultIndex = binarySearch(sortedNumbers, target);
        
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index " + resultIndex + ".");
        } else {
            System.out.println("Element " + target + " was not found in the array.");
        }
        
        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
