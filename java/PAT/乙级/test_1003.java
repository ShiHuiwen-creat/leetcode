package PAT.乙级;

import java.util.Scanner;

/**
 * @author SHW
 * @date 2022/1/25 17:48
 */
public class test_1003 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        String str0 = input.nextLine();
        while(n > 0){
            int x = 0, y = 0, z = 0;
            int p, a, t = 0;
            String str = input.nextLine();
            char [] chars = str.toCharArray();
            int flag = 1;
            boolean bool = true;
            for(char ch : chars){
                switch (ch){
                    case 'P':flag = 2;break;
                    case 'T':flag = 3;break;
                    case 'A':break;
                    default:bool = false;break;
                }
                if(flag == 1){
                    if(ch == 'A'){
                        x++;
                    }
                }else if(flag == 2){
                    if(ch == 'A'){
                        y++;
                    }
                }else{
                    if(ch == 'A'){
                        z++;
                    }
                }
            }
            if(flag == 3 && y>0 && x*y == z && bool){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            n--;
        }
    }
}
