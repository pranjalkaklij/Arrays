// this is the Optimal Solution of this program
public class LargestElementNumber {
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,1,8,1};
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }
        System.out.println(largest);

    }
}
