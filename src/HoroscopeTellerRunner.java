import java.util.Scanner;
public class HoroscopeTellerRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("what month were you born (number-wise, ex: january = 1)");
        int birthMonth = s.nextInt();
        System.out.print("what day were you born (number-wise, ex: the 3rd type 3)");
        int birthDay = s.nextInt();
        System.out.print("what year were you born (number-wise)");
        int birthYear = s.nextInt();
        int choice = 0;

        HoroscopeTeller userFortune = new HoroscopeTeller(birthMonth, birthDay, birthYear);

        System.out.println(userFortune.getZodiac(birthMonth, birthDay));
        System.out.println(userFortune.getElement(userFortune.getZodiac(birthMonth, birthDay)));

        while(choice != 1 && choice != 2){
            System.out.print("do you want to hear your fortune? (1 = yes 2 = no)");
            choice = s.nextInt();
            if (choice == 1){
                System.out.println(userFortune.getFortune());
            }
            else if (choice == 2){
                System.out.println("very well.");
            }
            else{
                System.out.println("make a choice please");
            }
        }

        int choice2 = 0;
        while(choice2 != 1 && choice2 != 2){
            System.out.print("do you want to know how many years you have left to live? (1 = yes 2 = no)");
            choice2 = s.nextInt();
            if (choice2 == 1){
                System.out.println(userFortune.lifeSpan(birthYear));
            }
            else if (choice2 == 2){
                System.out.println("very well.");
            }
            else{
                System.out.println("make a choice please");
            }
        }
    }
}
