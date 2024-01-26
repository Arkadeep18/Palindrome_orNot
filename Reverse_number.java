import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int num = n;
		int reverse;
		int store = 0;
		while(n>0) {
			reverse = n%10;
			store = store*10+reverse;
			n = n/10;
		}
		System.out.println(store);
		
		if(num==store) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("It's not a palindrome");
		}
		
	}

}
