import java.util.*;

public class multiplication{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        int temp=num;
        for(int i=0;i<=5;i++){
            temp*=temp;
            System.out.println(temp);
            if(temp>=10000000)break;
        }
    }
}