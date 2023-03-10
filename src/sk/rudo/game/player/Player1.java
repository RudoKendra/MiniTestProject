package sk.rudo.game.player;

import sk.rudo.game.random.RandomNumberAtk;
import sk.rudo.game.random.RandomNumberCrit;
import sk.rudo.game.random.RandomNumberHp;

import java.util.Scanner;

public class Player1 {

    String name1;

    Scanner scanner = new Scanner(System.in);
    public String getName1() {
        return name1;
    }

    public void setName1() {
        this.name1 = scanner.nextLine();
    }

    int hitpoints = 1000;
    int attack = 50;
    int critical = 10;

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


    public void playerOneRun() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Choose what stat your want to increase " + name1);
            System.out.println("REMEMBER, when you write wrong letter no any stat will increase!!!");
            System.out.println("A = Attack, H = Hitpoints, C = Critic");
            String increase = scanner.nextLine();
            if ("a".equalsIgnoreCase(increase)) {
                setAttack(getAttack() + rna.RndmAtk());
                System.out.println("You increased your Attack and your attack is " + getAttack() + " now");
            } else if ("h".equalsIgnoreCase(increase)) {
                setHitpoints(getHitpoints() + rnh.RndmHp());
                System.out.println("You increased your Hitpoints and your hitpoints are " + getHitpoints() + " now");
            } else if ("c".equalsIgnoreCase(increase)) {
                setCritical(getCritical() + rnc.RndmCrit());
                System.out.println("You increased your chance of CriticalHit and your chance is " + getCritical() + "% now");
            }
        }

        System.out.println(getName1() +" your boosted stats are: ");
        System.out.println("Attack " + getAttack());
        System.out.println("Hitpoints " + getHitpoints());
        System.out.println("Critical hit chance " + getCritical() + "%");
    }
}
