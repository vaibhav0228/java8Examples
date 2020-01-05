import java.io.*;
public class DemoSingleton implements Serializable {
    private volatile static DemoSingleton instance = null;
 
    public static DemoSingleton getInstance() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }
 
	protected Object readResolve() {
        return instance;
    }

    private int i = 10;
 
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}