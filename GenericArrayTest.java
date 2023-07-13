public class GenericArrayTest {
    
    public static void main(String[] args) {
        
        GenericArray<String> stringArray = new GenericArray<>();

        stringArray.add("Hello");
        stringArray.add("vuejs");

        System.out.println(stringArray.get(0));
        System.out.println(stringArray.get(1));

        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.add(1);
        intArray.add(2);

        System.out.println(intArray.get(0));
        System.out.println(intArray.get(1));
    }
}
