//arrays input/output
import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        sc.close();

        marks[2] = 100;
        System.out.println("math: " + marks[2]); 

        int percentage = (marks[0] + marks[1] + marks[3])/3;
        System.out.println("percentage :"+percentage+"%");

        System.out.println("length of an array : " + marks.length);
    }
}
