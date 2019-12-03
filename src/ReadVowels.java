
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Leyeseyi
 */
//This program counts and displays the number of vowels in a file
public class ReadVowels {

    private static String file;
    private static int vowelCount;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> VowelSet = new ArrayList();
        VowelSet.add("a");
        VowelSet.add("e");
        VowelSet.add("i");
        VowelSet.add("o");
        VowelSet.add("u");

        Scanner input = new Scanner(System.in);

        //Specify directory
        file = "C:\\Users\\Leyeseyi\\Downloads\\leye.txt";

        Scanner newFile = new Scanner(new File(file));

        Iterator LIter = VowelSet.iterator();

        while (input.hasNext()) {

            System.out.print(LIter.next() + " ");
            vowelCount++;
        }

        input.close();

        System.out.println("Number of vowels is: " + vowelCount);

    }
}
