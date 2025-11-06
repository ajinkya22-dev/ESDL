import java.util.*;

public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int reversed_num=0;
        int digit;
        while(temp>0){
            digit=temp%10;
            reversed_num=(reversed_num*10)+digit;
            temp=temp/10;
        }
        if(num==reversed_num){
            System.out.println(num," is a Palindrome number\n");
        }
        else{
            System.out.println(num," is not a Palindrome number\n");
        }
    }
}