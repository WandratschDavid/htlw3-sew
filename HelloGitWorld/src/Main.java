/**
 * @Author: Wandratsch David, 3BHIT
 * @Date: 13.10.2020
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner for the user input
        Scanner sc = new Scanner(System.in);

        //Creating variables
        double x;
        double y;
        double z;
        double result;
        int operation;

        try {
            //listing all the different operations
            System.out.println("1: Addition");
            System.out.println("2: Subtraktion");
            System.out.println("3: Multiplikation");
            System.out.println("4: Division");
            System.out.println("Geben Sie bitte die jeweilige Zahl für die gewünschte Rechenoperation ein: ");
            operation = sc.nextInt();

            try {
                //asking the user for the value of the variables
                System.out.println("Bitte geben Sie folgende Werte ein:");
                System.out.println("1. Wert");
                x = sc.nextDouble();

                System.out.println("2. Wert");
                y = sc.nextDouble();

                System.out.println("3. Wert");
                z = sc.nextDouble();

                switch (operation)
                {
                    case 1:
                        System.out.println("Addition!");
                        result = x + y + z;
                        System.out.println("Das Ergebnis lautet: " + result);
                        break;

                    case 2:
                        System.out.println("Subtraktion!");
                        result = x - y - z;
                        System.out.println("Das Ergebnis lautet: " + result);
                        break;

                    case 3:
                        System.out.println("Multiplikation!");
                        result = x * y * z;
                        System.out.println("Das Ergebnis lautet: " + result);
                        break;

                    case 4:
                        System.out.println("Division!");
                        result = x / y / z;
                        System.out.println("Das Ergebnis lautet: " + result);
                        break;
                }
            }
            catch (Exception e)
            {
                //telling the user about a false input
                System.out.println("Ungültige Eingabe!!!");
                System.out.println("Bitte geben Sie nur Zahlen ein!!!");

            }
        }
        catch (Exception e)
        {
            //telling the user about a false input
            System.out.println("Ungültige Eingabe!!!");
            System.out.println("Bitte geben Sie eine Zahl von 1-4 ein!!!");
        }
    }
}