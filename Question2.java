import java.util.Scanner;
public class Question2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int UserInput = scanner.nextInt();
        System.out.println(UserInput + " seconds is " + UserInput/3600 + " hours, " + UserInput%3600/60 + " minutes, and " + (UserInput%3600%60) + " seconds.");
    }
}
