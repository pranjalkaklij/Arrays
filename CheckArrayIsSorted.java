public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,56};
        int temp = arr[0];
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if(temp<=arr[i])
            {
                temp=arr[i];
            }
            else
            {
                check = false;
                System.out.println("not sorted");
            }
        }
        if(check)
        {
            System.out.println("sorted");
        }
    }
}
