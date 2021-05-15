// This class need to be completed.
import java.io.File;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class CollectionsExercise {
    public static void main(String[] args) {
        convertFileToArray("");
    }

    /**
     * This function is to convert a file into string.
     * @param path The path of file to be converted.
     * @return array of strings, each element represents a line in the file.
     */
    public static String[] convertFileToArray(String path){
        int assumedLineSize = new Random().nextInt();
        int lineNumber = 0;
        File file = new File(path);
        int ch;
        String[] arrayFile = null;
        try(var stream = new FileInputStream(file)){
            Scanner input = new Scanner(file);
            arrayFile = new String[(int)(file.length() / (long) assumedLineSize)];
            while (input.hasNext()){
                arrayFile[0] = input.nextLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return arrayFile;
    }
    public static void  addLineToArray(String[] arr, int index){

    }
}
