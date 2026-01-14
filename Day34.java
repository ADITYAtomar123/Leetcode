// plus one
import java.util.*;
public class Day34 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i =n-1;i>=0;i--){
        if(arr[i]!=9){
            arr[i]++;
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i]=0;
    }
    int[] ans = new int[n+1];
    ans[0]=1;
    System.out.println(Arrays.toString(ans));
   } 
}
