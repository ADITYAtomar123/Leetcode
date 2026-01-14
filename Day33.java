// maximum-count-of-positive-integer-and-negative-integer
import java.util.*;
public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                count++;
            }
        }
        int count1=0;
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                count1++;
            }
        }
        if(count>count1){
            System.out.println(count);
        }
        else{
            System.out.println(count1);
        }
    }    
}
