public class ReverseAnArray {
    
    static void reverseArray(int numbers[])
    {
        int first=0, last=numbers.length-1;
        while (first<last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int num[] = {34, 45, 56, 32, 11};
        reverseArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " +num[i]);
        }
        
    }
}
