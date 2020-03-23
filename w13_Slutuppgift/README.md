# Slutuppgift - Hänga Gubbe

Uppgiften går ut på att du ska skapa ett egenskrivet spel i Java, som går ut på att användaren ska kunna gissa ett ord. Spelet ska vara baserat på input från användaren och skriva ut instruktioner så att användaren ska kunna lyckas gissa ordet. Vet man inte hur Hänga Gubbe spelas kan man kolla på [den här videon](https://www.youtube.com/watch?time_continue=112&v=j-pBzBvJVKc&feature=emb_title).

Innan du får börja koda över huvud taget måste du göra en **planering**. Planeringen ska godkännas av mig, och sedan får du sätta igång med själva koden. Planeringen innebär att du precis som i **Talspelet** ska göra ett flödesschema över hur du tänkt dig att programmet ser ut.

Uppgiften ska göras **enskilt** och man får vara beredd att i detalj förklara muntligt hur koden fungerar. Kod utan kommentarer och godkänd planering kommer **inte** att godkännas. Man får självklart diskutera uppgiften med varandra och fråga om hjälp om man fastnar men det är **INTE** tillåtet att kopiera varandras kod. Plagiat ger automatiskt underkänt i uppgiften, och all kod utan kommentarer räknas automatiskt som plagiat.

###### Följande basfunktionalitet måste varje spel innehålla för att du ska få godkänt:

* Ett godkänt flödesschema.
* Ett spel som fungerar, med minst följande funktionalitet:
    * Tydliga instruktioner till användaren om hur spelet går till (t ex i meny-form).
    * Att spelaren får gissa på en bokstav i taget, tills denne gissat rätt på alla bokstäver i det rätta ordet.
    * Att spelaren får någon typ av feedback efter varje gissning, med antal **kvarvarande gissningar** samt en **representation av ordet** (med bokstäver man gissat rätt på) på detta sätt: **_r__gr_mm_r_ng**
* En utvärdering (mer info kommer). Observera att utvärderingen är betygsgrundande!

*För bara godkänt krävs det alltså inte att du har någon visuell representation av en gubbe som hängs, utan det räcker med att du talar om hur många gissningar spelaren har kvar.*

###### För att nå högre betyg ska även allt eller vissa delar av följande uppfyllas:

* Att du i din kod använder dig av metoder. (Obligatoriskt för att nå högre betyg än E) Hur väl du använder och motiverar din användning av metoder påverkar hur högt betyg ni får på uppgiften (javadokumentation).

* Förslag på extra funktionalitet för att nå högre omdöme: 
    * Att ordet som ska gissas på något sätt är slumpgenererat i start av varje runda (t ex från en ordlista). 
    * Att spelet klarar av både stora och små bokstäver vid gissningar.
    * Att spelet har en meny som låter spelaren välja svårighetsnivå (exempelvis hur långa/svåra ord man får gissa på).
    * Att spelet kan köras flera gånger utan att spelaren behöver starta om hela applikationen.
    * Att man kan vara flera spelare. (Som kanske gissar på olika ord? Där en person skriver in ett ord och den andra gissar? Hur du           vill göra är helt upp till dig.)
    * Att man har något spelläge där man skriver in ett eget ord som man ska gissa på.
    * Att man kan skriva in meningar, där mellanslagen inte räknas med i "ordet".
    * *(Svårare)* Att man lägger in någon slags ljudeffekter, t.ex. när man gissar rätt/fel, gubben dör, etc.
    * Valfri annan extra funktionalitet.
    * Att du har någon typ av visuell representation av spelförloppet, med en gubbe som hängs, genom något av dessa två förslag:
    * Att du har en textbaserad visuell representation av en gubbe som hängs, kanske som i 
      [detta exempel](https://gist.github.com/chrishorton/8510732aa9a80a03c829b09f12e20d9c). Detta skrivs då ut i konsolen.
    * *(Svårare)* Att du använder dig av JavaFX eller någon slags grafisk visuell representation, antingen med bilder eller att du ritar
      upp gubben med former osv. Jag rekommenderar att ni försöker göra detta om ni tror att ni klarar av det, eftersom ni kommer 
      hålla på med grafik i Programmering 2 senare, och detta kan ge er ett försprång där.
    * Att spelet ska kunna köras utan att krascha. Hur du implementerar det är upp till dig.


Efter att koden är klar och testad kommer alla få möjlighet att utvärdera sin kod på en lektion.

Inlämningsdeadline: Vecka 19, Fredag den 8 maj, 23:59. (Färdig planering och kod)
