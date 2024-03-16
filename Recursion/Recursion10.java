//print x to the power n(optimized power) 
public class Recursion10 {
    public static int optimizedpower(int a,int n){//O(log n)
        if(n==0){
            return 1;
        }
         int halfPower = optimizedpower(a, n/2);
         int halfPowerSq = halfPower * halfPower;

         //n is odd
        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(optimizedpower(a,n));
    }
}
