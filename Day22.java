// find first and last occurence
import java.util.*;
public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ft =-1;
        int lt =-1;
        for(int i = 0;i<n;i++){
            if(arr[i]==t){
                ft =i;
                break;
            }
        }
        for(int i = n-1;i>=0;i--){
            if(arr[i]==t){
                lt =i;
                break;
            }
        }
        int[] ans = {ft,lt};
        System.out.println(Arrays.toString(ans));
    }
}
