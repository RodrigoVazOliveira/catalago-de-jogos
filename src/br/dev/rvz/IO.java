package br.dev.rvz;

import java.util.Scanner;

/**
 * entidade resposnavel pela entrdada e saida de dados
 * */
public class IO {
    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void output(String texto) {
        System.out.println(texto);
    }
}
