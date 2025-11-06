package Assignment_4;
import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        double r=sc.nextDouble();
        System.out.println("Area of Circle:"+((22.0/7)*r*r));
        sc.close();
    }
}
