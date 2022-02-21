package deficult;

public class test_1688 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfMatches(num));
    }
    public static int numberOfMatches(int n) {
        if(n == 1) {
            return 0;
        }else {
            if(n % 2 == 1){
                return numberOfMatches((n+1)/2)+(n-1)/2;
            }else{
                return numberOfMatches(n/2)+n/2;
            }
        }
    }
}
