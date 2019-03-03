import java.io.*;
public class SerializationDemo {
public static void main(String[] args) {
try {
Student st1 = new Student(101,"Akshat",92.34);
System.out.println("Object to be serialized");
System.out.println("Object : "+st1);
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
("serial"));
oos.writeObject(st1);
System.out.println("Object Serialized");
oos.flush();
oos.close();
}
catch(Exception e) {
System.out.println(e);
}
try {
Student st2;
ObjectInputStream ois = new ObjectInputStream(new FileInputStream
("serial"));
st2 = (Student)ois.readObject();
ois.close();
System.out.println("Object after deserialization");
System.out.println("Object : "+st2);
}
catch(Exception e) {
System.out.println(e);
}
}
}