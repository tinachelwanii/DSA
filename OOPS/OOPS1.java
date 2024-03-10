//classes and objects 
public class OOPS1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();//created pen object named p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}
class Pen {
    //properties + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy,int chem, int math) {
        percentage = (phy + chem + math) /3;
    }
}
