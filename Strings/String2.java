//string length,string charAt method
public class String2 {
    public static void printLetters(String str)  {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String fullName = "Tony Stark";
        System.out.println(fullName.length());
        
        //concatenation
        String firstName = "Tina";
        String lastName = "Chelwani";
        String name = firstName +" "+lastName;
        System.out.println(name);
        System.out.println(name.charAt(0));

        printLetters(fullName);
    }
}
