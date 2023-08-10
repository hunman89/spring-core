package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient{

    private String url;

    public NetworkClient() {
        System.out.println("url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect= " + url);
    }

    public void call(String message) {
        System.out.println("call(" + url + "): " + message);
    }

    public void disconnect() {
        System.out.println("close: " + url);
    }

    @PostConstruct
    public void init() throws Exception {
        connect();
        call("초기화");
    }

    @PreDestroy
    public void close() throws Exception {
        disconnect();
    }
}
