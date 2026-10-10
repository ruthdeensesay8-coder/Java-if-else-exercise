import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter parking hours");
        int hours = input.nextInt();
        int fee;
        
        if(hours<=0)
        {
            fee = 0;
        }
        else if(hours == 1)
        {
            fee = 5000;
        }
        else
        {
            fee = 5000 + (hours -1) + 3000;
        }
        if(fee > 20000)
        {
            fee = 20000;
        }
        System.out.println("Parking fee = Rp" + fee);
    }
    
}
