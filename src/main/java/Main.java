import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();

        System.out.println("Welcom to the calculator!");
        System.out.println("Enter a command:");

        while(true) {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Read input
            String command = reader.readLine();

            String[] commandVals = command.split(" ");

            if (command.equals("quit")) {
                break;
            }
            else if (commandVals[0].equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(commandVals[1]), Integer.parseInt(commandVals[2])));
            }
            else if (commandVals[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(commandVals[1]), Integer.parseInt(commandVals[2])));
            }
            else if (commandVals[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(commandVals[1]), Integer.parseInt(commandVals[2])));
            }
            else if (commandVals[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(commandVals[1]), Integer.parseInt(commandVals[2])));
            }
            else if (commandVals[0].equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(commandVals[1])));
            }
            else if (commandVals[0].equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(commandVals[1])));
            } else {
                System.out.println("Invalid Command");
            }
        }
    }
}
