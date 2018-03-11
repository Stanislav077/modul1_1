import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      User user = new User();
      Teacher teacher = new Teacher();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя");
        user.setFirstname(in.next());
        System.out.println("Введите свою фамилию");
        user.setLastname(in.next());
        System.out.println("Тяните билет");
        user.choseTicket(in.nextInt());


    }
}
