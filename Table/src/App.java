public class App {
    public static void main(String[] args) {
        for(int i = 0; i < 100000; i++){
            double randomizedRaw = 1 + Math.random() * 10000;
            int randomized = (int) randomizedRaw;
            System.out.println(randomized);
        }
    }
}
