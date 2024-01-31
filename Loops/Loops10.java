//break statement-print 1 to 5 but break the loop at 3 
public class Loops10 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            if(i==3) {
            break;
        }
        System.out.println(i);
    }
        System.out.println("i am out of the loop");
    }
}
