package ListaSimples;

public class Principal {
    
    public static void main(String[] args) {
        
        ListaSimples lista = new ListaSimples();
        
        No no1 = new No(10);
        No no2 = new No(20);
        
        //lista => VAZIA
        //lista.verificaSeListaVazia();
        lista.inserirNoFinalDaLista(no1);
        lista.inserirNoFinalDaLista(no2);
        lista.imprimirLista();
    }
    
}
