package partB.ex01;

import java.util.Scanner;

public class IfLight {
    public static String ifLight() {
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int colorCode = scanner.nextInt();

        if (colorCode == 1) {
            response = "Next Traffic Light is green";
        } else if (colorCode == 2) {
            response = "Next Traffic Light is yellow";
        } else if (colorCode == 3) {
            response = "Next Traffic Light is red";
        } else {
            response = "Invalid color";
        }
        /* Put your code in between these comments : Bottom */

        return response;
    }

    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
