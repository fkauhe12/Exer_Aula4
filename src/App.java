public class App {
    public static void main(String[] args) throws Exception {
        // Criar objeto Televisor
        Televisor tv = new Televisor();

        // Ligar o televisor
        tv.ligar();
        // Aumentar o volume
        tv.aumentarVolume(20);
        // Diminuir o volume
        tv.reduzirVolume(5);
        //desligar tv
        tv.desligar();
        // Tentar aumentar o volume enquanto a TV está desligada
        tv.aumentarVolume(30);
        //Verificar se está ligada
        tv.verificarLigada();
        //ligar tv
        tv.ligar();
        // Trocar canal
        tv.trocarCanal(20);
        // Mostrar canal atual
        tv.mostrarCanal();
        

    }
}
