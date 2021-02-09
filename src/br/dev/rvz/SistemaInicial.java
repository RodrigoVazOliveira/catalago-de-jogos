package br.dev.rvz;

/**
 * responsavel por todo fluxo de dados e criação de dados e inclusão dos jogos
 * @author Rodrigo.vaz
 * */
public class SistemaInicial {

    private boolean run;
    private CatalagoDeJogo catalagoDeJogo;
    private int options;

    public SistemaInicial() {
        this.run = true;
        catalagoDeJogo = new CatalagoDeJogo();
        while(run) {
            IO.output("1. Cadastro de jogo de tabuleiro\n2. Cadastro de jogo de video game.\n3. cadastro de jogo de rua.\n4. Listar os jogos.\n5. sair do sistema");
            options = IO.input().nextInt();
            if (options == 1) {
                adicionarJogoDeTabuleiro();
            } else if (options == 2) {
                adicionarJogoDeVideoGame();
            } else if (options == 3) {
                adicionarJogoDeRua();
            } else if (options == 4) {
                catalagoDeJogo.listar();
            } else if (options == 5) {
                run = false;
            } else {
                IO.output("opção invalida");
            }
        }
    }

    private void adicionarJogoDeTabuleiro() {
        Jogo jogoDeTabuleiro;
        IO.output("Digite o nome, quantida de jogador, hora de jogo e quantidade de peças");
        jogoDeTabuleiro = new JogoDeTabuleiro(
                IO.input().nextLine(),
                IO.input().nextInt(),
                IO.input().nextInt(),
                TipoDeJogo.TABULEIRO,
                IO.input().nextInt()
        );
        catalagoDeJogo.getCatalagoJogos().add(jogoDeTabuleiro);
    }

    private void adicionarJogoDeVideoGame() {
        Jogo jogoDeVideoGame;
        IO.output("Por favor informe o nome, quantidade de jogador, horas de jogo e se é online (sim ou não)");
        jogoDeVideoGame = new JogoDeVideogame(
                IO.input().nextLine(),
                IO.input().nextInt(),
                IO.input().nextInt(),
                TipoDeJogo.VIDEOGAME,
                verificarJogoVideoGameonline(IO.input().nextLine())
        );
        catalagoDeJogo.getCatalagoJogos().add(jogoDeVideoGame);
    }

    private void adicionarJogoDeRua() {
        Jogo jogoDeRua;
        IO.output("Por favor informe o nome, quantidade de jogador, horas de jogo, se é periogoso (sim ou não e se o jogo é no litoral ou cidade");
        try {
            jogoDeRua = new JogoDeRua(
                    IO.input().nextLine(),
                    IO.input().nextInt(),
                    IO.input().nextInt(),
                    TipoDeJogo.RUA,
                    verificarJogoDeRuaPerigoso(IO.input().nextLine()),
                    verificarJogoDeRuaLocal(IO.input().nextLine())
            );
            catalagoDeJogo.getCatalagoJogos().add(jogoDeRua);
        }catch (RuntimeException e) {
            IO.output("opção invaida.");
        }
    }

    private LocalparaBrinca verificarJogoDeRuaLocal(String local) {
        if (local.equalsIgnoreCase("cidade")) {
            return LocalparaBrinca.CIDADE;
        } else if (local.equalsIgnoreCase("litoral")) {
            return LocalparaBrinca.LITORAL;
        } else {
            throw new RuntimeException();
        }
    }

    private boolean verificarJogoDeRuaPerigoso(String resposta) {
        if (resposta.equalsIgnoreCase("sim")) {
            return true;
        } else if (resposta.equalsIgnoreCase("nao")) {
            return false;
        } else {
            throw new RuntimeException();
        }
    }

    private boolean verificarJogoVideoGameonline(String resposta) {
        if (resposta.equalsIgnoreCase("sim")) {
            return true;
        } else {
            return false;
        }
    }

}
