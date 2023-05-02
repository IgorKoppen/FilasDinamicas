package teste;
import listaEncadeadaOrdenada.ListaOrdenada;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaOrdenada lista = new ListaOrdenada();

        System.out.println("Informe valor positivo (negativo para encerrar): ");
        int valor = teclado.nextInt();

        while(valor >= 0){
            lista.insere(valor);
            lista.apresenta();
            System.out.println("Informe valor positivo (negativo para encerrar): ");
            valor = teclado.nextInt();
        }

        teclado.close();
    }
}
