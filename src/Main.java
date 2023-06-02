public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<>(3);

        stringMagicBox.add("A");
        stringMagicBox.add("B");
        stringMagicBox.add("C");

        String pick = stringMagicBox.pick();

        System.out.println(pick);
    }
}