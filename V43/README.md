## Lektionsuppgifter och läxa 5 v43
Uppgifterna denna veckan är att skapa några enkla **metoder**. Ni ska alltså **inte** skriva någon kod i er main-metod, förutom anrop till de metoder ni skapar. 

1. Skapa en metod ```lol()``` som enbart **skriver ut** texten: HAHAHAHAHAHAHA.
2. Skapa en metod ```max(int a, int b)``` som ska ta in två heltal och **returnera** den största.
3. Skapa en metod ```count(int n)``` som ska ta in en siffra ```n``` och **skriva ut** alla siffror från 1-```n```.
4. Skapa en metod ```kelvinToCelsius(double kelvin)``` som tar in en temperatur i grader Kelvin och **returnerar** den i Celsius.
```java
double kelvinToCelsius(double kelvin)
kelvinToCelsius(0) => -273.15
```
5. En metod som gör om grader fahrenheit till grader celcius.
```java
double fahrenheitToCelsius(double fahrenheit)
fahrenheitToCelsius(50) => 10
```
6. Skapa en metod ```ageControl(int age)``` som ska kontrollera din ålder och **skriva ut** olika outputs beroende på hur gammal du är.
    * 0-5 -> "Småbarn får inte göra något."
    * 6-12 -> "Du får spela Fortnite."
    * 13-14 -> "Du är tonåring."
    * 15-17 -> "Du får köra moppe."
    * 18-20 -> "Du får köra bil."
    * 21-64 -> "Du får vuxenstraff om du gör något dumt."
    * 65-99 -> "Du är pensionär."
    * 100+ -> "R.I.P?"
6. Skapa en metod ```stair(int steps)``` som **skriver ut** en trappa gjord av X med specificerat antal trappsteg .<br>
Exempel:
```
stair(4) =>
   X
  XX
 XXX
XXXX
```
