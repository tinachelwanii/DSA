//clear last i bits
public class BitManipulation7 {
    public static int clearBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBits(15, 2));
    }
}
