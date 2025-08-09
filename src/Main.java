import DataStracturs.DataStractursHelperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("enter a number ");
            String inputedValue = new Scanner(System.in).nextLine();
            ArrayList<Double> numbers = new ArrayList<>();
            while (!inputedValue.equals("q")) {
                try {
                    double tranceformedInputValue = Integer.valueOf(inputedValue);
                    numbers.add(tranceformedInputValue);
                }
                catch (NumberFormatException exception) {
                    System.out.println("you entered an invalid value");
                }
                System.out.println("enter a number ");
                inputedValue = new Scanner(System.in).nextLine();
            }
            System.out.println("enter a number ");
            double numberToCheck = new Scanner(System.in).nextDouble();
            DataStractursHelperClass.isIntInList(numbers, numberToCheck);
            DataStractursHelperClass.printMultipliersOfTen(numbers);

        }
}
