/**
 * Обобщенный класс для пары значений
 * @param <T> первое обобщенное значение
 * @param <V> второе обобщенное значение
 */
public class Pair <T,V> {
    private T firstValue;
    private V secondValue;

    public Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }
}
