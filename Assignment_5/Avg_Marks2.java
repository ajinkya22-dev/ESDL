import java.util.Scanner;
import java.util.Vector;
public class Avg_Marks2 {
    public static void main(String args[]){
        Vector<Double> marks= new Vector<>();
        Scanner sc=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter Mark of Subject No. "+(i+1));
            double a=sc.nextDouble();
            marks.add(a);
            sum+=marks.get(i);
        }
        double avg=sum/marks.size();
        System.out.println("Average:"+avg);
        sc.close();
    }
}
