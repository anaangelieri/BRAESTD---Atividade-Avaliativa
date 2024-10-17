//Ana Laura Angelieri BP3038262 || Évelin Ferreira da Silva BP3039447

package Balsa;

public class Balsa {
    private String elementos[];
    private int fim;
    private int inicio;

    Balsa(int tamanho){
        elementos = new String[tamanho];
        fim = 0;
        inicio = 0;
    }

    public boolean verificarCheia(){
        return elementos.length == fim;
    }

    public boolean verificarVazia(){
        return inicio == fim;
    }

    public void adicionarNaFila(String codigo){
        if(verificarCheia()){
            System.out.println("Fila Cheia!");
        } else {
            elementos[fim] = codigo;
            fim++;
        }
    }

    public void removerDaFila(){
        if(verificarVazia()){
            System.out.println("Fila Vazia");
        } else {
            inicio++;
        }
    }

    public void imprimir(){
        for (int i = inicio; i < fim; i++){
            System.out.println(elementos[i]);
        }
    }

    public String retornarPrimeiro(){
        return elementos[inicio];
    }
}
