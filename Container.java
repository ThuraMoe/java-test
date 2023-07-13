public class Container {

    private String array[];

    public static Container instance;

    public static Container getInstance() {
        if (instance == null) {
            instance = new Container();
        }
        return instance;
    }

    private Container() {
        this.array = new String[0];
    }

    public void add(String str) {
        String temp[] = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[temp.length - 1] = str;
        array = temp;
    }

    public String[] getArray() {
        return array;
    }
}
