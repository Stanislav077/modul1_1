/**
 * Created by Станислав on 11.03.2018.
 */
public class User {
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
    public int choseTicket(int numticket)
    {
        switch (numticket)
        {
            case 1:
                System.out.println("География");

                break;
            case 2:
                System.out.println("История");
                break;
            case 3:
                System.out.println("Механика");
                break;
        }

        return numticket;
    }



}
