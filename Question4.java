import java.util.Scanner;
public class Question4
{
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December",};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (January = 1): ");
        int UserInput = scanner.nextInt();
        System.out.println(months[UserInput-1] + " has " + daysInMonth(UserInput) + " days.");
    }
    
    public static int daysInMonth(int month)
    {
        if(month == 2){
            return 28;
        }
        if(month > 8 && month % 2 == 1){
            return 30;
        }
        if(month < 7 && month % 2 == 0){
            return 30;
        }
        return 31;
    }
}
