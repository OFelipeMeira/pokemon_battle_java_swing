import javax.swing.*;
import java.awt.*;

public class MyHealth extends JLabel {
    public MyHealth(int posX, int posY) {

        this.setBounds(posX,posY,70,50);
        this.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 30));

        this.setVisible(true);

    }
}
