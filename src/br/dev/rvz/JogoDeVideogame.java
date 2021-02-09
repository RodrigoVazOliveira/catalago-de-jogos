package br.dev.rvz;

/**
 * classe responsavel pelo jogo de video games
 * @author Rodrigo.vaz
 * */
public class JogoDeVideogame extends Jogo {
    private boolean online;

    public JogoDeVideogame() {
    }

    public JogoDeVideogame(String nome, int quantidadeDeJogo, int horaDeJogo, TipoDeJogo tipoDeJogo, boolean online) {
        super(nome, quantidadeDeJogo, horaDeJogo, tipoDeJogo);
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
