import java.util.Scanner;
public class Task2{
    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Students Grade");
    System.out.println("Enter number of subjects");
    int sub=sc.nextInt();
    int total=0;
    for(int i=1;i<=sub;i++)
    {
        System.out.println("Enter marks obtained "+i);
        int marks=sc.nextInt();
        total+=marks;
    }
    double avg=(double)total/sub;
    char Grade;
    if(avg>=90)
    {
        Grade='O';
    }
    else if(avg>=80)
    {
        Grade='A';
    }
    else if(avg>=70)
    {
        Grade='B';
    }
    else if(avg>=60)
    {
        Grade='C';
    }
    else if(avg>=50)
    {
        Grade='D';
    }
    else if(avg>=35)
    {
        Grade='E';
    }
    else
    {
        Grade='F';
    }
    System.out.println("Total Marks Scored is:"+total);
    System.out.println("Average percentage Gained is:"+avg+" %");
    System.out.println("Grade:"+Grade);
    }
}