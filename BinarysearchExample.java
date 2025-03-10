import java.util.Scanner;

public class BinarySearchExample {
    // Binary search function
    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target)
                return mid;

            // If target is smaller, ignore right half
            if (arr[mid] > target)
                right = mid - 1;
            else // If target is larger, ignore left half
                left = mid + 1;
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}; // Sorted array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
        
        sc.close();
    }
}
