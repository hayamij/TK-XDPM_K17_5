import java.io.PrintWriter;

public class OutputWrappter implements OutputInterface{
	private PrintWriter out;
	
	
	
	public OutputWrappter(PrintWriter out) {
		this.out = out;
	}



	@Override
	public void output(String str) {
		out.println(str);
		out.flush();
	}

}
