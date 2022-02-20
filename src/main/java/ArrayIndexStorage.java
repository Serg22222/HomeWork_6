public class ArrayIndexStorage extends IndexStorage {

    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        super.get(index);
        return arr[index];
    }

    @Override
    public int[] size() {
        return arr;
    }
}
