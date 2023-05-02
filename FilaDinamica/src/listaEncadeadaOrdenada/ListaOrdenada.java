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
public void apresenta(){
        NO aux = lista;
    System.out.println("Lista:");
        while(aux!=null){
            System.out.println("\t "+ aux.dado);
            aux = aux.prox;
        }

}

}
