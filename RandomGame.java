import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public void random()
    {
        Scanner sc=new Scanner(System.in);
        final int max=100;
        Random rn=new Random();
        int num=rn.nextInt(max);
        System.out.println("You have 5 attempts");
        int i=5;
        System.out.println("Guess the number within the range of 1-100");
        while(i>=1)
        {
            System.out.println("Guess the number");
            int n=sc.nextInt();
            if(n==num)
            {
                System.out.println("Hurray!!!!!  Your guess is correct!!!!!");
                return;
            }
            else if(n>num)
            {
                System.out.print("Entered number is too high\nThe random number is less than "+n+"\n");
                if((i-1)!=0)
                    System.out.println("You have "+(i-1)+" more chance to guess the number");
            }
            else {
                System.out.print("Entered number is too low\nThe random number is greater than "+n+"\n");
                if((i-1)!=0)
                    System.out.println("You have "+(i-1)+" more chance to guess the number");
            }
            i--;
        }
        System.out.println("Random number was: "+num);
        System.out.println("****** BETTER LUCK NEXT TIME ******");
    }
    public static void main(String[] args)
    {
        RandomGame g=new RandomGame();
        g.random();
        while(true) {
            System.out.println("Do you want to try again??(Yes/No)");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Yes"))
                g.random();
            else
                System.exit(0);
        }
    }

}
