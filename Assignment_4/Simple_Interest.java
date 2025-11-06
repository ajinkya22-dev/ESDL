package Assignment_4;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P,R,T:");
        double P,R,T;
        P=sc.nextDouble();
        R=sc.nextDouble();
        T=sc.nextDouble();
        double SI=(P*R*T)/100;
        double amt=P+SI;
        System.out.println("Simple Interest:"+SI);
        System.out.println("Amount:"+amt);
        sc.close();
    }
}
