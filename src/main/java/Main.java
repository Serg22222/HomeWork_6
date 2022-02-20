import java.util.Arrays;
import java.util.Random;
/*
Создайте класс `IndexStorage` с тремя методами - `size()`, `get(int index)` и `reverse`. Пусть размер заполняется конструктором,
а `get` возвращает то же, что и в прошлом задании (т.е. индекс или -индекс в зависимости от чётности). Напишите метод `reverse()`,
который возвращает массив, заполненный элементами в обратном порядке. Сделайте этот класс без хранения массивов в полях.

Создайте ему наследника `ArrayIndexStorage`, который бы принимал в конструкторе один параметр - массив интов, в котором хранил бы все данные.
`get(int index)` должен возвращать значение ячейки массива под номером этого индекса. Обеспечьте корректную работоспособность всех методов,
причём сделайте оба класса так, чтобы для этого не пришлось переопределять `reverse` в `ArrayIndexStorage`
 */

public class Main {
    public static void main(String[] args) {

        IndexStorage indexStorage = new IndexStorage(5);
        System.out.println(Arrays.toString(indexStorage.size()));
        //System.out.println(indexStorage.get(6));  //Проверка на выход за пределы массива
        System.out.println(indexStorage.get(1));
        System.out.println(indexStorage.get(4));
        System.out.println(Arrays.toString(indexStorage.reverse()));

        System.out.println("Создаем новый массив");
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        IndexStorage arrIdxStorage = new ArrayIndexStorage(arr);
        //System.out.println(arrIdxStorage.get(-1)); //Проверка на выход за пределы массива
        System.out.println(arrIdxStorage.get(4));
        System.out.println(Arrays.toString(arrIdxStorage.size()));
        System.out.printf(Arrays.toString(arrIdxStorage.reverse()));

    }
}