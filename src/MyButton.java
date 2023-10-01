import javax.swing.*;


public class MyButton extends JButton {
    public MyButton(int posX, int posY, String text) {
        int width = 240;
        int height = 150;
        this.setBounds(posX, posY, width, height);
        this.setText(text);
        this.setVisible(true);
    }

}
