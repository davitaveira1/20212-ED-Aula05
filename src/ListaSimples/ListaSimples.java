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
    
    public void inserirNoInicio(No novoNo){
        
        //verifica se lista está vazia
        if(primeiro==null){
            primeiro = novoNo;
            ultimo = novoNo;
        }else{
            
            novoNo.prox = primeiro;
            primeiro = novoNo;
            
        }
        
    }
    
    public int contarNos(){
        
        No aux=primeiro;
        int cont=0;
        
        while(aux != null){
            aux = aux.prox;
            cont++;
        }
        
        return cont;
        
    }
    
    public void inserirNaPosicao(int posicao,No novoNo){
        //lista vazia
        if(primeiro==null){
            inserirNoInicio(novoNo);
        }else{
            
            if(posicao <= 1){
                inserirNoInicio(novoNo);
            }else{
                //lista possui 1 ou + nós
                //posicao > 1
               
               if(posicao<=contarNos()){
                   //inserir no meio
                   
                   
                   
               }else{
                   //lista possui 1 ou + nós
                   //posicao > nº de nós
                   inserirNoFinalDaLista(novoNo);
               }
                
                
                
                
                
            }
            
            
            
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
