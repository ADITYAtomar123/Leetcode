// max product of two element

import java.util.*;
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fmax = -1;
        int smax = -1;
        for(int i =0;i<n;i++){
            if(fmax<arr[i]){
                smax = fmax;
                fmax =arr[i];
            }
            else if(smax<arr[i]){
                smax = arr[i];
            }
        }
        int ans = (fmax-1)*(smax-1);
        System.out.println(ans);
    }
}
