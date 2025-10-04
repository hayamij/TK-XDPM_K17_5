import java.io.PrintWriter;
import java.util.Scanner;

import business.Nhan2So;
import business.Nhan2SoUseCaseControl;
import presentation.GUI;
import presentation.InputInterface;
import presentation.OutputInterface;
import presentation.OutputWrappter;
import presentation.SwingUI;

public class AppNhan2So {

	public static void main(String[] args) {

		// Console UI

		// Scanner sc = new Scanner(System.in);
		// PrintWriter pw = new PrintWriter(System.out);
		
		//InputInterface input = new UIConsole(sc, pw);
		// OutputInterface output = new OutputWrappter(pw);

		// GUI (Dialog)

		// InputInterface input = new GUI();
		// OutputInterface output = new GUI();

		//Swing UI
		
		InputInterface input = new SwingUI();
		OutputInterface output = new SwingUI();

		// Usecase Control

		Nhan2So nhan2So = new Nhan2So();
		Nhan2SoUseCaseControl control = new Nhan2SoUseCaseControl(input, output, nhan2So);
		control.execute();
	}
	
	
}
