package se.lexicon.omar;


import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<< 1 >>>>>>>>>>>");

        // Print the length of the string: "Java".
        String lengthOfTheString = "Java";
        System.out.println("The length of the string 'Java' is: " + lengthOfTheString.length());

        System.out.println("<<<<<<<<<<< 2 >>>>>>>>>>>");

        // Print the char at index position 6 of the string: "Long example sentence".
        String charIsAtIndexPosition = "Long example sentence";
        System.out.println(charIsAtIndexPosition);
        System.out.println("The char at index position 6 is: " + charIsAtIndexPosition.charAt(6));

        System.out.println("<<<<<<<<<<< 3 >>>>>>>>>>>");

        // Print the index position of 'o' in the string: "Even longer example sentence".
        String indexPositionOf = "Even longer example sentence";
        System.out.println(indexPositionOf);
        System.out.println("The index position of 'o' in the string is: " + indexPositionOf.indexOf("o"));

        System.out.println("<<<<<<<<<<< 3 >>>>>>>>>>>");

        // Create & Print a substring "not as long" of the string "Ok this is not as long!".
        String substringOf = "Ok this is not as long!";
        int indexForChar_n = substringOf.indexOf("n");
        int lastIndexForSubstring = substringOf.indexOf("!");
        System.out.println("Print a substring \"not as long\" of the string \"Ok this is not as long!\":");
        System.out.println(substringOf.substring(indexForChar_n, lastIndexForSubstring));

        System.out.println("<<<<<<<<<<< 4 >>>>>>>>>>>");

        /* Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out.
        Then convert it back to uppercase and print it out again. */

        String convertTheString = "CAPS EQUALS SCREAMING";
        System.out.println(convertTheString);

        // Convert to lowercase and print it out.
        System.out.println("Convert to lowercase: " + convertTheString.toLowerCase());

        // Convert it back to uppercase and print it out.
        System.out.println("Convert it back to uppercase: " + convertTheString.toUpperCase());

        System.out.println("<<<<<<<<<<< 5 >>>>>>>>>>>");

        /* Correct the following String: "Java is the worst programming language!"
        by replacing the (obviously incorrect) word "worst" with the word "best".
        Then print out the sentence. */

        String replaceOfTheString = "Java is the worst programming language!";
        System.out.println("Correct the sentence: " + "\"" + replaceOfTheString + "\"");
        // Replacing the word "worst" with the word "best" and print out the sentence.
        System.out.println(replaceOfTheString.replace("worst", "best"));

        System.out.println("<<<<<<<<<<< 6 >>>>>>>>>>>");

        // What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?

        String outputOfTheString = "\tJ\ta\tv\ta\t";
        System.out.println("String: " + "\"" + outputOfTheString + "\"");

        // output of the string.
        System.out.println("The output of String after we trim it: " + "\"" + outputOfTheString.trim() + "\"");

        System.out.println("<<<<<<<<<<< 7 >>>>>>>>>>>");

        /* Parse the following int: 20 to a String and add a 20 to the end of the String.
           Printing it out should return: "2020".*/

        int number20 = 20;

        // Pares the integer to string.
        String paresIntegerToString = Integer.toString(number20);

        // Add a 20 to the end of the String.
        paresIntegerToString = paresIntegerToString + number20;

        // Print the result.
        System.out.println("Parse the int 20 to a String and add a 20: " + paresIntegerToString);

        System.out.println("<<<<<<<<<<< 8 >>>>>>>>>>>");

        /* Oil and water don't go well together.
           Given the String: "Oil and Water", split them up into the words "Oil","Water"
           and store them in a String array.
        */

        String stringOil, stringWater;
        String stringOilWater = "Oil and Water";
        System.out.println("String: " + stringOilWater);

        /* if(stringOilWater.contains("Oil")){
            stringOil = "Oil";
        }
        if(stringOilWater.contains("Water")){
            stringWater = "Water";
        } */

        //Split string up into the words "Oil".
        stringOil = stringOilWater.substring(stringOilWater.indexOf("O"), stringOilWater.indexOf("l") + 1);

        //Split string up into the words "Water".
        stringWater = stringOilWater.substring(stringOilWater.indexOf("W"), stringOilWater.indexOf("r") + 1);

        // Store the splits in a String array.
        String[] arrayOilWater = new String[]{stringOil, stringWater};

        // Print array.
        System.out.println("String[]{Oil, Water}:");
        for (int i = 0; i < arrayOilWater.length; i++) {
            System.out.println("Index[" + i + "]: " + arrayOilWater[i]);
        }

        System.out.println("<<<<<<<<<<< 9 >>>>>>>>>>>");

        /*
        Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array.
        Print out all names separately.
        */

        String splitTheString = "Carl,Susie,Fredrick,Bob,Erik";
        System.out.println("String: " + splitTheString);

        String[] arrayOfTheString;

        // Split the String into an array.
        arrayOfTheString = splitTheString.split(",");

        // Print out all names separately.
        System.out.println("Print out all names of the array:");
        for (String string : arrayOfTheString) {
            System.out.println(string);
        }

        System.out.println("<<<<<<<<<<< 10 >>>>>>>>>>>");

       /*
       Convert the following String: "ThisShouldBeConverted" to a char array.
       Iterate through the char array and print out each element.
       */

        String stringToCharArray = "ThisShouldBeConverted";
        System.out.println("String: " + stringToCharArray);

        // Convert the String to a char array.
        char[] charArray = new char[stringToCharArray.length()];
        for (int i = 0; i < stringToCharArray.length(); i++) {
            charArray[i] = stringToCharArray.charAt(i);
        }

        //Iterate through the char array and print out each element.
        System.out.println("Iterate through the char array and print out each element:");
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                System.out.print("[" + charArray[i] + "," + " ");
            } else if (i == charArray.length - 1) {
                System.out.println(charArray[i] + "]");
            } else {
                System.out.print(charArray[i] + "," + " ");
            }

        }

        System.out.println("<<<<<<<<<<< 11 >>>>>>>>>>>");

        //Convert the following char[]: {'J','a','v','a'} to a String and print it out.

        char[] charJavaArray = new char[]{'J', 'a', 'v', 'a'};
        System.out.println("Char's array: " + Arrays.toString(charJavaArray));

        // Convert the char[] to a String and print it out.
        String javaString = String.valueOf(charJavaArray);
        System.out.println("String: " + javaString);
    }
}
