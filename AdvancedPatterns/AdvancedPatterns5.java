public class AdvancedPatterns5 {
    public static void zeroonetriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); // Add a new line after each row
        }
    }

    public static void main(String args[]) {
        zeroonetriangle(5);
    }
}
