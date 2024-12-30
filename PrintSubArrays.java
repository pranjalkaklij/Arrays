public class PrintSubArrays {

    static void prinSubArray(int num[])
    {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(num[j2]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = {3,4,5,6,7};
        prinSubArray(num);
    }
}