import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Randomgetal getal = new Randomgetal();
        int[] array = getal.getArray();
        Print print = new Print();
        print.print(array);
        System.out.println("Which sorting would you like to use?");
        System.out.println("[ Quicksort / Bogosort / Bubblesort ]");
        Scanner input = new Scanner(System.in);
        String answer = input.next();


        if (answer.equals("Quicksort")) {
            //quicksort goes here
            System.out.println("Quicksort done!");
        } else if (answer.equals("Bogosort")) {
            //bogosort goes here
//           System.out.println("Bogosort done!");
        } else if (answer.equals("Bubblesort")) {
            //bubblesort goes here
//           System.out.println("Bubblesort done!");
        } else {
            System.out.println("input not valid!");
        }
    }
}
