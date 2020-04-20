import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Randomgetal getal = new Randomgetal();
        int[] array = getal.getArray();
        Print print = new Print();
        print.print(array);
        Bogosort bogosort = new Bogosort();
        bogosort.Bogosort(array);
        //print.print(array);

        System.out.println("Which sorting would you like to use?");
        System.out.println("[ Quicksort / Bogosort / Bubblesort ]");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        app.sort(array); //code met meneer
        int[] array2 = app.sort(array);
        print.print(array2); //poginen die niet werken





    }

    public int[] sort(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = i; j < array2.length; j++) {
                if (array2[i] < array2[j]) {
                    int temp;
                    temp = array2[j];
                    array2[j] = array2[i];
                    array2[i] = temp;
                } else {
                    break;
                }
            }
        }
        return array2;
    }
}

