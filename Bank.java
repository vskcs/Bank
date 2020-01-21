
import java.util.Scanner;
public class Bank {
	static String name, surname, address, phone ;
	static double bal,cr,db ;
	static int i, j, cre=2;
	static Scanner s = new Scanner(System.in);
	void data(){
		System.out.print("Enter Name : ");
		name= s.next();
		System.out.print("Enter Surname : ");
		surname= s.next();
		System.out.print("Enter Address : ");
		address= s.next();
		System.out.print("Enter Phone number : ");
		phone= s.next();
		System.out.print("Enter Balance : ");
		bal= s.nextDouble();
	}
	void credit(){
		System.out.print("Enter amount : ");
		cr= s.nextDouble();
		bal+=cr;
		cre=1;
		System.out.println("New balance: " + bal);
	}
	void withdraw(){
		System.out.print("Enter amount : ");
		db= s.nextDouble();
		bal-=db;
		cre=0;
		System.out.println("New balance: " + bal);
	}
	void display(){
		System.out.println("Name: "+ name + surname);
		System.out.println("Address: " + address);
		System.out.println("Phone number : "+phone);
		System.out.println("Balance : "+bal);
		if(cre==0){
			System.out.println("Last operation was a withdrawal");
		}else if(cre==1){
			System.out.println("Last operation was a Credit");
		}else{
			System.out.println("Transactions: Nill");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my Bank!");
		Bank acc = new Bank();
		acc.data();
		while(i<10){
		System.out.println("Select an option:"+"1.Display 2.Credit 3.Withdraw 4.Exit");
		j=s.nextInt();
		if(j==1){
			acc.display();
		}else if (j==2){
			acc.credit();
		}else if (j==3){
			acc.withdraw();
		}else if (j==4){
			System.out.println("Thankyou! Have a Nice Day!");
			break;
		}else{
			System.out.println("Invalid option");
		}
		}
	}
}
