// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(arrayList);

        // Convert the shuffled ArrayList back to an array if needed
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

        // Print the shuffled array
        for (int i : shuffledArray) {
            System.out.print(i + " ");
        }
    }
}

// Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a mapping of Roman numeral symbols to their integer values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from left to right
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            // Check if the current symbol represents a smaller or equal value compared to the next symbol
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with your Roman numeral
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
    }
}

// Check if the input is pangram or not. (A pangram is a sentence that contains all the
// alphabets from A to Z)

public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create an array to keep track of the presence of each letter from A to Z
        boolean[] isLetterPresent = new boolean[26];

        // Convert the input string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Iterate through the characters in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // If the character is a letter, mark it as present
                int index = ch - 'a';
                isLetterPresent[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean isPresent : isLetterPresent) {
            if (!isPresent) {
                return false; // At least one letter is missing
            }
        }

        return true; // All letters are present
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
