import java.util.Arrays;
public class Practice {
    public static int searchInsert(int[] nums, int target) {
        //boolean isPresent = Arrays.stream(nums).anyMatch(num -> num == target);
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            else if(target<nums[i])
            {
                return i;
            }
            else if (i==nums.length-1 && target!=nums[nums.length-1]) {
                return ++i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,3,5,6};
        int target=2;
        System.out.println(""+searchInsert(num,target));
    }
}
