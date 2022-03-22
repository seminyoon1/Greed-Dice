import java.util.Random;
public class Greed{
  public static void main(String args[]) {
	int[] dices = {0,0,0,0,0,0};
	for (int i=0; i<=5; i++) {
		int dice = new Random().nextInt(6) + 1;
		dices[i] = dice;
	}
	int score = GreedCalculator.greedy(dices);
	System.out.println("Your score is: " + score);
  }
}