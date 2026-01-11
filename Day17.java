import java.util.*;
public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int inx = -1;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                inx =i;
            }
        }
        for(int i =0;i<n;i++){
            if(i!=inx && max <2*arr[i]){
                System.out.println("-1");
                return;
            }
        }
        System.out.println(inx);
       
    }
}
