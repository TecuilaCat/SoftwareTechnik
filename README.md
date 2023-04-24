# Software-Technik (ADV)
Dieses Repository beinhaltet alle Themen, die in Softwaretechnik behandelt werden

>Erfordert Java 17

Oder Ihr ändert die `pom.xml` folgendermaßen ab:
```xml
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```

### In jedem Unterordner sind Beispiele und die dazugehörige Aufgabe zu finden!

## (A) Singleton
Das Singleton Pattern wird in realen Programmen zum Beispiel bei JPA, also einer API zum Verwalten einer Datenbank genutzt. Es stellt sicher, dass die Verbindung zur Datenbank genau einmal besteht und die Datenbank nicht von verschiedenen Instanzen aus gesteuert wird.  
  
Als trivialstes Pattern benötigt es auch nur eine Klasse (siehe Package).

## Factory Methode (Erzeugerpattern)
![simpleFactory](https://user-images.githubusercontent.com/80221159/234125065-b20fece8-0c2d-4bf8-a3dd-a3e36666420d.png)


## (B) Simple Factory
Eine Methode mit Parameter, die ein generelles Subjekt zurückgibt, intern aber ein konkretes Subjekt erstellt.

## (C) Abstract Factory


## (D) Composite


## (E) Observer-Pattern
### Idee
Man verfolgt Änderungen an einem Objekt und fängt diese Trigger in einer Observer-Klasse ab, um dort eine Verarbeitung, eine Augabe oder etwas Vergleichbares zu machen.
### Was bringt mir das Pattern?
- Umsetzung von Publish
- Umsetzung von Subscribe

Sowohl mehrere Subjekte zu einem Observer als auch mehrere Observer zu einem Subjekt lassen sich umsetzen - je nach Use-Case.

![observer](https://user-images.githubusercontent.com/80221159/234124124-6912c699-3e25-4722-b3c7-51933058e1f9.png)
