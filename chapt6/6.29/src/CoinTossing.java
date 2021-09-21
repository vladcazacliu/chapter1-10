import java.util.Scanner;
import java.util.Random;

public class CoinTossing{
    private static final Random randomFlips = new Random();

    private enum Coin{HEADS, TAILS};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 0 heads 1 tails
        int[] flips = new int[2];
        int count = 0;

        while(true){
            System.out.println("\n1. Toss Coin");
            System.out.println("9. exit");

            if(sc.nextInt() == 9)
                break;

            // flip the coin
            switch(flip()){
                case HEADS:
                    flips[0] += 1;
                    break;
                case TAILS:
                    flips[1] += 1;
                    break;
                default:
                    break;
            }
            count++;
        }

        System.out.printf("%d throws. HEADS: %d. TAILS: %d\n",
                count, flips[0], flips[1]);
    }
    public static Coin flip(){
        return (randomFlips.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}