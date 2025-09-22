
public class Nhan2So {
	private InputInterface in;
	private OutputInterface out;
	
	
	
	 public Nhan2So(InputInterface in, OutputInterface out) {
		this.in = in;
		this.out = out;
	}



	void nhan2So() {
		int num1 = in.input();
		int num2 = in.input();//high level
		
		int result = num1 * num2;
		//output
		out.output("Result: " + String.valueOf(result));
	}
}
