
import java.util.*;

public class task2{
    //Time Complexity: O(n)
    static void arrayInput(int[] array, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    //Time Complexity: O(n)
    static float getAvg(int array[], int n){
        float avg;
        avg = (float)array[n-1] / (float)array.length;
        if(n==1) return avg;
        return avg + getAvg(array, n - 1);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        arrayInput(array, n, scanner);
        System.out.print(getAvg(array, n));
    }
}
