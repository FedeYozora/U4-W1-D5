package it.epicode.es;

import java.util.Scanner;

public class PlayerMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Lettura dei dati da tastiera con stampa a video
        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il titolo dell'elemento: ");
            String titolo = scanner.nextLine();
            System.out.print("L'elemento è un'immagine (i), un video (v) o una registrazione audio (a)? ");
            String tipo = scanner.nextLine();

            if (tipo.equals("i")) {
                System.out.print("Inserisci la luminosità dell'immagine: ");
                int luminosita = Integer.parseInt(scanner.nextLine());
                elementi[i] = new Immagine(titolo, luminosita);
            } else if (tipo.equals("a")) {
                System.out.print("Inserisci la durata della registrazione audio: ");
                int durata = Integer.parseInt(scanner.nextLine());
                System.out.print("Inserisci il volume della registrazione audio: ");
                int volume = Integer.parseInt(scanner.nextLine());
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
            } else if (tipo.equals("v")) {
                System.out.print("Inserisci la durata del video: ");
                int durata = Integer.parseInt(scanner.nextLine());
                System.out.print("Inserisci il volume del video: ");
                int volume = Integer.parseInt(scanner.nextLine());
                System.out.print("Inserisci la luminosità del video: ");
                int luminosita = Integer.parseInt(scanner.nextLine());
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            }
        }

        // Selezione elemento e riproduzione
        int scelta = -1;
        while (scelta != 0) {
            System.out.print("Quale elemento vuoi eseguire (1-5)? (0 per terminare): ");
            scelta = Integer.parseInt(scanner.nextLine());

            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida");
            }
        }
    }
}