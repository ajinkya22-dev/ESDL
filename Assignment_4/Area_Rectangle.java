package Assignment_4;
import java.util.Scanner;
public class Area_Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Area of Rectangle:"+(l*b));
        sc.close();
    }
}
