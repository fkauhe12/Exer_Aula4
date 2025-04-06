public class Televisor {
    int volume = 10;
    int canal = 1;
    boolean ligado = false;

    // Método ligar
    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            this.canal = 1;
            System.out.println("Televisor ligado.");
        } else {
            System.out.println("Televisor já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("Televisor desligado.");
        } else {
            System.out.println("Televisor já está desligado.");
        }
    }

    public void aumentarVolume(int volume) {
        if (this.ligado == true) {
            if (this.volume + volume <= 100) {
                this.volume += volume;
                System.out.println("Volume aumentado para: " + this.volume);
            } else {
                System.out.println("Volume máximo atingido.");
            }
        } else {
            System.out.println("Televisor desligado. Não é possível aumentar o volume.");
        }
    }

    public void reduzirVolume(int volume) {
        if (this.ligado == true) {
            if (this.volume - volume >= 0) {
                this.volume -= volume;
                System.out.println("Volume diminuído para: " + this.volume);
            } else {
                System.out.println("Volume mínimo atingido.");
            }
        } else {
            System.out.println("Televisor desligado. Não é possível diminuir o volume.");
        }
    }

    public void trocarCanal(int canal) {
        if (this.ligado == true) {
            if (canal >= 1 && canal <= 100) {
                this.canal = canal;
                System.out.println("Canal mudado para: " + this.canal);
            } else {
                System.out.println("Canal inválido. O canal deve estar entre 1 e 100.");
            }
        } else {
            System.out.println("Televisor desligado. Não é possível mudar o canal.");
        }
    }

    public void mostrarCanal() {
        if (this.ligado == true) {
            System.out.println("Canal atual: " + this.canal);
        } else {
            System.out.println("Televisor desligado. Não é possível mostrar o canal.");
        }
    }

    public boolean verificarLigada() {
        if (this.ligado == true) {
            System.out.println("Televisor está ligado.");
            return true;
        } else {
            System.out.println("Televisor está desligado.");
            return false;
        }
    }
}
