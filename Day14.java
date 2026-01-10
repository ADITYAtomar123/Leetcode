// product of array except self
import java.util.*;
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] right = new int[n];
        int pr =1;
        for(int i =n-1;i>=0;i--){
            pr *=arr[i];
            right[i]=pr;
        }
        int[] ans = new int[n];
        int left =1;
        for(int i =0;i<n-1;i++){
            int val = left*right[i+1];
            ans[i]=val;
            left *=arr[i];
        }
        ans[n-1] = left;
        for(int i =0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
