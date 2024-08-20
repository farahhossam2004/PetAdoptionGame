import java.util.Scanner;

public class Java_internship {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        Pet myPet = new Pet();
        boolean isAdopted= false;

        Outerloop: while(true) {
            System.out.println("\n======= Pet Adoptation Game =======\n");
            System.out.println("1. Adopt a pet");
            System.out.println("2. Feed Pet");
            System.out.println("3. Play with Pet");
            System.out.println("4. Check Status");
            System.out.println("5. End Game");
            
            System.out.println("\nChoose an option: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of your pet");
                    String name = scanner.next();
                    myPet.setName(name);
                    isAdopted = true;
                    System.out.println("\n" + name + " Adopted successfully :)");
                    break;
                
                case 2:
                    if (isAdopted){
                        myPet.feedPet();
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 3:
                    if (isAdopted) {
                        myPet.playWithPet();
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 4:
                    if (isAdopted) {
                        System.out.println("f");
                        break;
                    }
                    else {
                        System.out.println("\nYou don't have a pet yet!");
                        break;
                    }
                
                case 5:
                    System.out.println("Final Status / Game Over");
                    break Outerloop;
                    

                default:
                    System.out.println("\n!! Enter a valid number from the menu !!");
                    break;
            }
        }
        scanner.close();
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
}
