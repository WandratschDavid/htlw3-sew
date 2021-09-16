package model;

import java.io.*;
import java.util.Scanner;

public class Model
{
    private static ModularCounter red = new ModularCounter(256);
    private static ModularCounter green = new ModularCounter(256);
    private static ModularCounter blue = new ModularCounter(256);


    public void chanceColorViaAbsoluteValue(ColorCode cc, String value)
    {
        try {
            int intValue = Integer.parseInt(value);

            if (intValue >= 0 && intValue <= 255)
            {
                switch (cc)
                {
                    case RED:
                        red.reset();
                        red.inc(intValue);
                        break;

                    case GREEN:
                        green.reset();
                        green.inc(intValue);
                        break;

                    case BLUE:
                        blue.reset();
                        blue.inc(intValue);
                        break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input!");
        }
    }

    public void chanceColorViaRelativeValue(ColorCode cc, String input)
    {
        switch (input)
        {
            case "+10":
                if (cc == ColorCode.RED && red.getValue() + 10 < red.getModulus())
                {
                    red.inc(10);
                }
                else if (cc == ColorCode.GREEN && green.getValue() + 10 < green.getModulus())
                {
                    green.inc(10);
                }
                else
                    {
                        if (blue.getValue() + 10 < blue.getModulus())
                            blue.inc(10);
                    }
                break;

            case "-10":
                if (cc == ColorCode.RED && red.getValue() - 10 >= 0)
                {
                    red.dec(10);
                }
                else if (cc == ColorCode.GREEN && green.getValue() - 10 >= 0)
                {
                    green.dec(10);
                }
                else
                    {
                        if (blue.getValue() - 10 >= 0)
                            blue.dec(10);
                    }
                break;
        }
    }

    public void save()
    {
        try (BufferedWriter bW = new BufferedWriter(new FileWriter("colorCode.txt")))
        {
            bW.flush();
            bW.write("Color Calculator File");
            bW.newLine();
            bW.write("" + getRed());
            bW.newLine();
            bW.write("" + getGreen());
            bW.newLine();
            bW.write("" + getBlue());
            bW.close();
            System.out.println("Saved: " + getRed() + ", " + getGreen() + ", " + getBlue() + " to File!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load()
    {
        try (BufferedReader bR = new BufferedReader(new FileReader("colorCode.txt")))
        {
            System.out.println(bR.readLine());

            int redValue = Integer.parseInt(bR.readLine());
            int greenValue = Integer.parseInt(bR.readLine());
            int blueValue = Integer.parseInt(bR.readLine());

            red = new ModularCounter(redValue,256);
            green = new ModularCounter(greenValue, 256);
            blue = new ModularCounter(blueValue, 256);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public int getRed() {return red.getValue();}

    public int getGreen() {return green.getValue();}

    public int getBlue() {return blue.getValue();}

    public String getHex()
    {
        String hexCode = "#";

        String redValue = Integer.toHexString(red.getValue());
        String greenValue = Integer.toHexString(green.getValue());
        String blueValue = Integer.toHexString(blue.getValue());

        if (redValue.length() == 1)
            redValue = "0" + redValue;
        if (greenValue.length() == 1)
            greenValue = "0" + greenValue;
        if (blueValue.length() == 1)
            blueValue = "0" + blueValue;

        hexCode += redValue;
        hexCode += greenValue;
        hexCode += blueValue;

        return hexCode;
    }

    @Override
    public String toString()
    {
        return "Model{" +
                "red = " + red +
                ", green = " + green +
                ", blue = " + blue +
                '}';
    }

    public void printConsoleMenu()
    {
        System.out.println("Please choose one of the following options:");
        System.out.println("a - changeColorViaAbsoluteValue" + "\nr - changeColorViaRelativeValue" + "\n? - view all accessors" + "\nq - quit" + "\n");
    }

    public void printCurrentColorValues()
    {
        System.out.println("Red = " + getRed() + "\nGreen = " + getGreen() + "\nBlue = " + getBlue() + "\nHexvalue = #" + getHex() + "\n");
    }


    public static void main(String[] args)
    {
        Model model = new Model();

        String userChoice;
        Scanner sc = new Scanner(System.in);

        do
        {
            model.printConsoleMenu();
            userChoice = sc.next();

            switch(userChoice)
            {
                case "a":
                    System.out.println("Please enter red, green or blue!");
                    String userColorInputAbsolute = sc.next();

                    System.out.println("Please enter a number from 0 - 255!");
                    String userValueInputAbsolute = sc.next();

                    switch(userColorInputAbsolute)
                    {
                        case "red":
                            model.chanceColorViaAbsoluteValue(ColorCode.RED, userValueInputAbsolute);
                            break;

                        case "green":
                            model.chanceColorViaAbsoluteValue(ColorCode.GREEN, userValueInputAbsolute);
                            break;

                        case "blue":
                            model.chanceColorViaAbsoluteValue(ColorCode.BLUE, userValueInputAbsolute);
                            break;

                        default:
                            System.out.println("Please only enter one of the above mentioned colors!");
                            break;
                    }
                    break;

                case "r":
                    System.out.println("Please enter red, green or blue!");
                    String userColorInputRelative = sc.next();

                    System.out.println("Please enter +10 or -10!");
                    String userValueInputRelative = sc.next();

                    switch(userColorInputRelative)
                    {
                        case "red":
                            model.chanceColorViaRelativeValue(ColorCode.RED, userValueInputRelative);
                            break;

                        case "green":
                            model.chanceColorViaRelativeValue(ColorCode.GREEN, userValueInputRelative);
                            break;

                        case "blue":
                            model.chanceColorViaRelativeValue(ColorCode.BLUE, userValueInputRelative);
                            break;

                        default:
                            System.out.println("Please only enter one of the above mentioned colors!");
                            break;
                    }
                    break;

                case "?":
                    model.printCurrentColorValues();
                    break;

                case "q":
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Wrong input!");
                    System.out.println("Please only enter one from the above mentioned letters!");
                    break;
            }
        }
        while(true);
    }
}