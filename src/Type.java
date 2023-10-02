
public enum Type {
    NORMAL(
        new String[] {},
        new String[] { "Rock", "Steel" },
        new String[] { "Ghost" }),

    FIGHTING(
        new String[] { "Normal", "Rock", "Steel", "Ice", "Dark" },
        new String[] { "Flying", "Poison", "Bug", "Psychic" },
        new String[] { "Ghost" }
        ),

    FLYING(
        new String[] { "Fighting", "Grass" },
        new String[] { "Rock", "Steel", "Electric" },
        new String[] {}
        ),

    POISON(
        new String[] { "Grass" },
        new String[] { "Poison", "Ground", "Rock", "Bug" },
        new String[] { "Steel" }
        ),

    GROUND(
        new String[] { "Poison", "Rock", "Steel", "Fire", "Electric" },
        new String[] { "Bug", "Grass" },
        new String[] { "Flying" }
        ),

    ROCK(
        new String[] { "Flying", "Bug", "Fire" },
        new String[] { "Fighting", "Ground", "Steel" },
        new String[] {}
        ),

    BUG(
        new String[] { "Grass", "Psychic", "Dark" },
        new String[] { "Fighting", "Flying", "Poison", "Ghost", "Steel", "Fire" },
        new String[] {}
        ),

    GHOST(
        new String[] { "Ghost", "Psychic" },
        new String[] { "Steel", "Dark" },
        new String[] { "Normal" }
        ),

    STEEL(
        new String[] { "Rock", "Ice" },
        new String[] { "Steel", "Fire", "Water", "Electric" },
        new String[] {}
        ),

    FIRE(
        new String[] { "Grass", "Ice", "Bug" },
        new String[] { "Fire", "Water", "Rock", "Dragon" },
        new String[] {}
        ),

    WATER(
        new String[] { "Fire", "Rock", "Ground" },
        new String[] { "Water", "Grass", "Dragon" },
        new String[] {}
        ),

    GRASS(
        new String[] { "Water", "Ground", "Rock" },
        new String[] { "Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel" },
        new String[] {}
        ),

    ELECTRIC(
        new String[] { "Water", "Flying" },
        new String[] { "Grass", "Electric", "Dragon" },
        new String[] { "Ground" }
        ),

    PSYCHIC(
        new String[] { "Fighting", "Poison" },
        new String[] { "Psychic", "Steel" },
        new String[] { "Dark" }
        ),

    ICE(
        new String[] { "Grass", "Ground", "Flying", "Dragon" },
        new String[] { "Fire", "Water", "Ice", "Steel" },
        new String[] {}
        ),

    DRAGON(
        new String[] { "Dragon" },
        new String[] { "Steel" },
        new String[] {}
        ),

    DARK(
        new String[] { "Psychic", "Ghost" },
        new String[] { "Fighting", "Dark", "Steel" },
        new String[] {}
        ),
    NULL(
        new String[] {},
        new String[] {},
        new String[] {}
    );


    private final String[] SUPER_EFFECTIVE, NOT_VERY_EFFECTIVE, NO_EFFECT;

    Type(String[] superEffective, String[] notVeryEffective, String[] noEffect) {
        this.SUPER_EFFECTIVE = superEffective;
        this.NOT_VERY_EFFECTIVE = notVeryEffective;
        this.NO_EFFECT = noEffect;
    }

    public int getTypeModifier(Type type){

        int defaultModifier = 1;

        for (String t : this.SUPER_EFFECTIVE){
            if (type.equals(t)){
                // defaultModifier *=2;
                System.out.println("caiu");
            }else{
                System.out.println("n caius n");
            }
        }
        
        
        return 1;
    }




}
