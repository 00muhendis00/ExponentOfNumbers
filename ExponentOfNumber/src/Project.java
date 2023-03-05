import java.util.Scanner;
public class Project {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number");
		num = input.nextInt();
		
		if(num<0) {
			System.out.print("Error! Please a positive numbers ");
			num = input.nextInt();
		}
		System.out.println("Powers of four");
		for(int i = 1; i<=num;i++) {
			double n1 = Math.pow(4,i);
			System.out.println(n1);
		}
		System.out.println("Powers of five");
		for(int j = 1; j<=num;j++) {
		    double n2 = Math.pow(5,j);
			System.out.println(n2);
		}
	}
}
