// sort colors (Dutch National Flag Algorithm)
import java.util.*;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;                // FIXED
            }
            else{
                swap(arr, mid, high); // FIXED order of parameters
                high--;
            }
        }

        // print sorted array
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}