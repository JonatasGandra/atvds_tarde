import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        int menu;
        do{
            System.out.println("1 - calcular a área de um quadrado \n 2 - calcular a área de um triângulo \n 3 - sair");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    int Lado = scanner.nextInt();
                    System.out.println("A área do quadrado é: " + quadrado.calcularArea(Lado));
                    
                    break;
            case 2:
                   
                default:
        
                    break;
            }
        }

    }
}
