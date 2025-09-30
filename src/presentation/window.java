package presentation;
import javax.swing.JFrame;

public class window extends JFrame {


    public window() {
            
        view view = new view();
    
        this.setTitle("Nhan 2 so");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(view);

        this.setVisible(true);

    }

}
