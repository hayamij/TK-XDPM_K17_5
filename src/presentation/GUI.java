package presentation;
import javax.swing.JOptionPane;

public class GUI implements InputInterface, OutputInterface{

	@Override
	public InputData input() {

		String strNum1 = JOptionPane.showInputDialog("[EM XIN SỐ 1]");
		String strNum2 = JOptionPane.showInputDialog("[EM XIN SỐ 2]");

		InputData inData = new InputData(Integer.parseInt(strNum1), Integer.parseInt(strNum2));
		return inData;
	}

	@Override
	public void output(String result) {
		JOptionPane.showMessageDialog(null, result);
	}
}
