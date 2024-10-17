//Ana Laura Angelieri BP3038262 || Évelin Ferreira da Silva BP3039447
package Balsa;

public class Louca{
    private String elementos[];
    private int fim;

    Louca(int tamanho){
        elementos = new String[tamanho];
        fim = 0;
    }

    public boolean verificarCheia(){
        return elementos.length == fim;
    }

    public boolean verificarVazia(){
        return fim == 0;
    }

    public void adicionarNaPilha(String valor){
        if(verificarCheia()){
            System.out.println("Pilha está cheia!");
        } else {
            elementos[fim] = valor;
            fim++;
        }
    }

    public void removerDaPilha(){
        if(verificarVazia()){
            System.out.println("-1");
        } else {
            fim--;
        }
    }

    public void imprimir(){
        for(int i = 0; i < fim; i++){
            System.out.println(elementos[i]);
        }
    }

    public String retornarUltimo(){
        return elementos[fim];
    }
 
}