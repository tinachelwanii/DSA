//print reverse of a number
//import java.util.*;
public class Loops7 {
    public static void main(String[] args) {
        int n=10899;

        while(n > 0) {
            int LastDigit = n % 10;
            System.out.print(LastDigit);
            n=n/10;
        }
        System.out.println();
    }
}
