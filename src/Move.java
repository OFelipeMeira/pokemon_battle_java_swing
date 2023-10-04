public enum Move {
    /* Bulbassaur */
    TACKLE(
        "Tackle",
        40,
        Type.NORMAL,
        MoveCategory.PHYSICAL),
    VINE_WHIP(
        "Vine whip",
        45,
        Type.GRASS,
        MoveCategory.PHYSICAL),
    RAZOR_LEAF(
        "Razor Leaf",
        55,
        Type.GRASS,
        MoveCategory.PHYSICAL),

    /* Charmander */
    SCRATCH(
        "Scratch",
        40,
        Type.NORMAL,
        MoveCategory.PHYSICAL),
    EMBER(
        "Ember",
        40,
        Type.FIRE,
        MoveCategory.SPECIAL),
    DRAGON_BREATH(
        "Dragon Breath",
        60,
        Type.DRAGON,
        MoveCategory.SPECIAL),

    /* Squirtle */

    BITE(
        "Bite",
        60,
        Type.DARK,
        MoveCategory.PHYSICAL),
    WATER_GUN(
        "Water Gun",
        40,
        Type.WATER,
        MoveCategory.SPECIAL),
    WATER_PULSE(
        "Water Pulse",
        60,
        Type.WATER,
        MoveCategory.SPECIAL),
    
    
    None(
        "",
        0,
        Type.NULL,
        MoveCategory.NULL
    )
    ;

    private final String NAME;
    private final MoveCategory CATEGORY;
    private final Type TYPE;
    private final double POWER;

    Move(String name, double power, Type type, MoveCategory category) {
            this.NAME = name;
            this.TYPE = type;
            this.POWER = power;
            this.CATEGORY = category;
        }

}
