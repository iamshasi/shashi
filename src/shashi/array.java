package shashi;

public class array {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		int sum=0;
		for(int i=0; i<5; i++) {
			sum =sum+a[i];
		}
		System.out.println("The Array Elements");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("The Sum of the given Array: " + sum);

	}

}
