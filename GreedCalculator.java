public class GreedCalculator {
    public static int greedy(int[] dice){
        int score = 0;
        int[] count = {0,0,0,0,0,0};
        for(int i = 0; i < 5; i++) {
          int place = dice[i] - 1;
          count[place]++;
        }
        for(int i = 0; i < 6; i++) {
          if(i == 0) {
            if(count[i] >= 3) {
              score += (1000 * Math.pow((count[i] - 2), 2));
            } else {
              score += (count[i] * 100);
            }
           }
           else if(i == 4) {
             if(count[i] >= 3) {
              score += (500 * Math.pow((count[i] - 2), 2));
            } else {
              score += (count[i] * 50);
            }
           }
           else if(count[i] >= 3){
             score += (i+1) * 100;
           }
        }
        return score;
      }
}
