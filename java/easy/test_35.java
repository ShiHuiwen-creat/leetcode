package easy;

public class test_35 {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int mid = (high-low)/2+low;
            if(nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
            return low;

    }
}
