public class BinarySearch {
    
    static int binarySearchKey(int number[], int key)
    {
        int start = 0, end =number.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<key) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {3, 4, 5, 6, 7, 8, 9, 10};
        int key = 4;
        System.out.println("Key is present in index no. "+binarySearchKey(num, key));
    }
}
