import java.util.*;
class ATM{
	private static double bln=1000;
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("ATM MENU:");
		System.out.println("1 Check your balance:");
		System.out.println("2 Withdrawal:");
		System.out.println("3 Deposit:");
		System.out.println("Exit");
		System.out.println("Enter your choice");
		
		int choice=sc.nextInt();
		switch(choice){
			case 1:
			checkBalance();
			break;
			case 2:
			withdrawalMoney(sc);
			break;
			case 3:
			depositMoney(sc);
			break;
			case 4:
			System.out.println("Thankyou for using Indian bank ATM services");
			sc.close();
			return;
			default:
			System.out.println("Invalid key. Please enter in valid key");			
		}
		System.out.println();
	}
	}
	private static void checkBalance(){
		System.out.println("Your balance:"+bln);		
	}
	private static void withdrawalMoney(Scanner sc){
		System.out.println("Enter to your withdrawal amount:");
		double amt=sc.nextDouble();
		if(amt >0 && amt <= bln){
			bln-=amt;
		System.out.println("Withdrawal Successful. Remaining balance:"+bln);		
		} else{
			System.out.println("Insufficient balance");
		}
	}
		private static void depositMoney(Scanner sc){
		System.out.println("Enter to your deposit amount:");
		double amt=sc.nextDouble();
		if(amt >0 ){
			bln+=amt;
		System.out.println("Deposit Successful. Remaining balance:"+bln);
		}else{
			System.out.println("Insufficient balance");
		}
		
	}
}