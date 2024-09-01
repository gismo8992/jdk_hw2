/**
 * Сервисный класс для работы с обобщенными значениями
 */
public class Service {
    /**
     * Обобщенный метод принимает пару числовых значений и возвращает сумму этих значений
     * @param pair
     * @return
     * @param <T>
     * @param <V>
     */
    public static <T extends Number, V extends Number> double sum(Pair<T, V> pair) {
        return pair.getFirstValue().doubleValue() + pair.getSecondValue().doubleValue();
    }

    /**
     * Обобщенный метод принимает пару символьных значений и возвращает сумму этих значений
     * @param pair
     * @return
     * @param <T>
     * @param <V>
     */
    public static <T extends CharSequence, V extends CharSequence> String concatenate(Pair<T, V> pair) {
        return pair.getFirstValue().toString() + pair.getSecondValue().toString();
    }
}
