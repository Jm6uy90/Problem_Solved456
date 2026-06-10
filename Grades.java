import java.util.Arrays;
import java.util.Scanner;
public class Grades {
   static String [] Students_name(int num_Students, Scanner sc)
   {
      String [] Students = new String [num_Students];
      
      for(int i = 0; i < Students.length; i++)
      {
      System.out.print("Enter Student name: ");
      Students[i] = sc.nextLine();
      }
      return Students;
     
   }
   static String [] Subject_name (int num_Subjects, Scanner sc)
   {
   String [] Subjects = new String [num_Subjects];
   for (int i = 0; i < Subjects.length; i++)
   {
   System.out.print("Enter name of Subject: ");
   Subjects [i] = sc.nextLine();
   }
   
   return Subjects;
   }
   
   static double [][] Grades_input(String [] name, String [] Subject, Scanner sc)
   {
   double [][] Grades = new double [name.length][Subject.length];
   
   for(int i = 0; i < Grades.length; i++)
   {
   System.out.println("Enter grade of " + name[i]);
   for(int j = 0; j < Grades[i].length; j++)
   {
   System.out.print(Subject[j] + ": ");
   Grades [i][j] = sc.nextDouble();
   }
   }
   return Grades;
   }
 
   
   static void Output(  double [][] Grades,  String [] names, String [] Subject )        
   {
   for(int i = 0; i < names.length; i++ )
   {
   System.out.println("Grades of " + names[i]);
   for(int j = 0; j < Subject.length; j++)
   {
   System.out.println(Subject[j] + ": " + Grades[i][j]);
   }
   
   }
   for(int i = 0; i < names.length; i++)
   {
       double sum = 0;
   for(int j = 0; j < Subject.length; j++)
   {
    sum+= Grades[i][j];
   }
   double avg = sum / Subject.length;
   System.out.printf("Average of %s is: %.2f%n", names[i], avg);
   }
   }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Input number of students: ");
        int Students = sc.nextInt();
        
        System.out.print("Input number of Subjects: ");
        int Subjects = sc.nextInt();
        
        sc.nextLine();
        
        String [] names = Students_name(Students, sc);
        String [] Subject = Subject_name (Subjects, sc);
        double [][] Grades = Grades_input(names, Subject,sc);
        Output( Grades, names, Subject   );
       
       
       
       
        sc.close();
        
    }
}