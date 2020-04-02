public class App {
    public static void main(String[] args) {
        int totaal = 100000;
        for(int i = 0; i < totaal; i++){
            double randomizedRaw = 1 + Math.random() * 10000;
            int randomized = (int) randomizedRaw;
            if (randomized > 10000){
                totaal++;
            } else {
                System.out.println(randomized);
            }
        }
    }
}
