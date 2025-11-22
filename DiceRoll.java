import java.util.*;

class InvalidMoveException extends Exception {
    InvalidMoveException(String msg) { 
        super(msg); 
    }
}

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;

        System.out.println("Game Start (Target = 20)");

        while (pos < 20) {
            try {
                System.out.print("Press ENTER to roll dice...");
                sc.nextLine();

                int dice = (int)(Math.random()*6) + 1;
                System.out.println("Rolled: " + dice);

               
                if (dice == 6) {
                    throw new InvalidMoveException("6 is not allowed! Try again.");
                }

                pos += dice;
                System.out.println("Position: " + pos + "\n");
            }
            catch (InvalidMoveException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Other Error! Try again.");
            }
        }

        System.out.println("You Win!");
    }
}
