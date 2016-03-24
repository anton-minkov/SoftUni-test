package JavaSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by anton on 16-3-23.
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        fillingTheListWithNumbers(scanner, numbers);
        String[] commands = scanner.nextLine().split(" ");
        executingCommand(commands, numbers);
    }

    private static void executingCommand(String[] commands, List<Integer> numbers) {
        String evenOrOdd = commands[2];
        int amountOfNumbers = Integer.parseInt(commands[1]);
        switch (evenOrOdd) {
            case "even": gettingFirstEvenNumbers(amountOfNumbers, numbers);
                break;
            case "odd": gettingFirstOddNumbers(amountOfNumbers, numbers);
                break;
            default: System.out.println("Invalid command");
                break;

        }
    }
    private static void gettingFirstOddNumbers(int amountOfNumbers, List<Integer> numbers) {
        int counter =0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1) {
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if(counter >= amountOfNumbers) {
                break;
            }
        }
    }

    private static void gettingFirstEvenNumbers(int amountOfNumbers, List<Integer> numbers) {
        int counter =0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if(counter >= amountOfNumbers) {
                break;
            }
        }
}