import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ft = 0;
        int st =1;
        for(int i =1;i<=n;i++){
            int tt =ft+st;
            ft = st;
            st = tt;
        }
        System.out.println(ft);
    }
}