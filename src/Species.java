
public enum Species {

    BULBASAUR(
            "Bulbasaur",
            45,
            49,
            49,
            65,
            65,
            45,
            Type.GRASS,
            Type.POISON
    ),
    CHARMANDER(
            "Charmander",
            39,
            52,
            43,
            60,
            50,
            65,
            Type.FIRE,
            Type.NULL
    ),
    SQUIRTLE(
            "Squirtle",
            44,
            48,
            65,
            50,
            64,
            43,
            Type.WATER,
            Type.NULL
            ),
    PIKACHU(
            "Pikachu",
            35,
            55,
            30,
            50,
            40,
            90,
            Type.ELECTRIC,
            Type.NULL
            );

    private  String NAME;
    private int HP, ATACK, DEFENSE, SPECIAL_ATACK, SPECIAL_DEFENSE, SPEED;
    private Type TYPE_1;
    private Type TYPE_2;

    Species(String name, int hp, int atack, int defense, int specialAtack, int specialDefense, int speed, Type type_1, Type type_2) {
        this.NAME = name;
        this.HP = hp;
        this.ATACK = atack;
        this.DEFENSE = defense;
        this.SPECIAL_ATACK = specialAtack;
        this.SPECIAL_DEFENSE = specialDefense;
        this.SPEED = speed;
        this.TYPE_1 = type_1;
        this.TYPE_2 = type_2;
    }

    public int getATACK() {
        return ATACK;
    }

    public int getDEFENSE() {
        return DEFENSE;
    }
    public int getHP() {
        return HP;
    }
    public String getNAME() {
        return NAME;
    }
    public int getSPECIAL_ATACK() {
        return SPECIAL_ATACK;
    }
    public int getSPECIAL_DEFENSE() {
        return SPECIAL_DEFENSE;
    }
    public int getSPEED() {
        return SPEED;
    }

    public int getTypeModifier(){
        int modifier;
        modifier = this.TYPE_1.getTypeModifier(Type.GRASS);

        return modifier;
    }

}
