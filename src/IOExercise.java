import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class IOExercise {
    public static void main(String[] args) {
        char ch;
        if (args.length != 0){
            ch = args[0].charAt(0);
        }else{
            System.out.print("Enter char to count: ");
            ch = new Scanner(System.in).next().charAt(0);
        }
        System.out.printf("the char %s appeared %d time(s).%n",
                ch, countCharInFile("sample1.txt", ch));
    }
    public static int countCharInFile(String path, char ch){
        System.out.println();
        File file = new File(path);
        int counter = 0;
        try(var stream = new FileInputStream(file)){
            int c;
            while((c=stream.read()) != -1){
                if (c == (int)ch)
                    counter++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return counter;
    }
}
