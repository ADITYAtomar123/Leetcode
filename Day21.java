// Binary search
import java.util.*;
public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = -1;
        for(int i =0;i<n;i++){
            if(arr[i]==t){
                ans =i;
            }
        }
        System.out.println(ans);
    }
}
