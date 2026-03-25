// import java.util.Scanner;

// public class Leetcode {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: Ask size
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         // Step 2: Declare array
//         int[] arr = new int[n];

//         // Step 3: Input elements
//         System.out.println("Enter " + n + " elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Step 4: Sorting (Selection-like)
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     // swap
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         // Step 5: Print sorted array
//         System.out.println("Sorted array:");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }
public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else {
                // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}