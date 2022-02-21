package PAT.乙级;

import java.math.BigInteger;
import java.util.Scanner;

public class test_1002 {
    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();
        char [] chars = s.toCharArray();
        int sum = 0;
        for(char ch : chars){
            sum += (ch - '0');
        }

        String s1 = sum + "";
        char [] chars1 = s1.toCharArray();
        boolean flag = false;
        for(char ch : chars1){
            if(flag){
                System.out.print(" ");
            }
            num(ch);
            flag = true;
        }

    }

    public static void num(char ch){
        switch (ch){
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
            case '0':
                System.out.println("ling");
                break;

        }

    }
}
