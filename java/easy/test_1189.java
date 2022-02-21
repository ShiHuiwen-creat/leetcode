package easy;

public class test_1189 {
    public static void main(String[] args) {

    }
    public static int maxNumberOfBalloons(String text) {
        int [] nums = new int[5];
        char [] chars = text.toCharArray();
        for(char c : chars){
            switch (c){
                case 'b':nums[0]++;break;
                case 'a':nums[1]++;break;
                case 'l':nums[2]++;break;
                case 'o':nums[3]++;break;
                case 'n':nums[4]++;break;
                default:break;
            }
        }
        nums[2] /= 2;
        nums[3] /= 2;
        int min = Integer.MAX_VALUE;
        for(int num :nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
