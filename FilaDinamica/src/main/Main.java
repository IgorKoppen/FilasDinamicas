package main;

import filaEncadeada.filaInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        filaInt fila = new filaInt();
        fila.init();
        System.out.println("Informe valor positivo (negativo para encerrar): ");
       int valor = teclado.nextInt();

        while(valor >= 0){
            fila.enqueue(valor);
            System.out.println("Informe valor positivo (negativo para encerrar): ");
            valor = teclado.nextInt();
        }

        while(!fila.isEmpty()){
            System.out.println("Valor retirado: " + fila.dequeue());
        }




        teclado.close();
    }
}
