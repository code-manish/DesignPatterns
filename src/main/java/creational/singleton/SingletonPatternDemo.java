package creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(System.identityHashCode(singleton));
    }
}
