package PAT.乙级;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        String[] chars = s.split(" ");
        int [] nums = new int[m];
        for(int i = 0;i < m;i++){
            nums[i] = Integer.valueOf(chars[i]);
        }

        ArrayList<Integer> array = new ArrayList<>();
        for(int num:nums){
            while(num != 1){
                if(num%2 == 0){
                    num = num/2;
                }else {
                    num = (3*num+1)/2;
                }
                array.add(num);
            }
        }
        ArrayList<Integer>arrayList = new ArrayList<>();
        for(int i = 0;i < m;i++){
            if(!array.contains(nums[i])){
                arrayList.add(nums[i]);
            }
        }
        int array_size = arrayList.size();
        int [] num_ = new int[array_size];
        for(int i = 0;i < array_size;i++){
            num_[i] = arrayList.get(i);
        }
        Arrays.sort(num_);
        for(int i = 0;i<array_size-1;i++){
            System.out.print(num_[array_size-1-i]);
            System.out.print(" ");
        }
        System.out.println(num_[0]);
    }
}
