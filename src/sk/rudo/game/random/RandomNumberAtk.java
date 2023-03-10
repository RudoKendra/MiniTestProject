package sk.rudo.game.random;

import java.util.Random;

public class RandomNumberAtk {
    public int RndmAtk() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
