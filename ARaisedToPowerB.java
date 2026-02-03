// package Recursion;
// public class ARaisedToPowerB {
//     public static int pow(int a,int b){
//         if(b==0) return 1;
//         int ans =a*pow(a,b-1);
//         return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(2,9));
//     }
// }



package Recursion;
public class ARaisedToPowerB {
    public static int pow(int a,int b){
        if(b==0) return 1;
        int  cal = pow(a,b/2);
        if(b%2==0) return cal*cal;
        else return a*cal*cal;
    }
    public static void main(String[] args) {
        System.out.println(pow(6,5));
    }
}