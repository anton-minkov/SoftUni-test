package StreamsAndFiles;

/**
 * Created by anton on 16-3-28.
 */

import java.io.*;
import java.util.*;


public class SaveArrayListOfDoubles {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "EN"));
        Scanner console = new Scanner(System.in);
        List<Double> doublesListArray = new ArrayList<>();
        doublesListArray.add(2.3);
        doublesListArray.add(2.4);
        doublesListArray.add(2.5);

        try {
            FileOutputStream doublesList = new FileOutputStream("/home/anton/Downloads/SoftUni/doubles.list");
            ObjectOutputStream save = new ObjectOutputStream(doublesList);

            save.writeObject(doublesListArray);
            save.flush();

            ObjectInputStream load = new ObjectInputStream(new FileInputStream("/home/anton/Downloads/SoftUni/doubles.list"));
            try {
                System.out.println(load.readObject());
            } catch (ClassNotFoundException classNotFoundEx) {
                System.out.print("Error: Class not found.");
            }
        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.print("Error: File not found.");
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file.");
        }
    }
}