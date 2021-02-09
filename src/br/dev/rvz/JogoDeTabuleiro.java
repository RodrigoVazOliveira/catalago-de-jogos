package br.dev.rvz;

/**
 * tipo de jogo de tabuleiro
 * */
public class JogoDeTabuleiro extends Jogo {
    private int quantidadeDePecas;

    public JogoDeTabuleiro() {
    }

    public JogoDeTabuleiro(String nome, int quantidadeDeJogo, int horaDeJogo, TipoDeJogo tipoDeJogo, int quantidadeDePecas) {
        super(nome, quantidadeDeJogo, horaDeJogo, tipoDeJogo);
        this.quantidadeDePecas = quantidadeDePecas;
    }

    public int getQuantidadeDePecas() {
        return quantidadeDePecas;
    }

    public void setQuantidadeDePecas(int quantidadeDePecas) {
        this.quantidadeDePecas = quantidadeDePecas;
    }
}
