import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Window window = new Window("Window Title");

        MyButton atk1 = new MyButton("Atack1",50,500);
        MyButton atk2 = new MyButton("Atack2",250,500);
        MyButton atk3 = new MyButton("Atack3",50,600);
        MyButton atk4 = new MyButton("Atack4",250,600);

//        Img imgPlayer = new Img("src/Assets/pato.gif", 320,0);
//        Img imgBot = new Img("src/Assets/pato.gif",0,240);
        Img imgPlayer = new Img("src/Assets/red.png", 350,0);
        Img imgBot = new Img("src/Assets/red.png",10,240);

        HealthBar healthPlayer = new HealthBar(10,480);
        HealthBar healthBot = new HealthBar(320,240);

        //adding health bars
        window.add(healthPlayer);
        window.add(healthBot);

        //adding imgs
        window.add(imgPlayer);
        window.add(imgBot);

        //ad atack buttons
        window.add(atk1);
        window.add(atk2);
        window.add(atk3);
        window.add(atk4);

        window.setVisible(true);
    }
}