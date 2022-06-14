package BankSystem;
import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			Bank bank = new Bank("AlAHLY","SHEIKH ZAYED","19623");
			Boolean X=true;
			
			while(X) 
			{
				System.out.print("Choose one of the options:"+"\r\n"+"1-Create Account"+"\r\n"+"2-Edit Account"+"\r\n"+"3-Display all account"+"\r\n"+"4-Exit"+"\r\n"+":");
				int choice = scan.nextInt();
				if(choice==1)
				{
					System.out.print("1-Regular Account"+"\r\n"+"2-Special Account"+"\r\n"+":");
					int choice1 = scan.nextInt();
					if(choice1==1)
					{
						Account account = new Account();
						account.setAccountnumber();
						bank.AddAccount(account);
						System.out.print("1-Regular Client"+"\r\n"+"2-Commercial Client"+"\r\n"+":");
						int choice2 = scan.nextInt();
						if(choice2==1)
						{
							Client client = new Client();
							client.setName();
							client.setAddress();
							client.setID();
							client.setPhone();
							client.setAccount(account);
							bank.AddClient(client);
						}
						else if(choice2==2)
						{
							CommercialClient CommClient = new CommercialClient();
							CommClient.setName();
							CommClient.setAddress();
							CommClient.setPhone();
							CommClient.setCommercialID();
							CommClient.setAccount(account);
							bank.AddClient(CommClient);
						}
						
					}
					else if(choice1==2)
					{
						SpecialAccount SpecAcc = new SpecialAccount();
						SpecAcc.setAccountnumber();
						bank.AddAccount(SpecAcc);
						System.out.print("1-Regular Client"+"\r\n"+"2-Commercial Client"+"\r\n"+":");
						int choice2 = scan.nextInt();
						System.out.print("\r\n");
						if(choice2==1)
						{
							Client client = new Client();
							client.setName();
							client.setAddress();
							client.setID();
							client.setPhone();
							client.setAccount(SpecAcc);
							bank.AddClient(client);
						}
						else if(choice2==2)
						{
							CommercialClient CommClient = new CommercialClient();
							CommClient.setName();
							CommClient.setAddress();
							CommClient.setPhone();
							CommClient.setCommercialID();
							CommClient.setAccount(SpecAcc);
							bank.AddClient(CommClient);
						}
					}
				
				}
				else if(choice==2)
				    {
					Boolean T =true;
					System.out.print("Enter the Account Number:");
					int AccNum = scan.nextInt();
					if(bank.search(AccNum)!=null)
					{
						bank.search(AccNum);
						 T=true;
					}
					else
					{
						System.out.print("No existing account please check and try again"+"\r\n");
						 T=false;
					}
					while(T==true)
					{
						System.out.print("1-Deposit"+"\r\n"+"2-Withdraw"+"\r\n"+"3-Display account info"+"\r\n"+"4-Back to Main Menu"+"\r\n"+":");
						int choice2= scan.nextInt();
						if(choice2==1) 
						{
							bank.search(AccNum).deposit();
						}
						else if(choice2==2)
						{
							bank.search(AccNum).withdraw();
						}
						else if(choice2==3)
						{
							bank.search(AccNum);
						}
						else if(choice2==4)
						{
							T=false;
						}
						else 
						{
							System.out.print("Please choose one of the options"+"\r\n"+"try again");
						}
					}
					
				}
				else if(choice==3)
				{
					bank.Display();
				}
				
				else if(choice==4)
				{
					X=false;
				}

			}
		}
	}
}

		