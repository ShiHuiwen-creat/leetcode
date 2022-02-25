package model;

/**
 * @author SHW
 * @date 2022/2/25 23:39
 */
public class test_537 {
    public static void main(String[] args) {
//        String s = "1+-3i";
//        s = func(s);
//        String[] sarr = s.split(" ");
//        int n = Integer.parseInt(s);
//        System.out.println(n);
//        for(String _str : sarr){
//            System.out.println(Integer.parseInt(_str));
//        }
    }

    public static String complexNumberMultiply(String num1, String num2) {
        String s1 = func(num1);
        String s2 = func(num2);
        String[] s1arr = s1.split(" ");
        String[] s2arr = s2.split(" ");
        int x1 = Integer.parseInt(s1arr[0]);
        int y1 = Integer.parseInt(s1arr[1]);
        int x2 = Integer.parseInt(s2arr[0]);
        int y2 = Integer.parseInt(s2arr[1]);

        int shishuxiang = x1 * x2 - y1 * y2;
        int xushuxiang = x1 * y2 + x2 * y1;
        String str_shi = Integer.toString(shishuxiang);
        String str_xu = Integer.toString(xushuxiang);
        String result = str_shi + "+" + str_xu + "i";

        return result;
    }

    public static String func(String str){
        str = str.replace('i',' ');
        str = str.replace('+',' ');
//        str = str.replace('-',' ');
        return str;

    }
}
