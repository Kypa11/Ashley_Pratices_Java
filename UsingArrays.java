import java.util.Scanner;

public class UsingArrays {

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

    ///I had to make mergeAlternatively static because static methods do not accept non static
    /// Non static belong to an object, not a class
    public static String mergeAlternatively(String word1, String word2){

        // transforming words into arrays
        char [] letters1 = word1.toCharArray();
        char [] letters2 = word2.toCharArray();

        // Array that will get all  the letters
        char [] merge = new char[letters1.length + letters2.length];

        // Variables useful or the merge
        int i =0, j =0, k = 0;

        // Merging the array
        while(i < letters1.length && j< letters2.length){
            merge[k++] = letters1[i++];
            merge[k++] = letters2[j++];
        }

        // appending surplus letters

        //if i had not reached the peak length, while statement is true
        while(i < letters1.length){
            merge[k++] = letters1[i++];
        }

        //if j had not reached the peak length, while statement is true
        while(j < letters2.length){
            merge[k++] = letters2[j++];
        }

        // return the merged array
        return new String(merge);
    }
}

