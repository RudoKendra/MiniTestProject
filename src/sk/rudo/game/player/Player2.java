package sk.rudo.game.player;


import sk.rudo.game.random.RandomNumberAtk;
import sk.rudo.game.random.RandomNumberCrit;
import sk.rudo.game.random.RandomNumberHp;

import java.util.Scanner;

public class Player2 {

    String name2;

    Scanner scanner = new Scanner(System.in);


    public String getName2() {
        return name2;
    }

    public void setName2() {
        this.name2 = scanner.nextLine();
    }


    int hitpoints = 1000;
    int attack = 50;
    int critical = 5;

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }


    RandomNumberAtk rna = new RandomNumberAtk();
    RandomNumberHp rnh = new RandomNumberHp();
    RandomNumberCrit rnc = new RandomNumberCrit();


    public void playerTwoRun() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Choose Skill to increase " + name2);
            System.out.println("A = Attack, H = Hitpoints, C = Critic");
            String increase = scanner.nextLine();
            if ("a".equals(increase)) {
                setAttack(getAttack() + rna.RndmAtk());
                System.out.println("You increase your Attack and your attack is " + getAttack() + " now");
            } else if ("h".equals(increase)) {
                setHitpoints(getHitpoints() + rnh.RndmHp());
                System.out.println("You increase your Hitpoints and your hitpoints are " + getHitpoints() + " now");
            } else if ("c".equals(increase)) {
                setCritical(getCritical() + rnc.RndmCrit());
                System.out.println("You increase Your CriticalHit and your critical is " + getCritical() + "% now");
            }
        }

        System.out.println("Your total atk is " + getAttack());
        System.out.println("Your total hitpoints are " + getHitpoints());
        System.out.println("Your total critical hit is " + getCritical() + "%");
    }
}
