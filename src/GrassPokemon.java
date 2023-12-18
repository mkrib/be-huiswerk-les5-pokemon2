import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

//    Waar komt de onderstaande enemy vandaan? Ik liep hier eigenlijk vast, maar ik zag in de uitwerkingen dat het zo moest. Door het nu op deze manier in te leveren hoop ik dat jij me kan vertellen waarom ik hier vastliep. Bedankt alvast! :)

//    public void leafStorm(Pokemon name, Pokemon enemy) {
//        System.out.println(name.getName() + " performed LeafStorm " + enemy.getName());
//        switch (enemy.getType()) {
//            case "water" -> {
//                System.out.println(enemy.getName() + " loses 20 hp");
//                enemy.setHp(enemy.getHp() - 20);
//            }
//            case "electric" -> {
//                System.out.println(enemy.getName() + " loses 40 hp");
//                enemy.setHp(enemy.getHp() - 40);
//            }
//            case "fire" -> {
//                System.out.println(enemy.getName() + " loses 30 hp");
//                enemy.setHp(enemy.getHp() - 30);
//            }
//            case "grass" -> {
//                System.out.println(enemy.getName() + " loses 10 hp");
//                enemy.setHp(enemy.getHp() - 10);
//            }
//        }
//        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
//    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
    }
}
