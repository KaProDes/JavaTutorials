import java.util.*;
class Item{
	int id;
	String name;
	double price;
	int qty;
	static int count=0;
	Item(){
		int id[]={111,222,333,444,555};
		String name[]={"Tyres","Screws","Headlights","Oil","Wrench"};
		double price[]={1500.0,50.0,1000.0,100.0,400.0};
		int qty[]={50,100,45,55,60};
		this.id=id[count];
		this.name=name[count];
		this.price=price[count];
		this.qty=qty[count];	
	}
	void display(){
		System.out.println("ID:"+id+"--Name:"+name+"--Price per:"+price+"--qty:"+qty);
		count++;
	}	
}
class Sales extends Item{
	int sellid;
	int sellqty;
	double sellprice;
	static int flag=0;
	
	void sell(Item l[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Item ID:");
		sellid=sc.nextInt();
		System.out.print("Enter Quantity:");
		sellqty=sc.nextInt();
		for(int i=0;i<5;i++){
			if(sellid==l[i].id && l[i].qty>sellqty){
				sellid=l[i].id;
				sellprice=l[i].price;
				l[i].qty-=sellqty;
				flag=0;
				System.out.println("Item Sold:");
				System.out.println("ID:"+sellid+"--Name:"+l[i].name+"--Quantity:"+sellqty+"--Cost:"+sellprice*sellqty);
				break;
			}
			else{
				flag=1;
			}
		}
		if(flag==1){
			System.out.println("Item not Available.");
			flag=0;
		}		
	}
}
class Purchase extends Sales{
	int purid;
	int purqty;
	double purprice;
	static int pflag=0;
	void pur(Item l[]){
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter Item ID:");
		purid=sc1.nextInt();
		System.out.println("Enter Quantity:");
		purqty=sc1.nextInt();
		for(int i=0;i<5;i++){
			if(purid==l[i].id){
				purid=l[i].id;
				purprice=l[i].price;
				l[i].qty+=purqty;
				pflag=0;
				System.out.println("Item Purchased:");
				System.out.println("ID:"+purid+"--Name:"+l[i].name+"--Quantity:"+purqty+"--Cost:"+purprice*purqty);
				break;
			}
			else{
				pflag=1;
			}
		}
		if(flag==1){
			System.out.println("Item not Available.");
			pflag=0;
		}				
	}	
}
class Bill extends Purchase{
	static double budget=50000.0;
	void bills(){
		budget+=sellprice*sellqty;		
	}
	void billp(){
		budget-=purprice*purqty;
	}
	void displaybudget(){
		System.out.println("Budget: Rs "+budget);
	}
	
}
class Workshop{
	public static void main(String args[]){
		Item l[]=new Item[5];
		Bill b=new Bill();
		int choice;
		for(int i=0;i<5;i++){
			l[i]=new Item();
			l[i].display();
		}
		do{
			System.out.println("Enter Operation:\n1.Sell Parts\n2.Buy Parts\n3.Display Budget\n4.Exit");
			Scanner sc2=new Scanner(System.in);
			choice=sc2.nextInt();
			switch(choice){
				case 1: b.sell(l);
						b.bills();
						break;
				case 2: b.pur(l);
						b.billp();
						break;
				case 3: b.displaybudget();
						break;
				case 4: System.out.println("Thank You.");
						break;
				default: System.out.println("Invalid Option.");
						 break;
			}
		}while(choice!=4);
	}
}
