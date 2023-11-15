import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        suv fortuner=new suv("Fortuner", 0, 0, null, 0, false);
        System.out.println("Enter the speed of vehicle: ");
        Scanner sc = new Scanner(System.in);
        int speed= sc.nextInt();
        System.out.println("Enter the direction in which vehicle is moving vehicle: ");
        int direction= sc.nextInt();
        fortuner.move(speed, direction);
        fortuner.accelerate(20);
        // fortuner.accelerate(-60);
        System.out.println("Current gear is: "+fortuner.getCurrentgear());
        System.out.println("Current speed is: "+fortuner.getCurrentspeed());
    }
}
