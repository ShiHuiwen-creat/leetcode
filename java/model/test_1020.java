package model;

public class test_1020 {
    public static int m , n;
    public static int [][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
    public static boolean[][]visted ;

    public static void main(String[] args) {

    }
    public static int numEnclaves(int[][] grid) {
         m = grid.length;
         n = grid[0].length;
        visted = new boolean[m][n];
        for(int i = 0;i < m;i++){
            dfs(grid,i,0);
            dfs(grid,i,n-1);
        }
        for(int i = 0;i < n;i++){
            dfs(grid,0,i);
            dfs(grid,m-1,i);
        }
        int sum = 0;
        for(int i = 1;i < m-1;i++){
            for(int j = 1;j < n-1;j++){
                if(grid[i][j] == 1 && !visted[i][j]){
                    sum++;
                }
            }


        }
        return sum;
    }
    public static void dfs(int [][]grid,int row,int col){
        if(row < 0 || row > m || col < 0 || col > n|| visted[row][col]|| grid[row][col] == 0){
            return;
        }
        visted[row][col] = true;
        for(int [] dir : dirs){
            dfs(grid,row+dir[0],col+dir[1]);
        }

    }

}
