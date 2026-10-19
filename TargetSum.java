import java.util.Scanner;   
public class TargetSum {
    public static void main(String[] args) {
int[] numbers = {2,4,3,5,7,8,9};
    int target = 10;
    for (int a = 0; a < numbers.length; a++)
    {
        for ( int j = a + 1; j < numbers.length; j++)
        {
            if(numbers[a] + numbers[j] == target)
            {
                System.out.println("The numbers are: " + numbers[a] + " and " + numbers[j]);
                
            }
        }
    }
    }
}
