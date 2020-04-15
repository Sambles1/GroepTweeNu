import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Randomgetal getal = new Randomgetal();
        int[] array = getal.getArray();
        Print print = new Print();
        print.print(array);
        System.out.println("Which sorting would you like to use?");
        System.out.println("[ Quicksort / Bogosort / Bubblesort ]");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        app.sort(array); //code met meneer


        if (answer.equals("Quicksort")) {

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

    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if (array[i] < array[j]){
                    int temp;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }
}


