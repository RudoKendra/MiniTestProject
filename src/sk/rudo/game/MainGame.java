package sk.rudo.game;

import sk.rudo.game.player.Player1;
import sk.rudo.game.player.Player2;

public class MainGame {
    public static void main(String[] args) {

        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        System.out.println("Hello, welcome to 1vs1 random pvp Game");
        System.out.println("First enter name player one: ");
        player1.setName1();
        while (player1.getName1().isBlank()) {
            System.out.println("First enter name player one: ");
            player1.setName1();
        }
        System.out.println("Hello " + player1.getName1());
        System.out.println("Enter name for player two: ");
        player2.setName2();
        while (player2.getName2().isBlank()) {
            System.out.println("Enter name for player two: ");
            player2.setName2();
        }
        System.out.println("Hello " + player2.getName2());
        System.out.println("Lets game begin");
        System.out.println("You have 10 pick with random amount of stat increase");
        player1.playerOneRun();
        player2.playerTwoRun();

        System.out.println("---------------------------------");

        System.out.println(player1.getName1());
        System.out.println(player1.getAttack());
        System.out.println(player1.getHitpoints());
        System.out.println(player1.getCritical());

        System.out.println("---------------------------------");

        System.out.println(player2.getName2());
        System.out.println(player2.getAttack());
        System.out.println(player2.getHitpoints());
        System.out.println(player2.getCritical());

        int i = player1.getHitpoints();
        int j = player2.getHitpoints();

        int k = player1.getAttack();
        int l = player2.getAttack();

        int m = player1.getCritical();
        int n = player2.getCritical();

        System.out.println(i +" "+j+" "+k+" "+l);

        while (i > 0 && j > 0){
            int l1 = l;
            int k1 = k;
            if (Math.random() * 100 < m) {
                l1 = l * 2;
            }
            i -= l1;
            if (Math.random() * 100 < n) {
                k1 = k * 2;
            }
            j -= k1;
            System.out.println(i + " " + j);
        }

        if (i < 0) {
            System.out.println("Player 2 WON");
        } else {
            System.out.println("Player 1 WON");
        }
    }
}
