package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 *  gerenciamento de catalagos dos jogos cadastrsos
 * @author Rodrigo.vaz
 * */
public class CatalagoDeJogo {
    private List<Jogo> catalagoJogos;

    CatalagoDeJogo() {
        catalagoJogos = new ArrayList<>();
    }

    public List<Jogo> getCatalagoJogos() {
        return catalagoJogos;
    }

    public void setCatalagoJogos(List<Jogo> catalagoJogos) {
        this.catalagoJogos = catalagoJogos;
    }

    public void listar() {
        for (Jogo jogo: catalagoJogos) {
            IO.output(jogo.toString());
        }
    }
}
