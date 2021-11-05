package ListaSimples;

public class ListaSimples {
    
    No primeiro, ultimo;

    public ListaSimples() {
        primeiro = ultimo = null;
    }
    
    public void verificaSeListaVazia(){
        if(primeiro == null)
            System.out.println("Lista está vazia!");
        else
            System.out.println("Lista não está vazia!");
    }
    
    public void inserirNoFinalDaLista(No novoNo){
        
        //lista vazia
        if(primeiro == null){  
            
            primeiro = novoNo;
            ultimo = novoNo;
            
        }else{
            
            ultimo.prox = novoNo;
            ultimo = novoNo;
            
        }
        
    }
    
        public void imprimirLista(){
        
        No aux=primeiro;
        int cont=0;
        
        while(aux != null){
            
            System.out.println("Posição: "+cont+" Valor: "+aux.valor);
            aux = aux.prox;
            cont++;
        }
        
    }
    
    
    
    
}
