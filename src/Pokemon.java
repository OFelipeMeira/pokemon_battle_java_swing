public class Pokemon {

    private String name;
    
    private int hpTotal;
    private int hpCurrent;
    private int atack;
    private int defense;
    private int specialAtack;
    private int specialDefense;
    private int speed;

    private String type;

    public Pokemon(String pokemonName) {
        switch (pokemonName.toUpperCase()) {
            case "CHARIZARD" -> {
                setHpTotal(78);
                setHpCurrent(78);
                setAtack(84);
                setDefense(78);
                setSpecialAtack(109);
                setSpecialDefense(85);
                setSpeed(100);
                setType("FIRE");
                setName(pokemonName);
            }
            case "BLASTOISE" -> {
                setHpTotal(79);
                setHpCurrent(79);
                setAtack(83);
                setDefense(100);
                setSpecialAtack(85);
                setSpecialDefense(105);
                setSpeed(78);
                setType("WATER");
                setName(pokemonName);
            }
            case "VENOSSAUR" -> {
                setHpTotal(80);
                setHpCurrent(80);
                setAtack(82);
                setDefense(83);
                setSpecialAtack(100);
                setSpecialDefense(100);
                setSpeed(80);
                setType("GRASS");
                setName(pokemonName);
            }
            default -> {
                setHpTotal(0);
                setHpCurrent(0);
                setAtack(0);
                setDefense(0);
                setSpecialAtack(0);
                setSpecialDefense(0);
                setSpeed(0);
                setType("");
                setName(pokemonName);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHpTotal() {
        return hpTotal;
    }

    public void setHpTotal(int hpTotal) {
        this.hpTotal = hpTotal;
    }

    public int getHpCurrent() {
        return hpCurrent;
    }

    public void setHpCurrent(int hpCurrent) {
        this.hpCurrent = hpCurrent;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAtack() {
        return specialAtack;
    }

    public void setSpecialAtack(int specialAtack) {
        this.specialAtack = specialAtack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
