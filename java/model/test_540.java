package model;

public class test_540 {
    public static void main(String[] args) {
//        int [] nums = new int[]{1,2,3,1,2,3,4};
//        System.out.println(singleNonDuplicate(nums));
        System.out.println(6&1);
    }
    public static int singleNonDuplicate(int[] nums) {
//        int result = 0;
//        for(int num:nums){
//            result = result^num;
//        }
//        return result;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];


    }
}
