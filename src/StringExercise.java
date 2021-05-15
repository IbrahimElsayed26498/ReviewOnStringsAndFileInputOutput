import java.util.Arrays;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full name: ");
        displayInitials(input.nextLine());
        System.out.println();
    }
    private static void displayInitials(String s){
        Arrays.asList(s.split(" ")).
                forEach(name -> System.out.print(name.charAt(0) + " "));
    }
}
