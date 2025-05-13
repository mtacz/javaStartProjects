
public class TestPair {
    public static void main(String[] args) {

        Pair<String, String> stringPair = new Pair<>("Hello", "World");
        Pair<Integer, Integer> intPair = new Pair<>(1, 2);
        Pair<Character, Character> charPair = new Pair<>('a', 'b');

        printInfo(stringPair);
        printInfo(intPair);
        printInfo(charPair);

    }

    static <T,V> void printInfo(Pair <T,V> pair) {
        System.out.println("Pair: < " + pair.getFirst() + "; " + pair.getSecond() + ">");
    }
}


