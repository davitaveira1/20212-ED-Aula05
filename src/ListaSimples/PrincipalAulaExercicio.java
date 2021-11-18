/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimples;

/**
 *
 * @author Davi
 */
public class PrincipalAulaExercicio {
    
    public static void main(String[] args) {
        
        No primeiro;
        No ultimo;
        
        primeiro = null;
        ultimo = null;
        
        No n1 = new No(10);
        No n2 = new No(20);
        
        n1.prox = n2;
        
        primeiro = n1;
        ultimo = n2;
        
        No aux;
        aux=primeiro;
        for(int i=0;i<2;i++){       
            
            System.out.println("Posição: "+i+" Valor: "+aux.valor);
            aux = aux.prox;
            
        }
        
        
        
    }
    
}
