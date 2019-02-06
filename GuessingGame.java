import java.util.Scanner;

/**
 * Guessing Game
 *
 * Created by Eric on 2/6/19
 * 
 */

// instance variables - replace the example below with your own

/**
 * Constructor for objects of class Main
 */
public class GuessingGame{
public static void Main()
{Scanner in = new Scanner(System.in);
System.out.println("Pick a number, Any number From 1 To 100: ");
int n = 1 + (int)(Math.random() * 99);
int g = 0;
int c = 0;
while (g != n) {
g = in.nextInt();
c++;
if (g > n) {
System.out.println("Right Over The Head With That One!");
} else if (g < n) {
System.out.println("Wow... You Sure Lowballed That One!");
}
}
System.out.println("Congratulations. It Only Took You "
+ c + " Guesses... Sheesh.");

// initialise instance variables

}

}
