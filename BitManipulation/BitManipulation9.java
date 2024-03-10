//check if a number is power of 2 or not
public class BitManipulation9 {
    public static boolean isPowerofTwo(int n){
        return(n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
