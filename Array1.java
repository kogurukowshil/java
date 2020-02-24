import java.util.Scanner;
public class Array1
{
    public static void main(String[] args) 
    {
        int n, total = 0;
          String h,name; 
        Scanner s = new Scanner(System.in);
         System.out.println("enter the name of student");
          h=s.nextLine();
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
     
        
        System.out.println("Sum:"+total);
        
    }
}