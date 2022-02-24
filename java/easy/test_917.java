package easy;

/**
 * @author SHW
 * @date 2022/2/23 23:54
 */
public class test_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("sad"));
    }
    public static String reverseOnlyLetters(String s) {
            String news = s.replace("-","");
            int l = 0;
            int r = s.length()-1;
            char [] ch = s.toCharArray();
            while(l < r){
                char cc = ch[l] ;
                ch[l] = ch[r];
                ch[r] = cc;
                l++;
                r--;
            }
            String ss = new String(ch);
            return ss;

    }


}
