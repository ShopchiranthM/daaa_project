import java.util.Scanner;

public class LinearSearchExample {
    // Linear search function
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;  // Return index if found
        }
        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2, 7, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
        
        sc.close();
    }
}
