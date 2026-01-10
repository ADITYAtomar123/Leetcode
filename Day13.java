// two sum II - input array is sorted
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[2];
        int s = 0;
        int last = arr.length - 1;

        while (s < last) {
            int sum = arr[s] + arr[last];
            if (sum == t) {
                ans[0] = s + 1;   // +1 for 1-based index
                ans[1] = last + 1;
                break;            // stop once found
            } 
            else if (sum > t) {
                last--;
            } 
            else {
                s++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}