public class Bubble {
    public void Bubble(int[] array) {
        Print print = new Print();
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
        }
        print.print(array);
    }
}