import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        // Size of a Gameboy*5
        int windowWidth = 144*5;  // 720
        int windowHeight = 160*5; // 800

        this.setBounds(
//                (screenWidth-windowWidth)/2,
                (screenWidth-windowWidth)/5,
                (screenHeight-windowHeight)/2,
                windowWidth,
                windowHeight);

        this.setVisible(true);
    }

}
