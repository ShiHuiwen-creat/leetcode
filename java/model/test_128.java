package model;

import java.util.Arrays;
import java.util.concurrent.BlockingDeque;

/**
 * @author SHW
 * @date 2022/2/24 14:38
 */
public class test_128 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,1,0};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longestStreak = 0;
        int currentStreak = 1;
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i] == nums[i+1]-1){
                currentStreak++;
            }else{
                longestStreak = Math.max(longestStreak,currentStreak);
                currentStreak = 1;
            }
        }
        longestStreak = Math.max(longestStreak,currentStreak);
        return longestStreak;
    }
}
