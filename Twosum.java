import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans = new int[2];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i]+arr[j]==t){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        System.out.println(ans[1] + " " + ans[0]);
    
    }
}
