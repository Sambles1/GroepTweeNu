public class Bogosort {
    public void Bogosort(int[] array) {
        Print print = new Print();

        int temp;
        int check = 0;
        boolean sorted = false;


        do {
            System.out.println("de bogoaids is aan het werk");
            //2 random posities
            double z = Math.random() * array.length;
            double a = Math.random() * array.length;
            int x = (int) z;
            int y = (int) a;

            //waarde wisselaar gogelaar
            temp = array[x];
            array[x] = array[y];
            array[y] = temp;

            for (int u = 0; u > array.length - 1; u++) {
                if (array[u] > array[u + 1]) {
                    break;
                } else {
                    check++;
                    if (check >= array.length - 1) {
                        sorted = true;
                        break;
                    }
                }

            }


            //for (int i = 0; i > array.length; i++) {
            //    int u = 1;

            //    if (array[i] > array[u]) {
            //        check++;
            //        System.out.println("check");
            //    }
            //    if (check == array.length) {
            //        sorted = true;
            //        break;
            //    }
            //    else{
            //        break;
            //    }

            //  }
        }
        while (!sorted);

        print.print(array);
    }
}