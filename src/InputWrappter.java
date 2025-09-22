import java.util.Scanner;

public class InputWrappter implements InputInterface{
	private Scanner in;

	public InputWrappter(Scanner in) {
		this.in = in;
	}
	
	@Override
	public int input() {
		return in.nextInt();
	}
	
	

}
