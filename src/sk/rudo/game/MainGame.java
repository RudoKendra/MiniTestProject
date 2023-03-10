package sk.rudo.game;

import sk.rudo.game.player.Player1;
import sk.rudo.game.player.Player2;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Player1: " + player1.getName1() + " your stats are: " + player1.getAttack() + " Attack, " + player1.getHitpoints() + " HP and " + player1.getCritical() + "% of Critical hit");
        System.out.println("Player2: " + player2.getName2() + " your stats are: " + player2.getAttack() + " Attack, " + player2.getHitpoints() + " HP and " + player2.getCritical() + "% of Critical hit");
        System.out.println("---------------------------------");
        System.out.println("LET'S GAME BEGIN and increase your stats");
        System.out.println("You have 10 pick with random amount of stat increase");
        System.out.println("---------------------------------");
        player1.playerOneRun();
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        player2.playerTwoRun();

        System.out.println("---------------------------------");
        System.out.println(player1.getName1() + "´s stats: Attack " +player1.getAttack()+", HP: "+player1.getHitpoints()+", Critical chance: "+player1.getCritical()+"%");
        System.out.println(player2.getName2() + "´s stats: Attack " +player2.getAttack()+", HP: "+player2.getHitpoints()+", Critical chance: "+player2.getCritical()+"%");
        System.out.println("---------------------------------");

        int i = player1.getHitpoints();
        int j = player2.getHitpoints();

        int k = player1.getAttack();
        int l = player2.getAttack();

        int m = player1.getCritical();
        int n = player2.getCritical();

        System.out.println("Press Enter to FIGHT");
        String enter = scanner.nextLine();

        while (i > 0 && j > 0) {
            int l1 = l;
            int k1 = k;
            if (Math.random() * 100 < n) { // krit? player 2
                l1 = l * 2;
            }
            if (Math.random() * 100 < 10) { // miss? 10% player 2
                l1 = 0;
                System.out.println("You miss");
            }
            i -= l1;
            System.out.println(player2.getName2() + " attacked " + l1 + " to " + player1.getName1());
            System.out.println(player1.getName1() + " your HP is " + i);
            System.out.println("---------------------------------");
            if (Math.random() * 100 < m) { // krit? player 1
                k1 = k * 2;
            }
            if (Math.random() * 100 < 10) { // miss? 10% player 1
                k1 = 0;
                System.out.println("You miss");
            }
            j -= k1;
            System.out.println(player1.getName1() + " attacked " + k1 + " to " + player2.getName2());
            System.out.println(player2.getName2() + " your HP is " + j);
            System.out.println("---------------------------------");
        }
        if (i < 0 && j < 0) {
            System.out.println("It´s a TIE, GG");
        } else if (i < 0) {
            System.out.println("Player 2: " + player2.getName2() +" WON, GG");
        } else {
            System.out.println("Player 1: " + player1.getName1()+ " WON, GG");
        }
    }
}
