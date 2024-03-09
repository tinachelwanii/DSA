//compare string functions
public class String5 {
    public static void main(String[] args) {
        String s1 = "starfish";
        String s2 = "starfish";
        String s3 = new String("starfish");

        if(s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }
}
