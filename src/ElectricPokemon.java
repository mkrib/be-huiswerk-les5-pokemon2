import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";
    List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon enemy) {
    }

    public void electroBall(Pokemon pokemon, Pokemon enemy) {
    }

    public void thunder(Pokemon pokemon, Pokemon enemy) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon enemy) {
    }
}
