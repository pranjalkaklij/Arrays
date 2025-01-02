import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,1,8,1};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        System.out.println(largest);
    }
}
