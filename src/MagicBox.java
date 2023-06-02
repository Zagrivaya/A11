import java.util.Random;

public class MagicBox<T> {

    T[] items;

    public MagicBox(int size) {

        items = (T[]) new Object[size];
    }

    public boolean add(T item) {

        for (int i = 0; i < items.length; i++) {
            if(items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {

        for(int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна. Осталось ещё %s ячеек заполнить", items.length - i));
            }
        }

        Random random = new Random();
        int randomS = random.nextInt(items.length);
        return items[randomS];
    }
}
