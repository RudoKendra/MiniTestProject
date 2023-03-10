package sk.rudo.game.random;

import java.util.Random;

public class RandomNumberHp {
    public int RndmHp() {
        Random random = new Random();
        return random.nextInt(5)*10+50;
    }
}
