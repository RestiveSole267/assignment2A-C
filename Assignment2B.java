import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){
        int key1, key2;
        float cfps30, cfps60, framespassed;
        Scanner sc = new Scanner(System.in);
        System.out.println("[Lerping!]");
        System.out.println("Enter the X coordinate for Keyframe #1: ");
        key1 = sc.nextInt();
        System.out.println("Enter the X coordinate for Keyframe #2: ");
        key2 = sc.nextInt();
        System.out.println("How many frames have passed? ");
        framespassed = sc.nextFloat();
        int moveplaces = key2 - key1;
        cfps30 = key1 + moveplaces * framespassed / 30;
        cfps60 = key1 + moveplaces * framespassed / 60;
        String fps30 = String.format("%.4f", cfps30);
        String fps60 = String.format("%.4f", cfps60);
        System.out.println("The character has to move " + moveplaces + " places in a second.");
        System.out.println("At 30 FPS, their current X position would be " + fps30 + ".");
        System.out.println("At 60 FPS, their current X position would be " + fps60 + ".");
    }
}
