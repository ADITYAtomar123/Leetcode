import java.util.HashMap;
import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        HashMap <Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<n;i++){
            int ele = arr[i];
            if(hs.containsKey(ele)==true){
                hs.put(ele,hs.get(ele)+1);
            }
            else{
                hs.put(ele,1);
            }
        }
        int ans = -1;
        for(int key :hs.keySet()){
            if(hs.get(key)==key){
                ans = Math.max(ans,key);
            }
        }
        System.out.println(ans);
    }
}
   
