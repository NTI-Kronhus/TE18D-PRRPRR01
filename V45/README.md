# Inlämmningsuppgift MethodLibrary

Den här inlämningsuppgiften är en lite större uppgift, som vi ska jobba med i nästkommande 2 veckor. 

Precis som alla tidigare uppgifter ska den pushas till GitHub, och länken lämnas in på Classroom.

**DEADLINE 1/12, 23:59**

### Uppgiftsbeskrivning
Ni ska **skapa ett antal metoder** som räknar ut olika saker baserat på de värden de får in. Exakt vilka metoder ni ska ha med står längre ned i uppgiften.

### Metoder som skall finnas med:
Dina metoder ska vara kommenterade med vanliga kommentarer (och Javadoc om du siktar på högre betyg). <br><br>
1. En metod som gör om grader fahrenheit till kelvin.
```java
double fahrenheitToKelvin(double fahrenheit)
fahrenheitToCelsius(100) => 310.93
```

2. En metod som gör om grader kelvin till grader celcius.
```java
double kelvinToCelsius(double kelvin)
kelvinToCelsius(0) => -273.15
```

4. En metodr som omvandlar km/h till m/s.
```java
double velocityCoversion(double velocityKmH)
velocityConversion(90) => 25
```

5. En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
```java
double kineticEnergy(double mass, double velocity)
kineticEnergy(2,2) => 4
```

6. En metod som räknar ut potentiell energi med hjälp av massa och höjd.
```java
double potentialEnergy(double mass, double height)
potentialEnergy(2,5) => 98.2
```

8. En metod som räknar ut medelvärde mellan tre givna värden.
```java
double delta(double first, double second, double last)
delta(1,5,10) => 8
delta(-1,6,10) => 5
```

9. En metod som tar in strängen "PaParaZZi" och byter gör alla stora bokstäver till små.
```java
String smallLetters(String word)
smallLetters("PaParaZZi") => paparazzi
```

10. En metod som tar in strängen "Jag vill bli godkänd i programmering!", byter ut alla små bokstäver till stora och byter ut alla o till 0.
```java
String pr0grammering(String word)
smallLetters("Jag vill bli godkänd i programmering! <3") => JAG VILL BLI G0DKÄND I PR0GRAMMERING! <3
```


14. En metod som räknar ut tid för hjälp av sträcka och hastighet.
```java
double svtTime(double distance, double velocity)
svtTime(10,2) => 5
```

15. En metod som räknar ut arbete med hjälp av kraft och sträcka.
```java
double work(double force, double distance)
work(50,10) => 500
```

16. En metod som räknar ut effekt med hjälp av arbete och tid.
```java
double power(double work, double time)
power(1000,2) => 500
```

17. En metod som räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
```java
double heat(SolidTable solid, double mass, double deltaT)
heat(SolidTable.IRON,1,2) => 900
```

18. En metod som räknar ut hur mycket energi som krävs för att värma en viss massa vätska ett angivet antal grader.
```java
double heat(FluidTable fluid, double mass, double deltaT)
heat(FluidTable.WATER,1,10) => 41900
```

19. En metod som räknar ut hur mycket energi som krävs för att värma en viss massa gas ett angivet antal grader.
```java
double heat(GasTable gas, double mass, double deltaT)
heat(GasTable.AIR,1,1) => 1010
```

20. En metod som räknar ut hur högt ett föremål med en viss hastighet uppåt kommer.
```java
double velocityToHeight(double velocity)
velocityToHeight(9.82) => 4.91 
```


### Frågor som skall besvaras med hjälp av era metoder:
Dessa ska besvaras i er main-metod.
1. Hur mycket väger 60 dm^3 järn?
2. Hur långt hinner Tomas om han löper med medelhastigheten 2.7 m/s i 50 minuter?
3. Hur mycket energi krävs för att värma upp 4 liter vatten?
4. Hur stort är det totala trycket 75 meter under havsytan?
5. Tomas som är 180cm lång kastar upp en boll med massan 250 gram i luften så den får starthastigheten 60 km/h. Hur högt kommer bollen?
6. En bil med massan 735kg accelererar med konstant acceleration från 0-100 på 4.8 sekunder. Hur stor effekt har bilens motor uppnått?
7. En studsboll släpps från 12 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?
8. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
9. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
10. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.

## För att nå högre betyg än C på uppgiften vill jag även att ni lägger till:
* Java-dokumentation på alla metoder.
* Ytterligare 10 st eller fler egenskrivna fysikaliska metoder.
* Använt dig av GitHub genom hela uppgiften och gjort minst 15 relevanta commits.


### Viktigt att tänka på:
* Alla formler och uppgfter bortser från luftmotstånd!

# Inlämning sker senast söndag den 1/12 kl 23:59 på GitHub + Classroom
