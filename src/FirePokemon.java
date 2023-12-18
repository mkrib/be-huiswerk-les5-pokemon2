import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
       return attacks;
    }

    public void inferno(Pokemon pokemon, Pokemon enemy) {
    }

    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
    }
}
