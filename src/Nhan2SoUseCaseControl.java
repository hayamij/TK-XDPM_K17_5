
public class Nhan2SoUseCaseControl {
	private InputInterface in;
	private OutputInterface out;
	private Nhan2So n2so;


	public Nhan2SoUseCaseControl(InputInterface in, 
			OutputInterface out, Nhan2So n2so) {
		this.in = in;
		this.out = out;
		this.n2so = n2so;
	}
	
	public void execute() {
		out.output("[EM XIN SO 1]:");
		int num1 = in.input();
		out.output("[EM XIN SO 2]:");
		int num2 = in.input();
		n2so.setNumber1(num1);
		n2so.setNumber2(num2);
		int result = n2so.nhan2So();
		
		out.output("Result: " + String.valueOf(result));
	}



}
