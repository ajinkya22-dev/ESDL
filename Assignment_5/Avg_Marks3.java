import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
public class Avg_Marks3 {
    public static void main(String args[]){
        HashMap<Integer,Double> Students= new HashMap<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter Roll No. of Student "+(i+1)+":");
            int roll_no=sc.nextInt();
            System.out.print("Enter Marks:");
            Double marks=sc.nextDouble();
            Students.put(roll_no, marks);
        }
        sc.close();
        Vector<Integer> Failed=new Vector<>();
        Vector<Integer> Distinction=new Vector<>();
        for(Map.Entry<Integer,Double> entry:Students.entrySet()){
            if(entry.getValue()>80){
                Distinction.add(entry.getKey());
            }
            if(entry.getValue()<35){
                Failed.add(entry.getKey());
            }
            System.out.println("Marks of "+entry.getKey()+":"+entry.getValue());
        }
        System.out.print("Failed(<35):");
        for(int i=0;i<Failed.size();i++)System.out.print(Failed.get(i)+" ");
        System.out.println();
        System.out.print("Distinction(>80):");
        for(int i=0;i<Distinction.size();i++)System.out.print(Distinction.get(i)+" ");
        System.out.println();
    }
}
