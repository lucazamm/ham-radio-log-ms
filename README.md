## Struttura 

# Comandi di avvio

I seguenti comandi sono da eseguire in sequenza:

`mvn clean install` compilazione del progetto e generazione dell'artefatto.

`docker-compose build` utilizzo di Docker Compose per la creazione dell'immagine del container.

`docker-compose up` avvia i container descritti nel file `docker-compose.yml`
`docker-compose down` effettua lo stop dei container descritti nel file `docker-compose.yml`

Eventualmente è possibile eseguire la compilazione del progetto tramite il seguente container docker:
`docker run -it --rm --name spc-backend -v "$PWD":/usr/src/spc-backend --volume "$HOME"/.m2:/root/.m2 -w /usr/src/spc-backend maven:3.3.3-jdk-8 mvn clean install`
Il motivo per ricorrere a un container docker per la compilazione possono essere molti come ci sono pro e contro, di seguito qualche esempio:
- compilazione "agnostica" rispetto all'environment di esecuzione.
- non richiede l'installazione di maven e java.
- la compilazione diventa uno standard non dipendente dal pc dello sviluppatore


## Debug 

Per l'avvio del progetto in modalità di debug è stato predisposto un Dockerfile e un descrittore docker-compose specifico.

`docker-compose -f docker-compose-debug.yml up`

Di seguito un esempio di configurazione di Visual Studio Code:
```
{
    "type": "java",
    "name": "Winder Video Twilio Backend Docker",
    "request": "attach",
    "hostName": "localhost",
    "port": 5005
    
}
```
