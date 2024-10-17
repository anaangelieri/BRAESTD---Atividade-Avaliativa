package Balsa;

public class Main {
    public static void main(String[] args) {
        Louca pilha = new Louca(10);
        Balsa fila = new Balsa(10);

        pilha.adicionarNaPilha("A");
        pilha.adicionarNaPilha("B");
        pilha.adicionarNaPilha("C");
        fila.adicionarNaFila(pilha.retornarUltimo());
        fila.adicionarNaFila(pilha.retornarUltimo());
        fila.adicionarNaFila("D");
        pilha.adicionarNaPilha(fila.retornarPrimeiro());
        // fila.removerDaFila();
        fila.adicionarNaFila(fila.retornarPrimeiro());
        // fila.removerDaFila();
        fila.adicionarNaFila(pilha.retornarUltimo());
        pilha.adicionarNaPilha("E");
        fila.adicionarNaFila("E");
        pilha.removerDaPilha();

        System.out.println("Imprimindo pilha: ");
        pilha.imprimir();
        System.out.println("Imprimir fila: ");
        fila.imprimir();
    }
    
}
