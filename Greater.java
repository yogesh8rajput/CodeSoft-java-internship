import java.util.*;

class Greater
{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your four subjects number");
	int a,b,c,d,total,avr;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	
	total=a+b+c+d;
	System.out.println("your total marks:"+total);
	avr=total/4;
	
	System.out.println("your avrege marks:"+avr);
	
	if(avr>=80)
  {
  System.out.println("Your grade is A");
  }
  else if(avr>=60 && avr<80){
  System.out.println("Your grade is B");
         
  }
  else if(avr>=30 && avr<60){
  System.out.println("Your grade is C");
         
  }
  else
  {
  System.out.println("Your grade is F");
  }
	
	}
}