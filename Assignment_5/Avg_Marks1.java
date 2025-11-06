import java.util.Scanner;
public class Avg_Marks1 {
    public static void main(String args[]){
        double[] marks=new double[5];
        Scanner sc=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter Mark of Subject No. "+(i+1));
            marks[i]=sc.nextDouble();
            sum+=marks[i];
        }
        double avg=sum/marks.length;
        System.out.println("Average:"+avg);
        sc.close();
    }
}
