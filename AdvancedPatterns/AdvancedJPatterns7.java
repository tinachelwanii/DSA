public class AdvancedJPatterns7 {
    public static void solidrhombus(int n) {
        for(int i=1; i<=n;i++) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
        
        for(int j=1;j<=n;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        solidrhombus(5);
    }
}
