import java.util.Scanner;

public class UsingStringBuilder {
    // main method
    public static void main(String[] args) {

        // Scanner reference variable
        Scanner input = new Scanner(System.in);

        //Get the words from the user
        System.out.println("Please enter the first word: ");
        String word1 = input.nextLine();

        System.out.println("\nPlease enter the second word: ");
        String word2 = input.nextLine();

        // Calling the function
        String mergedArr = mergeAlternatively(word1, word2);
        System.out.println("\nMerged Strings: " + mergedArr);
    }

    public static String mergeAlternatively(String word1, String word2) {

        /// A StringBuilder allows me to add characters in a string, delete or just modify it
        /// It does this without creating a new memory location.
        /// Hence the name String BUILDER!
        StringBuilder merged = new StringBuilder();

        // variables that will help build our String
        int i = 0, j = 0;

        // Merging the two Strings
        while(i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // If there are leftover letters, one of these while statements will be true and execute
        while(i < word1.length()){
            merged.append(word1.charAt(i++));
        }

        while(j < word2.length()){
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}
