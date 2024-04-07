
import java.util.*;

public class task6{
    //Time Complexity: O(n)
    static int pow(int a, int n){
        if(n==0) return 1;
        if(n==1) return a;
        return a * pow(a, n - 1);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(pow(a, n));
    }
}
