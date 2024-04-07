
import java.util.*;

public class task9 {
    //Time Complexity: O(2^n)
    static int binomialCoefficient(int n, int k){
        if(k > n) return 0;
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1)
                + binomialCoefficient(n - 1, k);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(n,k));
    }
}
