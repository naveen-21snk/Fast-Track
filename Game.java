import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = 0;       
        int target = 20;    

        System.out.println("Simple Game Start (Target = 20)");

        while (pos < target) {
            System.out.print("Press ENTER to roll dice...");
            sc.nextLine();

            int dice = (int)(Math.random() * 6) + 1; 
            System.out.println("Rolled: " + dice);

            pos = pos + dice;    
            System.out.println("Position: " + pos + "\n");
        }

        System.out.println("You Win!");
    }
}
