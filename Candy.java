import java.util.Scanner;
public class Candy
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Sweet = Integer.parseInt(args[0]);
        int SweetWrappers = Integer.parseInt(args[0]);
        while(SweetWrappers > 1){
            Sweet += SweetWrappers / Integer.parseInt(args[1]);
            if(SweetWrappers % Integer.parseInt(args[1]) == 1){
                SweetWrappers = SweetWrappers / Integer.parseInt(args[1]) + 1;
            }
            else{
                SweetWrappers = SweetWrappers / Integer.parseInt(args[1]);
            }
        }
        System.out.println("n = " + args[0] + "; m=" + args[1] + "; No. of candies=" + Sweet);
    }
}
