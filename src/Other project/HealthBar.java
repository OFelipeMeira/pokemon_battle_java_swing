import javax.swing.*;
import java.awt.*;

public class HealthBar extends JLabel {
    int totalHealth;
    int currentHealth;
    public HealthBar(int posX, int posY,int totalHealth){
        setBounds(posX,posY,300,10);
        setBackground(Color.CYAN);
        setOpaque(true);
        this.totalHealth = totalHealth;
    }

    public void damage(int damage){
        int damagePx = damage*300/this.totalHealth;

        this.getWidth();

        this.setSize();

    }

}
