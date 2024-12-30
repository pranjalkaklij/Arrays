public class LinearSearch {
    
    static int searchKey(int numbers[], int key)
    {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int variousKeys[] = {2, 4, 6, 34, 67, 33, 23, 90, 10};
         int key= 6;
         int findKeyAtIndex = searchKey(variousKeys, key);

         if (findKeyAtIndex>0) {
            System.out.println("Yay! key found at index : "+findKeyAtIndex);
         }
         else
         {
            System.out.println("Oops! Key is Not available.. try again.. ");
         }
    }
}
