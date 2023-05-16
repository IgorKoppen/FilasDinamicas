package teste;

import entidade.Aluno;
import listaEncadeadaOrdenada.ListaAluno;

import java.util.Scanner;

public class testeAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaAluno turma = new ListaAluno();
int rm;
double media;

        int resp=1;
        do{
            System.out.println("\t RM: ");
            rm = teclado.nextInt();
            System.out.println("\t Media: ");
            media = teclado.nextDouble();
            Aluno aluno = new Aluno(rm,media);
            turma.insere(aluno);
            turma.apresenta();
            System.out.println("Deseja cadastrar mais 1 aluno? (1-sim)");
            resp = teclado.nextInt();
        }while (resp==1);

        teclado.close();
    }
}
