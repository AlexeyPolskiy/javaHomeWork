//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//    }
//}
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getDayOfYear());
        System.out.println(LocalDateTime.now());
    }
}