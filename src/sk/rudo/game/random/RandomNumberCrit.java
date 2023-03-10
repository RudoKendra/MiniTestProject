package sk.rudo.game.random;

import java.util.Random;

public class RandomNumberCrit {
    public int RndmCrit() {
        Random random = new Random();
        return random.nextInt(4)+1;
    }
}
