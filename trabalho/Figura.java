import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            // menu
            System.out.println("1 - Calcular a área de um quadrado");
            System.out.println("2 - Calcular a área de um triângulo");
            System.out.println("3 - Sair");
            menu = scanner.nextInt();// escaneia a linha e armazena na varável menu

            switch (menu) { // inicia o switch lendo valor do menu
                case 1:// para calcular área do quadrado

                    System.out.println("Digite o lado do quadrado: ");
                    float lado = scanner.nextFloat();// lê o lado do quadrado inserido pelo usuário
                    Quadrado quadrado = new Quadrado(); // cria um objeto quadrado
                    quadrado.setLado(lado); // set para atribuir o valor do lado ao objeto
                    quadrado.imprimir(); // chama a função imprimir
                    Quadrado contaq = new Quadrado();//novo objeto conta
                    contaq.setLado(lado);//atribui o valor lado ao objeto
                    contaq.contaQ();//chama a função contaQ
                    break;

                case 2:
                    // para calcular área do triângulo
                    System.out.println("Digite a base do triângulo: ");
                    float base = scanner.nextFloat();// lê o valor inserido pelo usuário
                    System.out.println("Digite a altura do triângulo: ");
                    float altura = scanner.nextFloat();// lê o valor inserido pelo usuário
                    Triangulo triangulo = new Triangulo();// cria um objeto triangulo
                    triangulo.setBase(base);// atribui o valor inserido pelo usuário
                    triangulo.setAltura(altura);// atribui o valor inserido pelo usuário
                    triangulo.imprimir();// chama a função imprimir
                    Triangulo conta = new Triangulo();//novo objeto
                    conta.setAltura(altura);// atribui valor inserido pelo usuário
                    conta.setBase(base);// atribui valor inserido pelo usuário
                    conta.contaT();// chama a função contaT
                    break;

                case 3:
                    // caso o usuário queira sair
                    System.out.println("Saindo...");
                    break;

                default:
                    // digitou outra opção
                    System.out.println("Opção inválida! Digite uma opção válida!");
            }
        } while (menu != 3);// se o menu receber um valor diferente de três a repetição continua.

    }
}
