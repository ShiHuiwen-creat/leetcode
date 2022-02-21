package easy;

public class test_19084 {
    public static void main(String[] args) {
//        int [] a = new int[]{41900,69441,94407,37498,20299,10856,36221,2231,54526,79072,84309,76765,92282,13401,44698,17586,98455,47895,98889,65298,32271,23801,83153,12186,7453,79460,67209,54576,87785,47738,40750,31265,77990,93502,50364,75098,11712,80013,24193,35209,56300,85735,3590,24858,6780,50086,87549,7413,90444,12284,44970,39274,81201,43353,75808,14508,17389,10313,90055,43102,18659,20802,70315,48843,12273,78876,36638,17051,20478};
//        int [] al = quicksort(a,0,a.length-1);
//        for(int num:al){
//            System.out.println(num);
//        }
        int [] nums = new int[]{9,4,1,7};
        System.out.println(minimumDifference(nums,2));
    }
    public static int minimumDifference(int[] nums, int k) {
        int [] sortNum = quicksort(nums,0,nums.length-1);
        int max = sortNum[sortNum.length-1];
        int min = sortNum[sortNum.length-k];
        int min_ = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length-k+1;i++){
            if(min_ > -(sortNum[i] - sortNum[i+k-1])){
                min_ =  -sortNum[i] + sortNum[i+k-1];
            }
        }
        return min_;

    }

    public static int [] quicksort(int []arr,int left ,int right){
        if (left<right){
            int index = indexOfPartition(arr,left,right);
            quicksort(arr,left,index-1);
            quicksort(arr,index+1,right);
        }
        return arr;
    }
    public static int indexOfPartition(int []arr,int left,int right){
        int pivot =left;
        int index = pivot + 1 ;
        for(int i = index;i <= right;i++){
            if(arr[i] < arr[pivot]){
                swap(arr,index,i);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;

    }

    public static void  swap(int []arr, int left ,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
