import javax.swing.*;

public class Img extends JPanel {
    public Img(String path, int posX, int posY){
//        super();
        setBounds(posX,posY,260,240);

//        ImageIcon img = new ImageIcon("src/Assets/pato.gif");
        ImageIcon img2 = new ImageIcon(path);
        JLabel label =new JLabel(img2);
        add(label);
    }



}
