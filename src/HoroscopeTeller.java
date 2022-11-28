/**
 * The HoroscopeTeller class represents a horoscope which is a star sign based off
 * birth year, month, and day and based off zodiac there are assigned elements and various fortunes
 */
public class HoroscopeTeller {
    private int year;
    private int birthMonth;
    private int birthDay;
    private String zodiac;
    private String element;

    /**
     * constructor for the HoroscopeTeller class creates a new instance of birth data of a person
     * @param month this parameter represents the birth month of the person
     * @param day   this parameter represents the birthday of the person
     * @param year  this parameter represents the birth year of the person
     */
    public HoroscopeTeller(int month, int day, int year){
        month = birthMonth;
        day = birthDay;
        year = year;
    }

    /**
     * this method will use the logic of the written conditions to deduce the zodiac sign based off birth
     * month and day
     * @param month this parameter represents the birth month of the person
     * @param day   this parameter represents the birthday of the person
     * @return returns the zodiac value that is deduced based off the logic
     */
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

    /**
     * this deduces the element of the zodiac by using logic of the classified zodiacs to see if the zodiac
     * fits into any of the groups
     * @param zodiacElement this parameter represents the users zodiac
     * @return  this returns the element of the zodiac sign
     */
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

    /**
     * This function will return a String with a full sentence
     * including all the information about the user's zodiac.
     * @return returns a String in a properly formatted sentence containing
     * the info about the user's zodiac
     */
    public String toString() {
        return "you are a " + zodiac + " which is a " + element;
    }

    /**
     * this function generates and returns a random fortune based
     * @return returns a random fortune
     */
    public String getFortune(){
        int randNumber = (int)(Math.random()*10 +1);
        for(int i = 0; i < 11; i++){
            if (randNumber == 1 || randNumber == 6){
                return "beware of stairs";
            }
            if (randNumber == 2 || randNumber == 7){
                return "get rid of the toxic person in your life";
            }
            if (randNumber == 3 || randNumber == 8){
                return "Prosper in the trust of others";
            }
            if (randNumber == 4 || randNumber == 9){
                return "Keep your eye out for someone special";
            }
            if (randNumber == 5 || randNumber == 10){
                return "Land is on the mind of a flying bird";
            }
        }
        return "you have an unforeseeable future";
    }

    /**
     * this function generates a random number of years left for a person to live based off their birth
     * year to keep it realistic as someone born in 1960 should not have 50 more years to live as opposed
     * to someone born in 2006
     * @param year this parameter represents birth year
     * @return  this returns a random but realistic number of years left to live
     */
    public int lifeSpan(int year){
        if (year > 2000){
            int youngerGen = (int)(Math.random()*50+1);
            return youngerGen;
        }
        else if (year < 2000 && year > 1980){
            int millennials = (int)(Math.random()*30+1);
            return millennials;
        }
        else if (year < 1980 && year > 1950){
            int elderly = (int)(Math.random()*10+1);
            return elderly;
        }
        else {
            return 0;
        }
    }
}
