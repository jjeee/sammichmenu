package dafaq;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char option;
        double price;
        double total=0;
        System.out.println("Welcome to Jimmy Johns\nWhat would you like?");
        System.out.println("Please enter your choice.");
        do {
            System.out.println("(H)am           $6.50");
            System.out.println("(R)oast Beef    $6.75");
            System.out.println("(S)alami        $6.25");
            System.out.println("(T)una          $5.50");
            System.out.println("(D)one");
            System.out.println("(Q)uit");

            String choice = input.next();
            choice=choice.toUpperCase();
            option = choice.charAt(0);
            int qty;
            double ttl;
            if (option=='Q'){
                System.out.println("fk u fgt");
                break;
            }
            switch (option){
                case 'H':
                    price = 6.50;
                    System.out.println("You chose: "+choice);
                    System.out.println("Enter quantity:");
                    qty=input.nextInt();
                    ttl=price*qty;
                    break;
                case 'R':
                    price = 6.75;
                    System.out.println("You chose: "+choice);
                    System.out.println("Enter quantity:");
                    qty=input.nextInt();
                    ttl=price*qty;
                    break;
                case 'S':
                    price = 6.25;
                    System.out.println("You chose: "+choice);
                    System.out.println("Enter quantity:");
                    qty=input.nextInt();
                    ttl=price*qty;
                    break;
                case 'T':
                    price = 5.50;
                    System.out.println("You chose: "+choice);
                    System.out.println("Enter quantity:");
                    qty=input.nextInt();
                    ttl=price*qty;
                    break;
                case 'D':
                    ttl = 0;
                    break;
                default:
                    ttl = 0;
                    System.out.println("That's not a choice, stupid. Try again.");
                    break;
            }total+=ttl;
            System.out.printf("Total is $%.2f\n",total);
            if (option!='D'){
                System.out.println("Would you like to order more?");
            }
        }while (option !='D');
        System.out.println("Thank you for choosing Jimmy Johns!");
    }
}
