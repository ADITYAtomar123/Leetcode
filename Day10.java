// misiing value
import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int as = (n*(n+1))/2;
        int cs = 0;
        for(int i=0;i<n-1;i++){
            cs+=arr[i];
        }
        int ans = as - cs;
        System.out.println(ans);
    }
}
