public class IndexStorage {

    private int length;

    public IndexStorage(int length) {
        this.length = length;
    }

    public int[] size() {
        int[] arr = new int[this.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = get(i);
        }
        return arr;
    }

    public int get(int index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("Выход за диапазон массива");
        }
        return index % 2 == 0 ? index : -index;
    }

    public int[] reverse() {
        int[] arr = size();
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
}
