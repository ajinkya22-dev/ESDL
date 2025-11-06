import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two words:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        String result=String.join(" ",s1,s2);   
        for(int i=0;i<result.length();i++){
            System.out.println(result.charAt(i));
        }
        result=s1.concat(s2);
        System.out.println(result);
        System.out.println(result.indexOf("l"));
        System.out.println(result.lastIndexOf("l"));
        System.out.println(result.substring(3,7));
        System.out.println(result.toCharArray());
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());
        System.out.println(s1.compareTo(s2));
        System.out.println(result.compareTo(s2));
        System.out.println(result.contains("world"));
        sc.close();

    }
}   