package Design _Patterns _andPrinciples;

 //The Singleton Design Pattern ensures that a class has only one instance and provides a global access point to it.
//  It is used when we want centralized control of resources, such as managing database connections, configuration settings or logging.
import java.util.Scanner;

class Singleton {
    private static Singleton obj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public void showMessage() {
        System.out.println("Singleton Object Created");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        if (s1 == s2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("Different objects created");
        }

        sc.close();
    }
}
  
