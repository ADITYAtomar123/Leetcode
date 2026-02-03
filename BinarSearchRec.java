package Recursion;
import java.util.*;
public class BinarSearchRec {
    public static int fo(int[] arr,int t,int i){
        if(i==arr.length) return -1;
        if(arr[i]==t) return i;
        return fo(arr,t,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int t = sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fo(arr,t,0));
    }
}
