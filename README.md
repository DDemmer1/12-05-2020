# 12-05-2020 SoSe20 - Callbacks und externe librarys

Übungsaufgabe vom 12.05.2020 für die Studierenden des Java II Seminars der Universität zu Köln

### 📝 Aufgabe:

Ziel dieser Aufgabe ist es ein Programm zu schreiben, dass einen Text aus dem Internet herunterlädt und diesen mit Hilfe von Callback Methoden verändert und als String zurückgibt. 

URL des herunterzuladenen Textes: https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt


- Erstellt ein ```interface TextHandler``` mit:
  - einer Methode 	```String callback(String string)```

- Erstellt eine ```class FileDownloader``` mit:
  - einem Attribut ```List<TextHandler> textHandlers```
  - einer Methode ```public void registerTexthandler(TextHandler textHandler)```
    - Die Methode soll einen Objekt, dass das Interface ```TextHandler``` implementiert in die ```List<TextHandler> textHandlers``` einfügen können
  - einer Methode ```public String downloadTextFile(String url)```. Die Methode soll:
      - ein Text-File von einem Server herunterladen
      - dann das enstandene Text-File in einen String laden
      - anschließend alle ```String callback(String string)``` Methoden der ```TextHandler``` aufrufen und den Text entsprechend verändern und im ```return``` Wert zurückgeben
      
 - In der ```main``` Methode:
    - Erstellt ein Objekt ```FileDownloader```
    - Registriert ein paar anonyme ```TextHandler``` im ```FileDownloader```, die z.B. in einem String alle Vokale entfernen oder einen String kleinschreiben
    - ruft die ```downloadTextFile(String url)``` Methode auf und lasst euch den durch die ```TextHandler``` veränderten Text in der Konsole ausgeben
 

    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video](https://uni-koeln.sciebo.de/s/CnL5Cg1opl8QceE)
- [🎥 Rekursion einfach erklärt](https://www.youtube.com/watch?v=weTpjhDnLnc)
- [🎥 Comparable vs Comparator in Java](https://www.youtube.com/watch?v=weTpjhDnLnc)

- [📃 Difference between Comparable and Comparator](https://www.javatpoint.com/difference-between-comparable-and-comparator)
- [📃 Comparable vs Comparator in Java](https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/)
- [📃 Iteration und Rekursion - Java](https://java-tutorial.org/iteration_und_rekursion.html)

- [🖊️ Stack Overflow - Are recursive methods always better than iterative methods in Java?](https://stackoverflow.com/questions/15346774/are-recursive-methods-always-better-than-iterative-methods-in-java)
- [🖊️ Stack Overflow - Benefits of recursion in Java?](https://stackoverflow.com/questions/8573116/what-is-the-benefit-of-using-or-creating-recursive-functions-in-java)
- [🖊️ Stack Overflow - When to use Comparable and Comparator?](https://stackoverflow.com/questions/2266827/when-to-use-comparable-and-comparator)





