import java.util.Scanner;
//Java_internship
/**
 *
 * @author a
 */
 class Pet {
    private String name;
    private int hungerLevel;
    private int happinessLevel;

   
    public Pet(String name) {
        this.name = name;
        this.hungerLevel = 50;
        this.happinessLevel = 50;
        System.out.println("Pet " + name + " has been adopted!");
    }
    
    public void feedPet() {
        if (hungerLevel < 90) {
            hungerLevel += 10;
            System.out.println(name + " has been fed. Hunger level is now " + hungerLevel + ".");
        } else {
            System.out.println(name + " is full and cannot eat more.");
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }
}

public class Java_internship {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the name of your pet: ");
        String petName = scanner.nextLine();

        
        Pet myPet = new Pet(petName);

        while (true) {
            System.out.println("Do you want to feed " + myPet.getHungerLevel() + "? (yes/no)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                myPet.feedPet();
            } else {
                break;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
