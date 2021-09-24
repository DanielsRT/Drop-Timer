import java.util.*;

public class DropTimer {
    public static void main(String[] args) {
        
        System.out.print("\nWelcome to the Splat Timer!\n" + 
                        "The Splat Timer calculates the seconds for an\n" +
                        "object to fall from a given height in meters\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWhat's the height in meters? ");
        Double height = sc.nextDouble();
        
        Double gravity = 9.8;
        Double time = Math.sqrt((2.0 * height) / gravity);
        
        System.out.printf("\n\nAn object dropped from %,.1f meters\n" +
                         "will hit the ground in %,.16f seconds.\n\n",
                         height, time);
        
        System.out.println("\nThank you for using the Splat Timer");
        
        
    }
}