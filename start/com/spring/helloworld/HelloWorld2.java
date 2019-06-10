package start.com.spring.helloworld;

public class HelloWorld2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
