package hello.core.singleton;

public class SingletonService {

    private final static SingletonService service = new SingletonService();

    public static SingletonService getInstance() {
        return service;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("logic");
    }
}
