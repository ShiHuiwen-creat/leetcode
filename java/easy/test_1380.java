package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class test_1380 {
    public static void main(String[] args) {

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer>list = new ArrayList<>();
        for(int j = 0;j < n;j++){
            for(int i = 0;i < m;i++){
                boolean isMin = true;
                boolean isMax = true;
                for(int k = 0;k < n;k++){
                    if(matrix[i][k] < matrix[i][j]){
                        isMin = false;
                    }
                }
                if(!isMin){
                    continue;
                }
                for(int k = 0;k < m;k++){
                    if(matrix[k][j] > matrix[i][j]){
                        isMax = false;
                    }
                }
                if(isMax){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
