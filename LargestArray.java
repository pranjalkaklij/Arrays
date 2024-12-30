public class LargestArray {

    static int findLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            if (largest<=numbers[j]) {
                largest = numbers[j];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int dumyArray[] = {34, 67, 101, 55, 66, 89, };
        int largest = findLargest(dumyArray);
        System.out.println("Yes Found the largest number : "+largest);
    }
}
