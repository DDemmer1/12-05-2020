# 12-05-2020 SoSe20 - Callbacks und externe librarys

Übungsaufgabe vom 12.05.2020 für die Studierenden des Java II Seminars der Universität zu Köln

### 📝 Aufgabe:

Ziel dieser Aufgabe ist es ein Programm zu schreiben, dass einen Text aus dem Internet herunterlädt und diesen mit Hilfe von Callback Methoden verändert und als String zurückgibt.

Um den Text vom Server zu laden eignet sich die Methode ```FileUtils.copyURLToFile([...])``` aus der externen [Apache Commons IO ](http://commons.apache.org/proper/commons-io/javadocs/api-release/index.html?org/apache/commons/io/FileUtils.html) Bibliothek besonders gut. [Apache Commons IO ](http://commons.apache.org/proper/commons-io/javadocs/api-release/index.html?org/apache/commons/io/FileUtils.html) ist nicht teil der Java Standard Library und muss extra in das Projekt eingebunden werden. Das habe ich für euch in diesem Projekt schon gemacht. Folgt einfach meiner Video-Anleitung zum einbinden von GitHub-Projekten in Eclipse.
Ihr könnt aber auch gerne eine eigene Lösung zum herunterladen von Texten implementieren!

URL des herunterzuladenen Textes: https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt


- Erstellt ein ```interface TextHandler``` mit:
  - einer Methode 	```String callback(String string)```

- Erstellt eine ```class FileDownloader``` mit:
  - einem Attribut ```List<TextHandler> textHandlers```
  - einer Methode ```public void registerTexthandler(TextHandler textHandler)```. Die Methode soll:
    - ein Objekt, dass das Interface ```TextHandler``` implementiert in die ```List<TextHandler> textHandlers``` einfügen können
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

- [📃 Apache Commons IO - FileUtils Dokumentation](http://commons.apache.org/proper/commons-io/javadocs/api-release/index.html?org/apache/commons/io/FileUtils.html)
- [📃 Wikipedia - Rückruffunktion](https://de.wikipedia.org/wiki/R%C3%BCckruffunktion)
- [📃 Implement callback routines in Java](https://www.javaworld.com/article/2077462/java-tip-10--implement-callback-routines-in-java.html)
- [📃 How do I copy a URL into a file?](https://kodejava.org/how-do-i-copy-a-url-into-a-file/)


- [🖊️ Stack Overflow - Java simple callback
](https://stackoverflow.com/questions/42463830/java-simple-callback)





