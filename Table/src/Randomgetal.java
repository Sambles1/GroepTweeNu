public class Randomgetal {
    public int[] getArray(){
        int[] getal = new int[10000];
        int totaal = 100000;
        for (int i = 0; i < totaal; i++) {
            double randomizedRaw = 1 + Math.random() * 10000;
            int randomized = (int) randomizedRaw;
            getal[i] = randomized;
            //System.out.println(randomized);
        }
        return getal;
    }
}
