import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Creating the window
        MyWindow window = new MyWindow("Poke battle");

        // Creating a list of moves - Player
        ArrayList<ArrayList> playerMoves = setPlayerMoves();

        // Creating a list of moves - BOT
        ArrayList<ArrayList> botMoves = setBotMoves();

        // Creating Pokemons - to get battle stats
        Pokemon playerPokemon = new Pokemon("Charizard");
        Pokemon botPokemon = new Pokemon("Venossaur");

        // Health
        MyHealth playerHealth = new MyHealth(380, 350);
        MyHealth botHealth = new MyHealth(150, 100);

        // Creating the atack buttons
        MyButton atk1 = new MyButton(80, 450, (String) playerMoves.get(0).get(0));
        MyButton atk2 = new MyButton(320, 450, (String) playerMoves.get(1).get(0));
        MyButton atk3 = new MyButton(80, 600, (String) playerMoves.get(2).get(0));
        MyButton atk4 = new MyButton(320, 600, (String) playerMoves.get(3).get(0));

        // randomizer to get next bot atack
        Random rnd = new Random();

        // Setting attacks
        atk1.addActionListener(e -> {

            int aux = rnd.nextInt(4);

            if (playerPokemon.getSpeed() >= botPokemon.getSpeed()) {
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(0));
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(aux));
            } else {
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(aux));
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(0));
            }

            System.out.println(aux);

            updateData(playerPokemon, botPokemon, playerHealth, botHealth);
        });
        atk2.addActionListener(e -> {
            if (playerPokemon.getSpeed() >= botPokemon.getSpeed()) {
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(1));
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
            } else {
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(1));
            }

            updateData(playerPokemon, botPokemon, playerHealth, botHealth);
        });
        atk3.addActionListener(e -> {
            if (playerPokemon.getSpeed() >= botPokemon.getSpeed()) {
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(2));
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
            } else {
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(2));
            }

            updateData(playerPokemon, botPokemon, playerHealth, botHealth);
        });
        atk4.addActionListener(e -> {
            if (playerPokemon.getSpeed() >= botPokemon.getSpeed()) {
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(3));
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
            } else {
                // Bot Atack
                atack(botPokemon, playerPokemon, botMoves.get(rnd.nextInt(3)));
                // Player Atack
                atack(playerPokemon, botPokemon, playerMoves.get(3));
            }

            updateData(playerPokemon, botPokemon, playerHealth, botHealth);
        });

        // Inserting all elements in the Screen
        window.add(atk1);
        window.add(atk2);
        window.add(atk3);
        window.add(atk4);
        window.add(playerHealth);
        window.add(botHealth);

        updateData(playerPokemon, botPokemon, playerHealth, botHealth);

    }

    public static ArrayList<ArrayList> setPlayerMoves() {
        // Setting a move list for Player ======== Charizard
        // Move 1
        ArrayList<String> move1 = new ArrayList<>();
        move1.add("Ember"); // Name
        move1.add("Fire"); // Type
        move1.add("40"); // Power Damage
        move1.add("Special"); // Category

        // Move 2
        ArrayList<String> move2 = new ArrayList<>();
        move2.add("Flamethrower"); // Name
        move2.add("Fire"); // Type
        move2.add("90"); // Damage
        move2.add("Special"); // Category

        // Move 3
        ArrayList<String> move3 = new ArrayList<>();
        move3.add("Scratch"); // Name
        move3.add("Normal"); // Type
        move3.add("40"); // Damage
        move3.add("Physical"); // Category

        // Move 4
        ArrayList<String> move4 = new ArrayList<>();
        move4.add("Fire Spin"); // Name
        move4.add("Fire"); // Type
        move4.add("35"); // Damage
        move4.add("Special"); // Category

        ArrayList<ArrayList> moves = new ArrayList<>();
        moves.add(move1);
        moves.add(move2);
        moves.add(move3);
        moves.add(move4);
        return moves;
    }

    public static ArrayList<ArrayList> setBotMoves() {
        // Setting a move list for Player ======== Charizard
        // Move 1
        ArrayList<String> move1 = new ArrayList<>();
        move1.add("Ember"); // Name
        move1.add("Fire"); // Type
        move1.add("40"); // Power Damage
        move1.add("Special"); // Category

        // Move 2
        ArrayList<String> move2 = new ArrayList<>();
        move2.add("Flamethrower"); // Name
        move2.add("Fire"); // Type
        move2.add("90"); // Damage
        move2.add("Special"); // Category

        // Move 3
        ArrayList<String> move3 = new ArrayList<>();
        move3.add("Scratch"); // Name
        move3.add("Normal"); // Type
        move3.add("40"); // Damage
        move3.add("Physical"); // Category

        // Move 4
        ArrayList<String> move4 = new ArrayList<>();
        move4.add("Fire Spin"); // Name
        move4.add("Fire"); // Type
        move4.add("35"); // Damage
        move4.add("Special"); // Category

        ArrayList<ArrayList> moves = new ArrayList<>();
        moves.add(move1);
        moves.add(move2);
        moves.add(move3);
        moves.add(move4);
        return moves;
    }

    public static void atack(Pokemon atackingPokemon, Pokemon defendingPokemon, ArrayList<String> move) {
        Random rnd = new Random();

        float level = 36; // Level of atacking pokemon
        float crit = rnd.nextInt(1, 11); // 10% from 2x damage
        if (crit < 1) {
            crit = 2;
        } else {
            crit = 1;
        }

        float power = Float.parseFloat(move.get(2)); // Move damage
        float pokeAtk;
        float pokeDef;

        // Pokemon atacking power - depends on the category of the move
        // (Physical/Special)
        if (move.get(3).equals("Physical")) {
            pokeAtk = atackingPokemon.getAtack();
            pokeDef = defendingPokemon.getDefense();
        } else {
            pokeAtk = atackingPokemon.getSpecialAtack();
            pokeDef = defendingPokemon.getSpecialDefense();
        }

        // Damage modifier depending on defending pokemon type, and move type
        float typeAdvantage = 1;

        // Damage calc:
        float dmg = ((2 * level) / 5) + 2; // constants
        dmg = (((dmg * power * (pokeAtk / pokeDef)) / 50) + 2) * crit * typeAdvantage; // modifiers

        int defHp = defendingPokemon.getHpCurrent();
        defendingPokemon.setHpCurrent(defHp - (int) dmg);

        System.out.println("Pokemon "+ atackingPokemon.getName()+ " uses "+ move.get(0) + " dealing "+ dmg +" of damage");

        // System.out.println("Damage: " + dmg);

        if (defendingPokemon.getHpCurrent() <= 0) {
            System.out.println("===================================================");
            System.out.println("POKEMON " + defendingPokemon.getName() + " FAINTED...");
            System.out.println("CONGRATULATIONS "+ atackingPokemon.getName());
            System.out.println("===================================================");
            System.exit(0);
        }
    }

    public static void updateData(Pokemon playerPokemon, Pokemon botPokemon, MyHealth playerHealth,
            MyHealth botHealth) {

        if (playerPokemon.getHpCurrent() <= 50) {
            playerHealth.setForeground(Color.YELLOW);
        }
        if (playerPokemon.getHpCurrent() <= 25) {
            playerHealth.setForeground(Color.RED);
        }
        if (botPokemon.getHpCurrent() <= 50) {
            botHealth.setForeground(Color.YELLOW);
        }
        if (botPokemon.getHpCurrent() <= 25) {
            botHealth.setForeground(Color.RED);
        }

        playerHealth.setText(Integer.toString(playerPokemon.getHpCurrent()));
        botHealth.setText(Integer.toString(botPokemon.getHpCurrent()));
    }

}