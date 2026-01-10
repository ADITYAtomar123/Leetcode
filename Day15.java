// bulb switcher
import java.util.*;
public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int count =0;
        while(i*i<=n){
            count++;
            i++;
        }
        System.out.println(count);
    }
}
