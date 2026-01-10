import java.util.*;
public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ft = 0;
        int st = 1;
        int tt =1;
        for(int i =1;i<=n;i++){
            int f = ft+st+tt;
            ft = st;
            st = tt;
            tt = f;
        }
        System.out.println(ft);
    }
}
