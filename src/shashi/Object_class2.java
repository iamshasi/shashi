package shashi;

public class Object_class2 {
	int reg_num;
	String name;
	int marks1;
	int marks2;
	int marks3;
	int total;
	
	void display() {
	System.out.println("Reg No." + reg_num);
	System.out.println("Name: " + name);
	System.out.println("Maths: " + marks1);
	System.out.println("Science: " + marks2);
	System.out.println("Social: " + marks3);
	System.out.println("Student Total: " + total);
	}
	
	void calculate_total() {
		total=(marks1+marks2+marks3);
		
	}

	public static void main(String[] args) {
		System.out.println("student");
		Object_class2 s=new Object_class2();
		s.reg_num=12345;
		s.name="shashi";
		s.marks1=100;
		s.marks2=90;
		s.marks3=80;
		s.total=270;
		s.display();
		
		
		
		
		
		
		
		

	}

}
