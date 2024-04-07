
import java.util.*;

public class task10 {
    //Time Complexity: O(max(a,b))
    static int gcd(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b) return gcd(a-b, b);
        return gcd(a, b-a);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
}
