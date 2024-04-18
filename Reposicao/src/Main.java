public class Main {
    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();

        Arma arma1 = new Arma();
        arma1.setNomeArma("Arco");
        arma1.setMagica(true);

        Arma arma2 = new Arma();
        arma2.setNomeArma("Espada");
        arma2.setMagica(false);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Martelo");
        arma3.setMagica(false);

        // Criando heroi
        Anao anao = new Anao();
        anao.setNome("Dwarf");
        anao.setEnergia(100);
        anao.setIdade(23);
        anao.setAltura(1);
        anao.setReino("Olimpia");
        anao.arma = arma3;

        // Criando heroi
        Mago mago = new Mago();
        mago.setNome("Maguin");
        mago.setEnergia(999);
        mago.setIdade(53);
        mago.setCor("Blue");
        mago.arma = arma2;

        // Criando heroi
        Elfo elfo = new Elfo();
        elfo.setNome("Elfin");
        elfo.setEnergia(900);
        elfo.setIdade(34);
        elfo.setTribo("Elfos brabos");
        elfo.arma = arma1;

        // Adicionando herois
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        // Mostrando informacoes
        terraMedia.listarHabitantes();
    }
}
