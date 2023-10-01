import javax.swing.*;

public class MyImage extends JPanel{
    public MyImage(){
        ImageIcon img = new ImageIcon("src/Images/teste.png");

        JLabel label = new JLabel(img);
        label.setSize(150,150);

        add(label);

    }
}
