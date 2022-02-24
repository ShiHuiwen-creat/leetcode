package model;

import java.util.Arrays;

/**
 * @author SHW
 * @date 2022/2/24 9:34
 */
public class test_1706 {
    public static void main(String[] args) {

    }
    public static int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int [] ans = new int[n];

        Arrays.fill(ans,-1);
        for(int i = 0 ;i < ans.length;i++){
            int col  = i; // 起始位置
            for(int [] row : grid){

                int dir = row[col];
                col += dir;
                if(col == n || col < 0 || row[col] != dir) {
                    col = -1;
                    break;
                }

            }
            if(col >= 0){
                ans[i]  =col;
            }
        }
        return ans;

    }
}
