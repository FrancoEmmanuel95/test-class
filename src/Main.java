import model.TestClass;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TestClass t1 = new TestClass();
        t1.setName("Pepe");
        TestClass t2 = new TestClass(0,"Juan");
        t2.getName();
        TestClass t3 = new TestClass("Pepe");
        t3.setId(3);


        System.out.println(t3.getId()+" "+t3.getName());


        }
    }
