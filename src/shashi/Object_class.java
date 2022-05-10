package shashi;

public class Object_class {
	
	int sno;
	String  name;
	int marks;
	void display() {
		System.out.println("student no:"+ sno);
		System.out.println("name:"+name);
		System.out.println("marks:"+marks);
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("Student 1");
		Object_class s1=new Object_class();
		s1.sno=123;
		s1.name="shashi";
		s1.marks=80;
		s1.display();
		
		System.out.println("Student 2");
		Object_class s2=new Object_class();
		s2.sno=143;
		s2.name="jehovah";
		s2.marks=100;
		s2.display();
				
		
				
		

	}

}

