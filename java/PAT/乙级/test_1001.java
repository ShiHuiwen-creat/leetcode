package PAT.乙级;

import java.util.Scanner;

public class test_1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(num(n));

    }
    public static int num(int n){
        if(n == 1){
            return 0;
        }else {
            if(n % 2 == 0){
                return num(n/2)+1;
            }else {
                return num((3*n+1)/2) + 1;
            }
        }

    }
}
