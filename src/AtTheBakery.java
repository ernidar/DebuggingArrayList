import java.util.ArrayList;
import java.util.Scanner;

public class AtTheBakery {
    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Muffins");
        menu.add("Donuts");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bakery");
        System.out.println("We currently have "+ menu);
        String userInput;
        userInput = " ";
        while (!userInput.equalsIgnoreCase("q")) {
            System.out.println("Would you like to add an item (q to quit)?");
            userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Great!");
                System.out.println("We currently have " + menu);
            } else {
                menu.add(userInput);
            }
        }
//    Welcome to the Bakery.
//    We currently have Muffins, Donuts
//    Would you like to add an item (q to quit)?
//    cakes
//    Would you like to add an item (q to quit)?
//    rolls
//    Would you like to add an item (q to quit)?
//    breads
//    Would you like to add an item (q to quit)?
//    q
//
//    Great!
//    We currently have breads, Donuts, cakes, Muffins, rolls
    }
}
