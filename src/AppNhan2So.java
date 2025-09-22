import java.util.Scanner;

public class AppNhan2So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhan2So();
	}
	
	static void nhan2So() {
		//Bàn phím - input
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		
		int result = num1 * num2;//high level
		
		//output
		System.out.println("Result: " + result);
	}

}
