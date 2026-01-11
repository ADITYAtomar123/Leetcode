// increasing triplet sequence
// import java.util.*;
// public class Day18 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i =0;i<n;i++){
//             for(int j =i+1;j<n;j++){
//                 for(int k = j+1;k<n;k++){
//                     if(arr[i]<arr[j] && arr[j]<arr[k]){
//                         System.out.println("true");
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println("false");
//     }
// }



// 2nd method
import java.util.*;
public class Day18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        int t = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(f>=arr[i]){
                f = arr[i];
            }
            else if(s>=arr[i]){
                s = arr[i];
            }
            else{
                t = arr[i];
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}