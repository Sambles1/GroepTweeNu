public class Print {
    public void print(int[] array) {
        int x = array.length / 10;
        x--;
        int y = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.print(" " + array[y]);
            y++;
            System.out.println("");
            System.out.println(x);
        }
    }
}

//hier kan je alle getallen in je array printen vanuit de parameters
//de opmaak van het tabel moet hier ook gebeuren
