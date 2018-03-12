import java.util.Scanner;

/**
 * Created by Станислав on 11.03.2018.
 */
public class Teacher implements Example{
    private String firstname;
    private String lastname;
    private int averageScore=0;

    public String getFirstname() {
        return "Иван";
    }

    public String getLastname() {
        return "Иванов";
    }

    @Override
    public String questions(int numticket) {
        Scanner in = new Scanner(System.in);
        switch (numticket)
        {
            case 1:
                System.out.println("Первый вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                 if(in.nextInt() == 1){
                     chosequestionsGood();
                 }else{
                     chosequestionsBed();
                 }

                System.out.println("Второй вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 1){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 1){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                break;
            case 2:
                System.out.println("Первый вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 2){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }

                System.out.println("Второй вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 2){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 2){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                break;
            case 3:
                System.out.println("Первый вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 3){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }

                System.out.println("Второй вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 3){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                System.out.println("Третий вопрос \n  1.Красное \n  2.Черное \n  3.Белое");
                if(in.nextInt() == 3){
                    chosequestionsGood();
                }else{
                    chosequestionsBed();
                }
                break;
        }
        return null;
    }

    @Override
    public int chosequestionsGood() {

        averageScore+=7;
        return averageScore;
    }

    @Override
    public int chosequestionsBed() {
        averageScore--;
        return averageScore;
    }

    public int getAverageScore() {

        averageScore = averageScore/3;

        return averageScore;
    }
}
