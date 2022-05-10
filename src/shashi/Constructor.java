package shashi;

public class Constructor {
	int Reg_no;
	String Name;
	String Model="Hero";
	String colour="blue";
	double price=50000;
	
	Constructor(){
		System.out.println("Bike is created");
		
	}
	void display() {
		System.out.println("Bike Reg no:"+Reg_no);
		System.out.println(("Bike name:"+ Name));
		System.out.println("model:"+Model);
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
		
	}
	
	public static void main(String[] args) {
		Constructor bik1=new Constructor();
		bik1. Reg_no=1234;
		bik1.Name="splendor";
		
		bik1.display();
		

	}

}

