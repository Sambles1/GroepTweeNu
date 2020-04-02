public class Randomgetal {
    public int kaas(){
        int totaal = 100000;
        for (int i = 0; i < totaal; i++) {
            double randomizedRaw = 1 + Math.random() * 10000;
            int randomized = (int) randomizedRaw;
            System.out.println(randomized);
        }

        return totaal;
    }
}
