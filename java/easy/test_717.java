package easy;

/**
 * @author SHW
 * @date 2022/2/20 11:26
 */
public class test_717 {
    public static void main(String[] args) {

    }
    public static boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        for(int i = 0;i < len;i++){

            if(i == len-1 && bits[i] == 0){
                return true;
            }
            if(bits[i] == 1){
                i += 1;
            }
        }
        return false;
    }
}
