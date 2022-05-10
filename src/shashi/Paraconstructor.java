package shashi;

public class Paraconstructor {
	
	int reg_no;
	String name;
	int model;
	String  colour;
	double price;
	
	Paraconstructor(){
		System.out.println("Bike is created");
	}
	
	//parameterized constructor
	Paraconstructor(int reg_no,String name,int model,String colour,double price){
		
		
		this.reg_no=reg_no;
		this.name=name;
		
		this.model=model;
		this.colour=colour;
		this.price=price;
		
	}
	
	void display() {
		System.out.println("Bike reg_no:"+reg_no);
		System.out.println("Bike name:"+name);
		System.out.println("model:"+model);
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
		run();
	}
	
		
		
		void run() {
			System.out.println("Bike is run");
			
			
		}
		
	
	public static void main(String[] args) {
	Paraconstructor details=new Paraconstructor(6516,"honda",2107,"white",75000);
	details.display();

	}

}
