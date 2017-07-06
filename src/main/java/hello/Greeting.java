package hello;

/**
 * Created by pfunes on 03/07/17.
 */
public class Greeting {

    private final long id;
    private final String contend;

    public Greeting(long id, String contend) {
        this.id = id;
        this.contend = contend;
    }

    public long getId() {
        return id;
    }

    public String getContend() {
        return contend;
    }
}
