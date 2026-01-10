import java.util.Scanner;

public class Waterbottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbottles = sc.nextInt();
        int exchange = sc.nextInt();
        int ans = numbottles;
        while(numbottles>=exchange){
            int n = numbottles/exchange;
            int rem = numbottles%exchange;
            ans +=n;
            numbottles = n+rem;
        }
        System.out.println(ans);
    }
}
