import java.util.List;
import java.util.Map;

public abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;

//    5 private final variabelen
//    1 private variabele
//    1 constructor
//    6 getters
//    1 setter

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }
}
