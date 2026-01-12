// search insert position
import java.util.*;
public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans =0;
        for(int i =0;i<n;i++){
            if(arr[i]==t){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
    
}