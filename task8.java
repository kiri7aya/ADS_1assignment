
import java.util.*;

public class task8{
    //Time Complexity: O(n)
    static boolean isDigits(String str, int n, int i){
        if (i == n) return true;
        if (!(Character.isDigit(str.charAt(i)))) return false;
        return isDigits(str, n, i+1);
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        int i = 0;
        System.out.println(isDigits(str, n, i));
    }
}
