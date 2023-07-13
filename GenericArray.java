public class GenericArray<T> implements GenericArrayInterface<T> {
    
    private Object[] array;

    public GenericArray() {
        array = new Object[]{};
    }

    public void add(T data) {
        Object[] temp = new Object[array.length + 1];

        for(int i=0; i<array.length; i++) {
            temp[i] = array[i];
        }
        temp[temp.length - 1] = data;

        array = temp;
    }
    
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

}
