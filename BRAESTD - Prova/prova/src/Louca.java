//Ana Laura Angelieri BP3038262 || Évelin Ferreira da Silva BP3039447

public class Louca{
    private int elementos[];
    private int fim;

    Louca(int tamanho){
        elementos = new int[tamanho];
        fim = 0;
    }

    public boolean verificarCheia(){
        return elementos.length == fim;
    }

    public boolean verificarVazia(){
        return fim == 0;
    }

    public void adicionarNaPilha(int valor){
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
 
}