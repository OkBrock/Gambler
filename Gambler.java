import java.util.Random;
import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int balance = 100;

        System.out.println();
        System.out.println("--> Current Balance: $" + balance + " <--");
        System.out.println("Would you like to enter the Java Gambler simulator?");
        System.out.println();

        String yesOrNo = scanner.nextLine();

        if(yesOrNo.equalsIgnoreCase("Yes")) {

            System.out.println();
            System.out.println("[!] Welcome to the Java Gambler! [!]");
            System.out.println();
            System.out.println("The only Java gambling software in all of Java County!");
            System.out.println();
            System.out.println("If the chosen number is {1}, the player automatically wins $20.");
            System.out.println("If the chosen number is {2}, the player automatically wins $10.");
            System.out.println("If the chosen number is {3}, the player automatically wins $5.");
            System.out.println("All other numbers are an automatic loss.");
            System.out.println();
            System.out.print("Continue? ");

            String yesOrNo2 = scanner.nextLine();

            String continueGambling = "Yes";
            String discontinueGambling = "No";
            while(continueGambling.equalsIgnoreCase("Yes")) {

            if(yesOrNo2.equalsIgnoreCase("Yes")) {

            System.out.println();
            System.out.println("Gambling Options:");
            System.out.println();
            System.out.println("[A] $1 Bet (1/20 $20, 1/20 $10, 1/20 $5)");
            System.out.println("[B] $5 Bet (1/10 $20, 1/10 $10, 1/10 $5)");
            System.out.println("[C] $10 Bet (1/5 $20, 1/5 $10, 1/5 $5)"); 
            System.out.println();
            System.out.print("Gambling Selection: ");

                    String gamblingSelection = scanner.nextLine();
            
                    String a = "A";
                    String b = "B";
                    String c = "C";
            
                    if(gamblingSelection.equalsIgnoreCase(a)) {
            
                        balance = balance - 1;
                        int aSelection = random.nextInt(20) + 1;
                        System.out.println();
                        System.out.println("And the number is... " + aSelection);
            
                        switch(aSelection) {
                            case 1: System.out.println("Congrats, you have won $20!");
                                    balance = balance + 20;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? "); 
                            break;
                            case 2: System.out.println("Congrats, you have won $10!");
                                    balance = balance + 10;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            case 3: System.out.println("Congrats, you have won $5!");
                                    balance = balance + 5;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            default: System.out.println("Sorry, no luck this time...");
                                     System.out.println("--> Your new balance: $" + balance + " <--");
                                     System.out.println();
                                     System.out.print("Continue? ");
                            break;
                        }
                    }
            
                    else if(gamblingSelection.equalsIgnoreCase(b)) {
            
                        balance = balance - 5;
                        int bSelection = random.nextInt(10) + 1;
                        System.out.println();
                        System.out.println("And the number is... " + bSelection);
        
                        switch(bSelection) {
                            case 1: System.out.println("Congrats, you have won $20!");
                                    balance = balance + 20;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            case 2: System.out.println("Congrats, you have won $10!");
                                    balance = balance + 10;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            case 3: System.out.println("You won $5! Its a free spin, I guess...");
                                    balance = balance + 5;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            default: System.out.println("Sorry, no luck this time...");
                                     System.out.println("--> Your new balance: $" + balance + " <--");
                                     System.out.println();
                                     System.out.print("Continue? ");
                            break;
                        }
                    }
            
                    else if(gamblingSelection.equalsIgnoreCase(c)) {
            
                        balance = balance - 10;
                        int cSelection = random.nextInt(5) + 1;
                        System.out.println();
                        System.out.println("And the number is... " + cSelection);
            
                        switch(cSelection) {
                            case 1: System.out.println("Congrats, you have won $20!");
                                    balance = balance + 20;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            case 2: System.out.println("You won $10! Its a free spin, I guess...");
                                    balance = balance + 10;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            case 3: System.out.println("You won $5! At least its somethin...");
                                    balance = balance + 5;
                                    System.out.println("--> Your new balance: $" + balance + " <--");
                                    System.out.println();
                                    System.out.print("Continue? ");
                            break;
                            default: System.out.println("Sorry, no luck this time...");
                                     System.out.println("--> Your new balance: $" + balance + " <--");
                                     System.out.println();
                                     System.out.print("Continue? ");
                            break;

                        }

                    }

                    continueGambling = scanner.nextLine();

                    if (discontinueGambling.equalsIgnoreCase("No")) {

                        int profit = balance - 100;

                        System.out.println("");
                        System.out.println("--> Final balance: $" + balance + " <--");
                        System.out.println("Total Profit: $" + profit);
                        System.out.println("");

                }

            }

        }
            
    }

        else if(yesOrNo.equalsIgnoreCase("No")) {

            System.out.println("");
            System.out.println("You sure are missing out...");
            System.out.println("");

        }

        else {

            System.out.println("");
            System.out.println("Invalid response. Please try again.");
            System.out.println("");

        }

        scanner.close();

    }

 }
