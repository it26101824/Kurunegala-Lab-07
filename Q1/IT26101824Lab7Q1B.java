import java.util.Scanner;
public class IT26101824Lab7Q1B
{
    public static void main(String[] args)
    {
	
	int s1,s2,s3,s4 ;
	double average ;
	
	Scanner input = new Scanner(System.in);
	
		for(int student=1; student < 4; )
		{
			
			
			
			System.out.print("Enter subject mark 1 :");
			s1 = input.nextInt();
	
			System.out.print("Enter subject mark 2 :");
			s2 = input.nextInt();
	
			System.out.print("Enter subject mark 3 :");
			s3 = input.nextInt();
	
			System.out.print("Enter subject mark 4 :");
			s4 = input.nextInt();
			
			System.out.print("\n");
			
			System.out.println("Student "+student);
			System.out.println("Enter marks:"+s1+" "+s2+" "+s3+" "+s4);
		
			average =(s1 + s2 + s3 + s4)/4.0;
			
			System.out.println("Average is:"+ average);
			
			if(average >= 75)
			{
				System.out.println("Overall grade is :Distinction");
		
			}
			else if(average >= 50)
			{
				System.out.println("Overall grade is :Credit");
		
			}
			else 
			{
				System.out.println("Overall grade is : Fail");
			}
			System.out.print("\n");
			student++;
		}
	
	
	
	
	}
}