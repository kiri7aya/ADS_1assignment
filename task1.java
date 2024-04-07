
import java.util.*;

public class task1 {
    //Time Complexity: O(n)
    static void arrayInput(int[] array, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    //Time Complexity: O(n)
    static int getMin(int array[], int n){
        if(n==1) return array[0];
        return Math.min(array[n-1], getMin(array, n-1));
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        arrayInput(array, n, scanner);
        System.out.print(getMin(array, n));
    }
}
