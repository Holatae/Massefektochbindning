# Hur man startar programmet från .jar filen
1. Öppna terminalen
2. Navigera till mappen där .jar filen finns
3. Skriv in följande kommando: `java -jar <filnamn>.jar`
4. Wola.

ELLER
1. Öppna Notepad i och skapa en fil som heter start.bat i samma mapp som .jar filen finns
2. Skriv in följande kommando: `java -jar <filnamn>.jar`
3. Skriv in: `pause` i nästa rad
4. Spara filen som start.bat
5. Dubbelklicka på start.bat
6. Wollaaaa

# Hur man compilerar programmet
1. Öppna terminalen
2. Navigera till mappen där .jar filen finns
3. Skriv in följande kommando: `javac -d . *.java`
4. Wola.
5. Du kan nu starta programmet genom att skriva in `java Main` i terminalen.
6. Wollaaaa

## Saker som kan gå fel.
### Java inte installerat
Om du får ett felmeddelande som säger att du saknar en fil som heter `java.exe` så måste du installera Java på din dator. Du kan ladda ner det [här](https://www.java.com/en/download/).
### Vid start av program.
Om du dubbelklickar på filen så kommer ingenting att hända. Var säker på att du följer inskstruktionerna ovan. Om du fortfarande inte får något att hända så kan du prova att starta programmet från terminalen. Detta gör du genom att navigera till mappen där .jar filen finns och skriva in `java -jar <filnamn>.jar` i terminalen. Om du får ett felmeddelande som säger att du saknar en fil som heter `java.exe` så måste du installera Java på din dator. Du kan ladda ner det [här](https://www.java.com/en/download/).
### Bat filen
Om du startar via en .bat fil. GLÖM INTE att skriva in `pause` i nästa rad efter `java -jar <filnamn>.jar` annars kommer programmet att stängas direkt efter att det startat.
### Programmet crashar
Du måste skriva in `,` istället för `.` när du skriver in decimaltal. Exempel: `1,5` istället för `1.5`. Om du fortfarande får problem så kan du prova att starta programmet från terminalen. Detta gör du genom att navigera till mappen där .jar filen finns och skriva in `java -jar <filnamn>.jar` i terminalen. Om du får ett felmeddelande som säger att du saknar en fil som heter `java.exe` så måste du installera Java på din dator. Du kan ladda ner det [här](https://www.java.com/en/download/).
### Programmet stänger ner sig själv
Detta kan bero på att du har en gammal version av Java installerad. Du kan ladda ner den senaste versionen [här](https://www.java.com/en/download/).
