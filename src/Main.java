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
        System.out.println("Тяните билет (от 1-3)");
        int chose = user.choseTicket(in.nextInt());
         teacher.questions(chose);
        int bal = teacher.getAverageScore();
         if(bal >= 4){
             System.out.println("Ув. "+user.getFirstname()+" "+user.getLastname());
             System.out.println("Вы зачислены. Ваш средний бал составил: "+bal);
             System.out.println("Преподователь пренимавщий екзамен "+teacher.getFirstname()+" "+teacher.getLastname());
         }else{
             System.out.println("Ув. "+user.getFirstname()+" "+user.getLastname());
             System.out.println("Вы не прошли. Ваш средний бал составил: "+bal+ " Требуется минимум 4");
             System.out.println("Преподователь пренимавщий екзамен "+teacher.getFirstname()+" "+teacher.getLastname());
         }
    }
}
