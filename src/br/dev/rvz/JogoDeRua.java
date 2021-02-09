package br.dev.rvz;

/**
 * modelo de jgoo de rua
 * */
public class JogoDeRua extends Jogo{
    private boolean perigosa;
    private LocalparaBrinca localparaBrinca;

    public JogoDeRua() {
    }

    public JogoDeRua(String nome, int quantidadeDeJogo, int horaDeJogo, TipoDeJogo tipoDeJogo, boolean perigosa, LocalparaBrinca localparaBrinca) {
        super(nome, quantidadeDeJogo, horaDeJogo, tipoDeJogo);
        this.perigosa = perigosa;
        this.localparaBrinca = localparaBrinca;
    }

    public boolean isPerigosa() {
        return perigosa;
    }

    public void setPerigosa(boolean perigosa) {
        this.perigosa = perigosa;
    }

    public LocalparaBrinca getLocalparaBrinca() {
        return localparaBrinca;
    }

    public void setLocalparaBrinca(LocalparaBrinca localparaBrinca) {
        this.localparaBrinca = localparaBrinca;
    }

    @Override
    public String toString() {
        return super.toString() + " JogoDeRua{" +
                "perigosa=" + perigosa +
                ", localparaBrinca=" + localparaBrinca +
                '}';
    }
}
