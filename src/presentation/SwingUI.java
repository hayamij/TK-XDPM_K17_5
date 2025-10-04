package presentation;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;

public class SwingUI extends JFrame implements InputInterface, OutputInterface {

    private String text1;
    private String text2;
    private CountDownLatch latch;

    public SwingUI() {
        this.setTitle("Swing UI");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @Override
    public InputData input() {
        latch = new CountDownLatch(1);
        
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton("Submit");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Số 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Số 2:"));
        panel.add(textField2);
        panel.add(button);
        this.add(panel);
        this.setVisible(true);

        button.addActionListener(e -> {
            text1 = textField1.getText();
            text2 = textField2.getText();
            System.out.println("Input 1: " + text1);
            System.out.println("Input 2: " + text2);
            latch.countDown(); // Báo hiệu đã nhập xong
        });

        try {
            latch.await(); // Chờ user click Submit
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        InputData inData = new InputData(Integer.parseInt(text1), Integer.parseInt(text2));
        return inData;
    }

    @Override
    public void output(String str) {
        JOptionPane.showMessageDialog(this, str, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }
}