import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //App app = new App();
        Bogosort bogosort = new Bogosort();
        Randomgetal getal = new Randomgetal();
        Bubble bubble = new Bubble();

        int[] array = getal.getArray();

        System.out.println("Which sorting would you like to use?");
        System.out.println("[ Quicksort / Bogosort / Bubblesort ]");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        if (answer.equals("Quicksort")){
            System.out.println("dan heb je pech noob");
        } else if(answer.equals("Bogosort")){
            bogosort.Bogosort(array);
        } else if (answer.equals("Bubblesort")){
            bubble.Bubble(array);
        }

        //app.sort(array); //code met meneer
        //int[] array2 = app.sort(array);
        //print.print(array2); //poginen die niet werken
    }

   //public int[] sort(int[] array2) {
   //    for (int i = 0; i < array2.length; i++) {
   //        for (int j = i; j < array2.length; j++) {
   //            if (array2[i] < array2[j]) {
   //                int temp;
   //                temp = array2[j];
   //                array2[j] = array2[i];
   //                array2[i] = temp;
   //            } else {
   //                break;
   //            }
   //        }
   //    }
   //    return array2;
   //}
}

