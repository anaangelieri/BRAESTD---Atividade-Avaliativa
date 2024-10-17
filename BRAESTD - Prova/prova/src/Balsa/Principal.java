// package Balsa;

// import java.util.Scanner;

// public class Principal{
//     public static void main(String[] args) {
//         Balsa fila = new Balsa(15);
//         Scanner scanner = new Scanner(System.in);
//         boolean continuar = true;
//         int codigo;

//         while (continuar) {
//             System.out.println("Digite uma opção: ");
//             System.out.println(
//                     "1 - Adicionar carro\n2 - Imprimir os códigos dos carros\n3 - Retirar um carro\n0 - Sair");
//             int opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     System.out.println("Digite o código do carro: ");
//                     codigo = scanner.nextInt();
//                     fila.adicionarNaFila(codigo);
//                     break;
//                 case 2:
//                     System.out.println("Imprimindo a fila: ");
//                     fila.imprimir();
//                     break;
//                 case 3:
//                     System.out.println("Retirando um carro...");
//                     fila.removerDaFila();
//                     break;
//                 case 0:
//                     continuar = false;
//                     break;
//             }
//         }
//         scanner.close();
//     }
// }