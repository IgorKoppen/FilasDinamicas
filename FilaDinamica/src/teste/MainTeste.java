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
        System.out.println("Digite o numero que deseja remover:");
        int elem = teclado.nextInt();
while (elem>=0) {
    System.out.println("Digite o numero que deseja remover:");
    elem = teclado.nextInt();
    if (lista.remove(elem))
        System.out.println("Valor retirado!");
    else {
        System.out.println("Valor nao esta na lista!");
    }
    lista.apresenta();

}
        int limite =0;
        System.out.println("Digite o limite inferior: ");
        limite = teclado.nextInt();
        lista.apresentaMaiores(limite);
        teclado.close();
    }
}
