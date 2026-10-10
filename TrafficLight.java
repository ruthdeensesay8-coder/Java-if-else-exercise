import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the light color");
        String color = input.nextLine();

        if(color.equalsIgnoreCase("red"))
        {
            System.out.println("stop");
        }
        else if(color.equalsIgnoreCase("yellow"))
        {
            System.out.println("Ready");
        }
        else if(color.equalsIgnoreCase("green"))
        {
            System.out.println("Go");
        }
        else
        {
            System.out.println("Invalid choice");
        }


    }
    
}
