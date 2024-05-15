# Een kleine handleiding!
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

De applicatie in deze demo doet niets.
Hoewel, noem het maar niets: een window waarin tekening kunnen worden geprogrammeerd.
En als je de code bekijkt dan zie je dat er al flink wat in staat.

```
import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }
```
In alle opdrachten tijdens deze module zul je deze code tegenkomen.

Jij gaat werken in het volgende stukje:
```
    public void run() {

        // Your code goes here!!!! <--

    }
```
Al jouw code komt hier tussen de twee accolades te staan.

Je hebt inmiddels al een aantal stukjes code gezien.
Kopieer een stukje code uit een van de andere files en print op het scherm een regel tekst of iets anders dat je wilt maken.
Dat kopieren kan gewoon met copy/paste.

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)