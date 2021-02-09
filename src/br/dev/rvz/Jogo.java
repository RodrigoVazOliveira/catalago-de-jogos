package br.dev.rvz;

public class Jogo {
    private String nome;
    private int quantidadeDeJogo;
    private int HoraDeJogo;
    private TipoDeJogo tipoDeJogo;

    public Jogo() {
    }

    public Jogo(String nome, int quantidadeDeJogo, int horaDeJogo, TipoDeJogo tipoDeJogo) {
        this.nome = nome;
        this.quantidadeDeJogo = quantidadeDeJogo;
        HoraDeJogo = horaDeJogo;
        this.tipoDeJogo = tipoDeJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeJogo() {
        return quantidadeDeJogo;
    }

    public void setQuantidadeDeJogo(int quantidadeDeJogo) {
        this.quantidadeDeJogo = quantidadeDeJogo;
    }

    public int getHoraDeJogo() {
        return HoraDeJogo;
    }

    public void setHoraDeJogo(int horaDeJogo) {
        HoraDeJogo = horaDeJogo;
    }

    public TipoDeJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(TipoDeJogo tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }
}
