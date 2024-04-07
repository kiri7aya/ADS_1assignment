import java.util.*;

public class task3{
    //Time Complexity: O(sqrt(n))
    static boolean isPrime(int n, int i){
        if(n==1) return false;
        if(n==2) return true;
        if(n%i == 0) return false;
        if(i*i < n) return true;
        return isPrime(n, i + 1);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(isPrime(n, 2)) System.out.println("Prime");
        else System.out.println("Composite");
    }
}