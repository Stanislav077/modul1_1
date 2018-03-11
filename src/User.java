import java.util.Scanner;

/**
 * Created by Станислав on 11.03.2018.
 */
public class User implements Example{
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void choseTicket(int numticket)
    {
        switch (numticket)
        {
            case 1:
                System.out.println("География");
               questions(numticket);
                break;
            case 2:
                System.out.println("История");
                break;
            case 3:
                System.out.println("Механика");
                break;
        }

    }


    @Override
    public String questions(int numticket) {
        Scanner in = new Scanner(System.in);
        switch (numticket)
        {
            case 1:
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                int firstnum = in.nextInt();
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                int toonum = in.nextInt();
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                int thrinum = in.nextInt();
                break;
            case 2:
                break;
            case 3:
                break;
        }



        return null;
    }
}
