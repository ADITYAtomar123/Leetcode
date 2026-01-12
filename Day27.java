// single elemnt in sorted array
import java.util.*;
public class Day27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int ans =0;
        for(int i =0;i<n-1;i++){
            if(arr[i]!=arr[n+1]){
                ans = arr[i];
                System.out.println(ans);
            }
            i++;
        }
        System.out.println("-1");
    }
}