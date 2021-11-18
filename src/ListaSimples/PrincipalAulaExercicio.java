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
        
        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);
        
        No primeiroNo = null;
        No ultimoNo = null;
        
        primeiroNo = no1;
        ultimoNo = no3;
        
        //encadear a lista
        no1.prox = no2;
        no2.prox = no3;
        

        
        //inserir no fim da lista
        No no4 = new No(40);
        
        ultimoNo.prox = no4;
        ultimoNo = no4;
        
    
        
        //inserindo no início da lista
        No no5 = new No(50);
        
        no5.prox = primeiroNo;
        primeiroNo = no5;
        
        //imprimindo os valores dos nós
        No aux;
        aux = primeiroNo;
        
        while(aux != null){
            System.out.println("Valor: "+aux.valor);
            aux = aux.prox;
        }        
        
        
        
    }
    
}
