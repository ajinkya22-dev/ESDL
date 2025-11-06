package Assignment_4;
import java.util.Scanner;

public class Square_Cube {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int sq=i*i;
            int cube=sq*i;
            System.out.println("Number:"+i);
            System.out.println("Square:"+sq);
            System.out.println("Cube:"+cube+"\n");
        }
        sc.close();
    }
}
