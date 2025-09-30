package presentation;

import business.DTO;
import business.usecase;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class controller extends JPanel {
    public int result;
    private usecase usecase;
    private DTO dto;
    private model model;
    private JTextField txtSo1;
    private JTextField txtSo2;

    public controller(model model, JTextField txtSo1, JTextField txtSo2) {
        this.model = model;
        this.txtSo1 = txtSo1;
        this.txtSo2 = txtSo2;

        this.setLayout(null);

        // Tạo button
        JButton btnNhan = new JButton("Nhan");
        btnNhan.setBounds(150, 200, 100, 30);
        this.add(btnNhan);
        
        // Xử lý sự kiện
        btnNhan.addActionListener(e -> {
            String so1 = txtSo1.getText();
            String so2 = txtSo2.getText();
            execute(so1, so2);
        });
    }

    public int execute(String so1, String so2) {
        usecase = new usecase(so1, so2);
        usecase.execute();
        dto = usecase.dto();
        result = dto.getResult();
        model.setResult(result);
        return result;
    }
}