public class RemoveDuplicatesFormArray {
    public static int removeDuplicates(int arr[], int n)
    {
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,4,5};
        int n = arr.length;
        System.out.println("the size of the array is : "+removeDuplicates(arr, n));
        System.out.println("the size of the array is : "+arr.length);
    }
}
