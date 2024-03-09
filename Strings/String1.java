/* what are strings and input and output of strings */
import java.util.*;
public class String1 {
    public static void main(String args[]) {
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str1 = new String("xyz@1");
        //strings are immutable

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
