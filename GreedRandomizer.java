import java.util.Random;

public class GreedRandomizer {

    public static int[] getDices() {
        int[] dice = {0,0,0,0,0,0};
        for (int i=0; i<=5; i++) {
            int dices = new Random().nextInt(6) + 1;
            dice[i] = dices;
        }
        return dice;
    }
}
