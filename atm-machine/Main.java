import java.util.Scanner;

public class Main {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Account[] account = new Account[10];
		for(int i=0; i<10 ; i++) {
			account[i] = new Account(i, 100.0);
		}
		System.out.println("Login username (1-10)");
		int id = in.nextInt();
		if (id >= 10) {
			id = incorrectedId(id);
		}
		
		
		while(true) {
			menuDisplay();
			System.out.println("Make choice");
			int secim = in.nextInt();
			
			if(secim == 4) {
				System.out.println("Login username(1-10)");
				id = in.nextInt();
				
				if (id >= 10) {
					id = incorrectedId(id);
				}
				
			}
			performChoice(id,secim, account);
		}
	}
	public static void performChoice(int id, int secim, Account[] account) {
		switch(secim) {
		case 1:
			System.out.println("Your balance:" + account[id].getBakiye());
		break;
		case 2:
			System.out.println("amount you want to withdraw:" );
			account[id].cekilenPara(in.nextDouble());
			break;
		case 3:
			System.out.println("amount you want to deposit:");
			account[id].yatirilanPara(in.nextDouble());
			break;
			default:
				break;
		}
		
	}
	public static void menuDisplay() {
		System.out.println("1- Show balance: \n"
				+ "2-Withdraw\n"
				+ "3-Deposit\n"
				+ "4-Exit\n");
	}
	public static int incorrectedId(int id) {
		if ( id >= 10) {
			System.out.println("wrong choice, try again");
			id = in.nextInt();
			System.out.println();

		}
		return id;
		
	}

}

