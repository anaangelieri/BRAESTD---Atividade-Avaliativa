import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Louca pilha = new Louca(30);
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite uma opção: ");
            System.out.println(
                    "1 - Adicionar um prato\n2 - Adicionar um talher\n3 - Adicionar um copo\n0 - Um item foi lavado\n-1 - Acabou a água");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pilha.adicionarNaPilha(1);
                    System.out.println("Foi adicionado um prato na pilha");
                    break;
                case 2:
                    pilha.adicionarNaPilha(2);
                    System.out.println("Foi adicionado um talher na pilha");
                    break;
                case 3:
                    pilha.adicionarNaPilha(3);
                    System.out.println("Foi adicionado um copo na pilha");
                    break;
                case 0:
                    pilha.removerDaPilha();
                    break;
                case -1:
                    System.out.println("Acabou a água!!");
                    continuar = false;
                    pilha.imprimir();
                    break;
            }
        }
        scanner.close();
    }
}
