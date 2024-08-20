import java.util.Scanner;

public class Java_internship {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        Pet myPet = new Pet();
        boolean isAdopted= false;

        Outerloop :while(true) {
            System.out.println("\n======= Pet Adoptation Game =======\n");
            System.out.println("1. Adopt a pet");
            System.out.println("2. Feed Pet");
            System.out.println("3. Play with Pet");
            System.out.println("4. Check Status");
            System.out.println("5. End Game");
            
            System.out.print("\nChoose an option: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of your pet: ");
                    String name = scanner.next();
                    myPet.setName(name);
                    isAdopted = true;
                    System.out.println("\n" + name + " Adopted successfully :)");
                    break;
                
                case 2:
                    if (isAdopted){
                        myPet.feedPet();
                        if(isLose(myPet.getHappinessLevel(), myPet.getHappinessLevel()))
                        {
                            System.out.println("You are Lose D:");
                            endGame(myPet,isAdopted);
                        }
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 3:
                    if (isAdopted) {
                        myPet.playWithPet();
                        if(isLose(myPet.getHappinessLevel(), myPet.getHappinessLevel()))
                        {
                            System.out.println("You are Lose D:");
                            endGame(myPet,isAdopted);
                        }
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 4:
                    if (isAdopted) {
                        System.out.println("********* Current Status ******");
                        System.out.println("Hunger Level : "+myPet.getHungerLevel());
                        System.out.println("Happiness Level : "+myPet.getHappinessLevel());
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 5:
                    if(isAdopted)
                    {
                        System.out.println("1- End this game and adopt new pet");
                        System.out.println("1- End game and terminate");
                        int preferEnd = readInt();

                        endGame(myPet,isAdopted);
                        if(preferEnd == 1)
                        {
                            System.out.println("\nThe Game is End for this pet, Thank you ^_^\n\n");
                        }
                        else if(preferEnd == 2)
                        {
                            System.out.println("\nThe Game is terminate, Thank you ^_^\n\n");
                            break Outerloop;
                        }

                    }
                    else
                    {
                        System.out.println("The Game is not start yet!");
                    }
                    break;

                default:
                    System.out.println("\n!! Enter a valid number from the menu !!");
                    break;
            }
        }
    }

    // Function to read integers only
    static int readInt(){
        int n = 0;
        while (true) {
            try {
                n = scanner.nextInt();
                if(n>=0){
                    return n;
                } else {
                    System.out.println("\nPlease enter a positive number: ");
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("\n!! Please Enter a number: ");
                scanner.nextLine();
            }
        }
    }


    static void endGame(Pet myPet , boolean isAdopted)
    {
        System.out.println("********* Final Status ******");
        System.out.println("Hunger Level : " + myPet.getHungerLevel());
        System.out.println("Happiness Level : " + myPet.getHappinessLevel());
        myPet = new Pet();
        isAdopted = false;
    }
    static boolean isLose(int hungryLevel , int happinessLevel)
    {
        return hungryLevel == 0 || happinessLevel == 0;
    }
}
