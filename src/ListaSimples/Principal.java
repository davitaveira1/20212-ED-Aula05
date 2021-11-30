package ListaSimples;

public class Principal {
    
    public static void main(String[] args) {
        
        ListaSimples lista = new ListaSimples();
        
        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);
        
        //lista => VAZIA
        //lista.verificaSeListaVazia();
        lista.inserirNoFinalDaLista(no1);
        lista.inserirNoFinalDaLista(no2);
        
        
        lista.inserirNoInicio(no3);
        lista.imprimirLista();
        
        System.out.println("Nº de nós na lista: "+lista.contarNos());
    }
    
}
