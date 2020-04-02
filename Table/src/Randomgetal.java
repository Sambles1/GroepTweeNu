public class Randomgetal {
    public int[] getArray(){
        int totaal = 100000;  //het aantal getallen wat word toevegoegt aan het array en ook de groote van array bepaald
        int[] getal = new int[totaal];
        for (int i = 0; i < totaal; i++) {
            double randomizedRaw = 1 + Math.random() * 10000;
            int randomized = (int) randomizedRaw;
            getal[i] = randomized;
        }
        return getal;
    }
}
