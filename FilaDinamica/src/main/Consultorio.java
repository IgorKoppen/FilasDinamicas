package main;

import java.util.Scanner;

import filaEncadeada.filaPaciente;
import paciente.Paciente;

public class Consultorio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        filaPaciente filaPacientes = new filaPaciente();
        filaPacientes.init();
        int opcao = 0;
        do {
            System.out.println("0 - Encerrar atendimento");
            System.out.println("1 - Inserir Paciente na fila");
            System.out.println("2 - Atender Paciente");
            System.out.println("Opcao: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 0:
                    if(filaPacientes.isEmpty())
                        System.out.println("Encerrado o atendimento!");
                    else{
                        System.out.println("Ainda há Pacientes aguardando atendimento");
                        opcao = -1;
                    }

                    break;
                case 1:
                    String nome;
                    int idade;
                    System.out.println("Digite o nome do paciente: ");
                    nome = teclado.next();
                    System.out.println("Digite a idade");
                    idade = teclado.nextInt();
                    Paciente newPaciente = new Paciente(nome, idade);
                    filaPacientes.enqueue(newPaciente);
                    break;
                case 2:
                    if(!filaPacientes.isEmpty()){
                        System.out.println(filaPacientes.first().toString());
                        filaPacientes.dequeue();
                    }else{
                        System.out.println("Não é possivel remover");
                    }
                    break;
                default:
                    System.out.println("Opcao Invalida!\n");
            }
        } while (opcao != 0);
        teclado.close();
    }
}

