import java.util.*;

class Player {
    String name;
    int pos = 0;

    Player(String name) {
        this.name = name;
    }

    void move(int steps) {
        pos += steps;
    }
}

class Dice {
    int roll() {
        return (int)(Math.random()*6) + 1;
    }
}

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player name: ");
        Player p = new Player(sc.nextLine());

        Dice d = new Dice();
        int target = 20;

        System.out.println("\nOOP Game Start (Target = " + target + ")");

        while (p.pos < target) {
            System.out.print("Press ENTER to roll dice...");
            sc.nextLine();

            int v = d.roll();
            System.out.println("Rolled: " + v);

            p.move(v);
            System.out.println(p.name + " Position: " + p.pos + "\n");
        }

        System.out.println( p.name + " Wins!");
    }
}
