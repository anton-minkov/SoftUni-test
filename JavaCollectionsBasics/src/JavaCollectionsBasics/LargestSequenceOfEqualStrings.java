package JavaCollectionsBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by anton on 16-3-29.
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String[] inputStrings  = inputText.split("\\s+");

        Map<String , Integer> uniqueElements = new HashMap<String,Integer>();
        for (String word : inputStrings) {
            Integer count = uniqueElements.get(word);
            if (count == null){
                count=0;
            }
            uniqueElements.put(word,count+1);
        }
        String mostFrequentElemnt = null;
        int frequency = 0;
        for (String key : uniqueElements.keySet()) {
            int count =uniqueElements.get(key);
            if(count>frequency){
                frequency=count;
                mostFrequentElemnt = key;
            }
        }
        for(int i = 0; i<frequency;i++){
            System.out.print(mostFrequentElemnt + " ");
        }

    }
}
