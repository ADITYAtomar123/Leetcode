// largest number
// import java.util.*;
// public class Day32 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i =0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         String[] arr = new String[n];
//         for(int i =0;i<n;i++){
//             arr[i]=nums[i]+"";
//         }
//         Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));
//         StringBuilder sb = new StringBuilder("");
//         for(int i=arr.length-1;i>=0;i--){
//             sb.append(arr[i]);
//         }
//         System.out.println(sb.toString());
//     }
// }
