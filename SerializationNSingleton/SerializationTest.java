import java.io.*;


public class SerializationTest {
    static DemoSingleton instanceOne = DemoSingleton.getInstance();
 
    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();
 
            instanceOne.setI(20);
			System.out.println("InstanceOne: "+instanceOne.toString());
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
            in.close();
			instanceTwo.setI(30);
			System.out.println("InstanceTwo: "+instanceTwo.toString());
            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
};