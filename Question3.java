/**
 * @author (Cheung Tin Ho Benjamin, 19073365D)
 * Question 3
 **/
public class Question3
{
    public static void main(String[] args) {
        System.out.println("The first 100 triangular numbers are:");
        for (int i = 1;i <= 100;i++){
            if(i%10 == 0) {
                System.out.println(getTriangularNumber(i+1) + "\t");
            }
            else{
                System.out.print(getTriangularNumber(i+1) + "\t");
            }
        }
    }
    public static int getTriangularNumber(int n)
    {
        int TriangularNumber = 0;
        for(int i = 1;i <n;i++){
            TriangularNumber += i;
        }
        return TriangularNumber;
    }
}