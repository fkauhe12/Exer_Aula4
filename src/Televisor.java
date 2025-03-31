public class Televisor {
    int volume = 10; // Default volume
    int canal = 1;   // Default channel
    boolean ligado = false; // Default state

    // Método ligar
    public void ligar() {
        if (this.ligado == false) { // Corrected syntax
            this.ligado = true;
            this.canal = 1; // Reset channel to 1 when turning on
            System.out.println("Televisor ligado.");
        } else {
            System.out.println("Televisor já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado == true) { // Corrected syntax
            this.ligado = false;
            System.out.println("Televisor desligado.");
        } else {
            System.out.println("Televisor já está desligado.");
        }
    }

