/*
HoroscopeTeller class

Instance variables:
Private int birthYear - user inputted birth year
Private int birthMonth - user inputted birth month
Private int birthDay - user inputted birth day
Private String zodiac - this will be found out later based on the user data

Public Horoscope(int birthMonth,  int birthDay, int birthYear)
This constructor will contain all the birth variables which will be used later to determine horoscope

Public String getElement(birthMonth)
Will return the zodiac element

Public String getZodiac(birthMonth, birthDay)
Will return the zodiac using the dates inputted and set it equal to the instance variable

Public String getFortune(int randomNumber)
Will return a random future depending on the birthYear date

Public int yearsLeft()
Predicts a random lifespan left depending on birthYear

HoroscopeTellerRunner class
Ask for the users birth info
Convert the input and attach it to the variables
Attach the variables to an object
Call the getZodiac method to deduce the horoscope
Call the getElement method then to deduce the horoscope
Ask if they wish to hear their fortune
Give a random fortune cookie type saying
Then display lifespan left

 */