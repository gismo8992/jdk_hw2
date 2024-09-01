public class Main {
    public static void main(String[] args) {
        Pair<Integer, Double> pair1 = new Pair<>(2, 3.4);
        double result1 = Service.sum(pair1);
        System.out.println(result1);

        Pair<String, String> pair2 = new Pair<>("Good", " morning");
        String result2 = Service.concatenate(pair2);
        System.out.println(result2);
    }
}