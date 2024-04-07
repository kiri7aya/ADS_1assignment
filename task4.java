
import java.util.*;

public class task4{
    //Time Complexity: O(n)
    static int getFactorial(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return n * getFactorial(n-1);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFactorial(n));
    }
}
