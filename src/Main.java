import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declaring variables
        int birthMonth= 0;

        //prompt user to enter birth month number
        System.out.print("Enter your birth month number:");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
        }

        if(birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}