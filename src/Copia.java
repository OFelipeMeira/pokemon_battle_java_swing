
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public enum Copia {
    BULBASAUR(Generation1.BULBASAUR),
    IVYSAUR(Generation1.IVYSAUR),
    VENUSAUR(Generation1.VENUSAUR),
    CHARMANDER(Generation1.CHARMANDER),
    CHARMELEON(Generation1.CHARMELEON),
    CHARIZARD(Generation1.CHARIZARD),
    SQUIRTLE(Generation1.SQUIRTLE),
    WARTORTLE(Generation1.WARTORTLE),
    BLASTOISE(Generation1.BLASTOISE),

    private enum Generation1 {
        BULBASAUR("Bulbasaur", "001", (short)45, new short[] {45, 49, 49, 65, 65, 45}, (short)64, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 9, 13, 13, 15, 19, 21, 25, 27, 31, 33, 37}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SEED_BOMB}), Type.GRASS, Type.POISON),
        IVYSAUR("Ivysaur", "002", (short)45, new short[] {60, 62, 63, 80, 80, 60}, (short)142, new byte[] {0, 0, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 36, 39, 44}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        VENUSAUR("Venusaur", "003", (short)45, new short[] {80, 82, 83, 100, 100, 80}, (short)236, new byte[] {0, 0, 0, 2, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 32, 39, 45, 53}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.PETAL_DANCE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        CHARMANDER("Charmander", "004", (short)45, new short[] {39, 52, 43, 60, 50, 65}, (short)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARMELEON("Charmeleon", "005", (short)45, new short[] {58, 64, 58, 80, 65, 80}, (short)142, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 7, 10, 17, 21, 28, 32, 39, 43, 50, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARIZARD("Charizard", "006", (short)45, new short[] {78, 84, 78, 109, 85, 100}, (short)240, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 10, 17, 21, 28, 32, 36, 41, 47, 56, 62, 71, 77}, new Move[] {Move.DRAGON_CLAW, Move.SHADOW_CLAW, Move.AIR_SLASH, Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.WING_ATTACK, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO, Move.HEAT_WAVE, Move.FLARE_BLITZ}), Type.FIRE, Type.FLYING),
        SQUIRTLE("Squirtle", "007", (short)45, new short[] {44, 48, 65, 50, 64, 43}, (short)63, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        WARTORTLE("Wartortle", "008", (short)45, new short[] {59, 63, 80, 65, 80, 58}, (short)142, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        BLASTOISE("Blastoise", "009", (short)45, new short[] {79, 83, 100, 85, 105, 78}, (short)239, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 39, 46, 53, 60}, new Move[] {Move.FLASH_CANNON, Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        

        private final Map<Move, Integer> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Copia[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE, EXP_YIELD;

        Generation1(final String name, final String dexNumber, final short catchRate, final short[] stats,
                short expYield, byte[] evYield,
                GenderRatio ratio, ExperienceGroup group, Map<Move, Integer> learnset, final Type... type) {
            if (type.length > 2) {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            } else if (type.length == 0) {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            EXP_YIELD = expYield;
            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] { evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5] };
            BASE_STATS = new short[] { stats[0], stats[1], stats[2], stats[3], stats[4], stats[5] };
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            EXP_GROUP = group;
        }
    }

    private enum GenderRatio {
        MALE_ONLY((byte) 100),
        ONE_FEMALE_SEVEN_MALE((float) 87.5),
        ONE_FEMALE_THREE_MALE((byte) 75),
        ONE_FEMALE_ONE_MALE((byte) 50),
        THREE_FEMALE_ONE_MALE((byte) 25),
        FEMALE_ONLY((byte) 0),
        GENDERLESS((byte) -1);

        private final float PERCENT_MALE;

        GenderRatio(byte percentMale) {
            PERCENT_MALE = percentMale;
        }

        GenderRatio(float percentMale) {
            PERCENT_MALE = percentMale;
        }

        public Gender getGender() {
            switch ((byte) PERCENT_MALE) {
                case 100:
                    return Gender.MALE;
                case 0:
                    return Gender.FEMALE;
                case -1:
                    return Gender.GENDERLESS;
            }

            byte t = (byte) ((Math.random() * 100) + 1);
            return t <= PERCENT_MALE ? Gender.MALE : Gender.FEMALE;
        }
    }

    private enum ExperienceGroup {
        ERRATIC,
        FAST,
        MEDIUM_FAST,
        MEDIUM_SLOW,
        SLOW,
        FLUCTUATING;

        public int getExpForLevel(final byte level) {
            switch (this) {
                case ERRATIC:
                    return calcErratic(level);
                case FAST:
                    return calcFast(level);
                case MEDIUM_FAST:
                    return calcMedFast(level);
                case MEDIUM_SLOW:
                    return calcMedSlow(level);
                case SLOW:
                    return calcSlow(level);
                case FLUCTUATING:
                    return calcFluctuating(level);
                default:
                    throw new IllegalStateException("Enum " + this.toString().toLowerCase() + " is illlegal");
            }
        }

        private int calcErratic(byte level) {
            if (level > 0 && level <= 50) {
                return (int) ((Math.pow(level, 3) * (100 - level)) / 50);
            } else if (level > 50 && level <= 68) {
                return (int) ((Math.pow(level, 3) * (150 - level)) / 100);
            } else if (level > 68 && level <= 98) {
                return (int) ((Math.pow(level, 3) * ((1911 - 10 * level) / 3)) / 500);
            } else if (level > 98 && level <= 100) {
                return (int) ((Math.pow(level, 3) * (160 - level)) / 100);
            } else {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }

        private int calcFast(byte level) {
            if (level > 0 && level <= 100) {
                return (int) ((4 * Math.pow(level, 3)) / 5);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedFast(byte level) {
            if (level > 0 && level <= 100) {
                return (int) Math.pow(level, 3);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedSlow(byte level) {
            if (level > 0 && level <= 100) {
                return (int) (((6 * Math.pow(level, 3)) / 5) - (15 * Math.pow(level, 2)) + (100 * level) - 140);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcSlow(byte level) {
            if (level > 0 && level <= 100) {
                return (int) ((5 * Math.pow(level, 3)) / 4);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcFluctuating(byte level) {
            if (level > 0 && level <= 15) {
                return (int) (Math.pow(level, 3) * ((((level + 1) / 3) + 24) / 50));
            } else if (level > 15 && level <= 36) {
                return (int) (Math.pow(level, 3) * ((level + 14) / 50));
            } else if (level > 36 && level <= 100) {
                return (int) (Math.pow(level, 3) * (((level / 2) + 32) / 50));
            } else {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }
    }

    private final Map<Move, Integer> LEARNSET;
    private final ExperienceGroup EXP_GROUP;
    private final Copia[] EVOLUTION;
    private final GenderRatio GENDER_RATIO;
    private final short[] BASE_STATS;
    private final byte[] EV_YIELD;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private final short CATCH_RATE, EXP_YIELD;

    Copia(Generation1 g) {
        LEARNSET = g.LEARNSET;
        EXP_YIELD = g.EXP_YIELD;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    public Map<Move, Integer> getLearnset() {
        return LEARNSET;
    }

    public boolean hasEvolutions() {
        return EVOLUTION != null;
    }

    public int calculateExp(int level) {
        return EXP_GROUP.getExpForLevel((byte) level);
    }

    public boolean hasEvolution(Copia s) {
        return contains(EVOLUTION, s);
    }

    private static Map<Move, Integer> convertToMap(int[] a, Move[] b) {
        // TODO Fix the Map problem THE RIGHT WAY
        if (a.length != b.length) {
            throw new IllegalArgumentException("a and b must be the same length");
        }

        Map<Move, Integer> m = new TreeMap<>();

        for (int i = 0; i < a.length; i++) {
            // The -1 denotes a Move that isn't applicable for BW2. Thusly, it's ignored
            if (a[i] != -1) {
                m.put(b[i], a[i]);
            }
        }

        return m;
    }

    private boolean contains(Copia[] spec, Copia s) {
        for (Copia Copia : spec) {
            if (Copia == s) {
                return true;
            }
        }

        return false;
    }

    public byte[] getEVYields() {
        return EV_YIELD;
    }

    public byte getYield(final byte stat) {
        return EV_YIELD[stat];
    }

    public short getCatchRate() {
        return CATCH_RATE;
    }

    public short getExpYield() {
        return EXP_YIELD;
    }

    public String getDexNumber() {
        return NAT_DEX_NUMBER;
    }

    /**
     * Retrieves the base value for the desired stat
     * 
     * @param stat The stat constant of the stat to get
     * @return The base value of that stat
     * @throws ArrayIndexOutOfBoundsException If the passed in constant is invalid
     */
    public short getBaseStat(final int stat) throws ArrayIndexOutOfBoundsException {
        return BASE_STATS[stat];
    }

    public Gender getGender() {
        return GENDER_RATIO.getGender();
    }

    /**
     * Returns Name of the Pokemon
     *
     * @return Name of the Pokemon
     */
    public String getName() {
        return NAME;
    }

    /**
     * This does the damage calculation from the actual Pokemon game and
     * returns the final damage. Props to the equation from
     * http://www.math.miami.edu/~jam/azure/compendium/battdam.htm
     *
     * @param m Move being used
     * @param p Pokemon attacking
     * @return Final damage
     */
    private int damageFormula(Move m, Pokemon p) {
        /*
         * //Fix up this method to make it more visually appealing
         * int a = p.getLevel(), b = p.getInBattleStat(ATTACK), c = m.power(),
         * d = inBattleStats[DEFENSE], x = 1, z = new Random().nextInt(38) + 217,
         * y = superEffective(m), value;
         * 
         * 
         * if(m.getType().equalsIgnoreCase("PSN"))
         * {
         * status[POISONED] = true;
         * }
         * if(m.getName().equalsIgnoreCase("Dragon Rage"))
         * {
         * return 40;
         * }
         * 
         * value = 2 * a;
         * value /= 5;
         * if (value < 1.0)
         * {
         * value = 1;
         * }
         * value += 2;
         * value *= b;
         * value *= c;
         * value /= d;
         * if (value < 1.0)
         * {
         * value = 1;
         * }
         * value /= 50;
         * if (value < 1.0)
         * {
         * value = 1;
         * }
         * value += 2;
         * value *= x;
         * value *= y;
         * value /= 10;
         * if (value < 1.0)
         * {
         * value = 1;
         * }
         * value *= z;
         * value /= 255;
         * if (value < 1.0)
         * {
         * value = 1;
         * }
         * if(value == 0)
         * {
         * value = 1;
         * }
         * //orignal eq'n((((((((2 * a / 5) + 2) * b * c)
         * /// d) / 50) + 2) * 1) * y / 10) * z / 255;
         * return value;
         */

        return 0; // Shut up the compiler
    }

    /**
     * Gets the first type of the Pokemon
     * 
     * @return Their first type
     */
    public Type[] getType() {
        return TYPE;
    }
}