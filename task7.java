
import java.util.*;

public class task7 {
    //Time Complexity: O(1)
    static String swap(String str, int l, int i) {
        char[] charArray = str.toCharArray();
        char temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }

    //Time Complexity: O(n!)
    static void permutations(String str, int l, int r){
        if(l==r) System.out.println(str);
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permutations(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    //Time Complexity: O(1)
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int r = str.length();
        permutations(str, 0, r-1);
    }
}
