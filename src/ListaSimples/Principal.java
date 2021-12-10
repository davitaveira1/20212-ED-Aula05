package ListaSimples;

public class Principal {
    
    public static void main(String[] args) {
        
        ListaSimples lista = new ListaSimples();
        
        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);
        No no4 = new No(40);
        No no5 = new No(50);
        
        //lista => VAZIA
        //lista.verificaSeListaVazia();
        
        lista.inserirNoFinalDaLista(no1);
        lista.inserirNoFinalDaLista(no2);
        lista.inserirNoFinalDaLista(no3);
        lista.inserirNoFinalDaLista(no4);
        
        
        lista.inserirNaPosicao(5, no5);
        lista.imprimirLista();
        

    }
    
}
