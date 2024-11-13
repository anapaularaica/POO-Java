public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        meuIphone.selecionarMusica("Imagine");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("(18) 12345-6789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.anapaula.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
