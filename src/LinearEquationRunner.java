import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Welcomes the user
        System.out.println("Welcome to the Linear Equation calculator!");
        System.out.print("Enter coordinate 1 (ex. (5, 10)): ");
        String firstCoor = scan.nextLine();

        System.out.print("Enter coordinate 2: ");
        String secCoor = scan.nextLine();

        System.out.println();

        // Parses out the correct x-values and y-values out of the inputted coordinates and sets them as integers
        int x1 = Integer.parseInt(firstCoor.substring(1, firstCoor.indexOf(",")));
        int x2 = Integer.parseInt(secCoor.substring(1, secCoor.indexOf(",")));
        int y1 = Integer.parseInt(firstCoor.substring((firstCoor.indexOf(" ") + 1), firstCoor.indexOf(")")));
        int y2 = Integer.parseInt(secCoor.substring((secCoor.indexOf(" ") + 1), secCoor.indexOf(")")));

        // Creates an object using the x-values and y-values, and then prints out the line info using the method lineInfo()
        LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        System.out.println("--------------- Line info ---------------");
        System.out.println(line.lineInfo());
        System.out.println();

        // Creates a new coordinate with an inputted x-value
        if (x1 != x2 && y1 != y2) {
            System.out.print("Enter a value for x: ");
            double testX = scan.nextDouble();
            System.out.println("The point on the line is: " + line.coordinateForX(testX));
        }
    }
}

