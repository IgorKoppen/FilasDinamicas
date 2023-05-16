package listaEncadeadaOrdenada;

public class ListaOrdenada {
    private class NO {
        int dado;
        NO prox;

    }
    private NO lista = null;

    public boolean isEmpty() {
        if (lista == null) {
            return true;
        }
        return false;
    }

    public void insere(int elem) {
        NO novo = new NO();
        novo.dado = elem;

        if (isEmpty()) {
            novo.prox = null;
            lista = novo;
        } else {
            if (novo.dado < lista.dado) {
                novo.prox = lista;
                lista = novo;
            } else {
                NO aux = lista;
                boolean achou = false;
                while (aux.prox != null && !achou) {
                    if (aux.prox.dado < novo.dado) {
                        aux = aux.prox;
                    } else achou = true;
                }
                novo.prox = aux.prox;
                aux.prox = novo;

            }
        }
    }
    public boolean remove(int elem){
        boolean achou = false;
            if(lista.dado == elem){
                achou = true;
                lista = lista.prox;
            }else{

                NO aux = lista;
                while(aux.prox != null && !achou){
                    if(aux.prox.dado != elem){
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
public void apresentaMaiores(int limite){
        NO aux = lista;
    System.out.println("Valores maiores do que "+ limite + ": ");
        while(aux!=null){
            if(aux.dado > limite){
                System.out.println("\t" + aux.dado);
            }
            aux = aux.prox;
        }

    System.out.println();
}
public void apresenta(){
        NO aux = lista;
    System.out.println("Lista:");
        while(aux!=null){
            System.out.println("\t "+ aux.dado);
            aux = aux.prox;
        }
    System.out.println(contaNos());
}

}
