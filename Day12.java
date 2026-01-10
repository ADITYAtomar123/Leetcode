// square of sorted array
import java.util.*;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            arr[i]*=arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
