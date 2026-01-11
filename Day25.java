// find peak value
import java.util.*;
public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        if(nums.length==1){
            System.out.println("0");
        }
        else if(nums[0]>nums[1]){
            System.out.println("0");
        }
        else if(nums[nums.length-1]>nums[nums.length-2]){
            System.out.println( nums.length-1);;
        }
        else{
            int st = 1;
            int lt = nums.length-2;
            while(st<=lt){
                int mid = (st+lt)/2;
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    System.out.println(mid);
                    break;
                }
                else if(nums[mid]<nums[mid+1]){
                    st = mid +1;
                }
                else{
                    lt = mid-1;
                }
            }
        }
        
    }
}
