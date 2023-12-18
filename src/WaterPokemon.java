import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon pokemon, Pokemon enemy) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon enemy) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon enemy) {
    }

    public void rainDance(Pokemon pokemon, Pokemon enemy) {
    }

    List<String> getAttacks() {
        return attacks;
    }
}
