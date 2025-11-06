import java.util.*;
class S {
    String name;
    int rollno;
    int [] marks= new int[5];
    float avg;
    
    // Scanner sc=new Scanner(System.in);
    void input(Scanner sc){
        System.out.println("Enter Name of Student: ");
        name=sc.nextLine();

        System.out.println("Enter Student Roll No: ");
        rollno=sc.nextInt();

        System.out.print("Enter marks of 5 subjects: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {   
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        avg = sum / 5f;
        sc.nextLine();
    }

        void display() {
        System.out.println(name + "\t" + rollno + "\t" + avg);
    }
}

public class student {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        S[] students = new S[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new S();
            students[i].input(sc);
        }

        
        System.out.println("\nName\ttRoll No\tAverage");

        
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}









    