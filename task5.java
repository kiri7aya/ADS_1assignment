
import java.util.*;

public class task5 {
    static int[] array = new int[1000];

    //Time Complexity: O(n)
    static int getFib(int n){
        if(n == 0) return array[0];
        if(n == 1) return array[1];
        array[n-1] = getFib(n-1) + getFib(n-2);
        return array[n-1];
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array[0] = 0;
        array[1] = 1;
        System.out.println(getFib(n));
    }
}
