public class ContainerAdder {
    
    // private Container container;
    private Singleton container;

    public ContainerAdder() {
        // container = Container.getInstance();
        container = Singleton.Container;

    }

    public void add(String str) {
        container.add(str);
        System.out.println("Add new string : " + str);
    }
}
