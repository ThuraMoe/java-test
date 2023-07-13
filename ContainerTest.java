public class ContainerTest {
    public static void main(String[] args) {
        ContainerAdder adder = new ContainerAdder();
        adder.add("Hello");
        adder.add("Java Learning");

        // Container container = Container.getInstance();
        Singleton container = Singleton.Container;

        // another way (direct access to Container.java)
        // Container newContainer = Container.getInstance();
        Singleton newContainer = Singleton.Container;
        newContainer.add("newContainer");

        System.out.println("Get container arrays");
        for(String str : container.getArray()) {
            System.out.println(str);
        } 

        
        System.out.println("Accessing container from new instance");
        for(String str : newContainer.getArray()) {
            System.out.println(str);
        }
 
    }
}
