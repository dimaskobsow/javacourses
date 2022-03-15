package lesson13.lesson13HomeWork;

import java.util.List;
import java.util.TreeSet;

public interface ListItils {

    /**
     * Конвертирует переменное число параметров в список строк
     *
     * @param strings переменное число аргументов
     * @return список строк
     * @throws IllegalArgumentException если один из аргументов null
     */
    List<String> asList(String... strings) throws IllegalArgumentException;

    /**
     * Возвращает отсортированный список в обратном порядке (по убыванию)
     * <b>Исходный список не должен быть изменен</b>
     *
     * @return отсортированный список по убыванию
     * @throws IllegalArgumentException если data = null
     */
    TreeSet<String> sortedList() throws IllegalArgumentException;
}
