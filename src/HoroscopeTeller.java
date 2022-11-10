import java.util.Scanner;
public class HoroscopeTeller {
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String zodiac;
    private String element;

    public HoroscopeTeller(int month, int day, int year){
        month = birthMonth;
        day = birthDay;
        year = birthYear;
    }
    public String getZodiac(int month, int day){
        if((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            zodiac = "Capricorn";
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            zodiac = "Aquarius";
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            zodiac = "Pisces";
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            zodiac = "Aries";
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            zodiac = "Taurus";
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            zodiac = "Gemini";
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            zodiac = "Cancer";
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            zodiac = "Leo";
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            zodiac = "Virgo";
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            zodiac = "Libra";
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            zodiac = "Scorpio";
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            zodiac = "Sagittarius";
        else
            return "unidentifiable";
        return zodiac;
    }
    public String getElement(String zodiacElement){
        zodiacElement = zodiac;
        if(zodiac.equals("Aries") || zodiac.equals("Leo") || zodiac.equals("Sagittarius")){
            element = "Fire sign";
        }
        else if(zodiac.equals("Taurus") || zodiac.equals("Virgo") || zodiac.equals("Capricorn")){
            element = "Earth sign";
        }
        else if(zodiac.equals("Gemini") || zodiac.equals("Libra") || zodiac.equals("Aquarius")){
            element = "Air sign";
        }
        else{
            element = "Water sign";
        }
        return element;
    }
    public String getFortune(int randomNumber){
        int randomNumber = (int)(Math.random()*10 +1);
        if
    }

}
