public class Bogosort {
    public void Bogosort(int[] array) {
        int temp;
        int check = 0;
        boolean sorted = false;

        do {
            //2 random posities
            double z = 1 + Math.random() * array.length;
            double a = 1 + Math.random() * array.length;
            int x = (int) z;
            int y = (int) a;

            //waarde wisselaar gogelaar
            temp = array[x];
            array[x] = array[y];
            array[y] = temp;


            for (int i = 0; i > array.length; i++) {
                int u = 1;

                if (array[i] > array[u]) {
                    check++;
                }
                else{
                    break;
                }
                if (check == array.length) {
                    sorted = true;
                    break;
                }
            }
        }
        while (!sorted);
    }
}
