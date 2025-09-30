package presentation;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class view extends JPanel implements Subscriber {
    private model model;
    public static JTextField txtKetQua = new JTextField();
    JTextField txtSo1 = new JTextField();
    JTextField txtSo2 = new JTextField();
    JLabel lblKetQua = new JLabel("Ket qua:");
    JLabel lblSo1 = new JLabel("So 1:");
    JLabel lblSo2 = new JLabel("So 2:");

    public view() {
        model = new model();
        model.subscribe(this);
        
        this.setSize(400, 300);
        this.setLayout(null);
        
        lblSo1.setBounds(20, 50, 80, 30);
        this.add(lblSo1);

        lblSo2.setBounds(20, 100, 80, 30);
        this.add(lblSo2);
        
        lblKetQua.setBounds(20, 150, 80, 30);
        this.add(lblKetQua);

        txtSo1.setBounds(100, 50, 200, 30);
        this.add(txtSo1);

        txtSo2.setBounds(100, 100, 200, 30);
        this.add(txtSo2);

        txtKetQua.setBounds(100, 150, 200, 30);
        txtKetQua.setEditable(false);
        txtKetQua.setText(String.valueOf(model.getResult()));
        this.add(txtKetQua);

        controller controller = new controller(model, txtSo1, txtSo2);
        controller.setBounds(0, 0, 400, 300);
        this.add(controller);
    }
    
    @Override
    public void update() {
        txtKetQua.setText(String.valueOf(model.getResult()));
        System.out.println("da update model len view");
    }
}