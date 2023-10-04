import javax.swing.*;

public class MyButton extends JButton {
    public MyButton(String text, int posX, int posY){
        super(text);
        this.setSize(200, 100);
        this.setLocation(posX,posY);
        this.addActionListener( e -> System.out.println(this.getText()));
    }


}
