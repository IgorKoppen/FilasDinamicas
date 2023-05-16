package listaEncadeadaOrdenada;

import entidade.Aluno;

public class ListaAluno {

        private class NO {
            Aluno dado;
            NO prox;

        }
        private NO lista = null;

        public boolean isEmpty() {
            if (lista == null) {
                return true;
            }
            return false;
        }

        public void insere(Aluno elem) {
            NO novo = new NO();
            novo.dado = elem;

            if (isEmpty()) {
                novo.prox = null;
                lista = novo;
            } else {
                if (novo.dado.getRm() < lista.dado.getRm()) {
                    novo.prox = lista;
                    lista = novo;
                } else {
                    NO aux = lista;
                    boolean achou = false;
                    while (aux.prox != null && !achou) {
                        if (aux.prox.dado.getRm() < novo.dado.getRm()) {
                            aux = aux.prox;
                        } else achou = true;
                    }
                    novo.prox = aux.prox;
                    aux.prox = novo;

                }
            }
        }
        public boolean remove(int rm){
            boolean achou = false;
            if(lista.dado.getRm() == rm){
                achou = true;
                lista = lista.prox;
            }else{

                NO aux = lista;
                while(aux.prox != null && !achou){
                    if(aux.prox.dado.getRm() != rm){
                        aux = aux.prox;
                    }else{
                        achou = true;
                        aux.prox = aux.prox.prox;
                    }
                }
            }
            return achou;

        }
        public int contaNos(){
            int count = 0;
           NO aux = lista;
            while(aux!=null){
                count++;
                aux = aux.prox;
            }
            return count;
        }

        public void apresenta(){
          NO aux = lista;
            System.out.println("Lista:");
            while(aux!=null){
                System.out.println("\t "+ aux.dado.toString());
                aux = aux.prox;
            }
            System.out.println(contaNos());
        }

    }


