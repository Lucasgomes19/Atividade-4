import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a primeira nota:");
    double n1 = sc.nextDouble();
    System.out.print("Digite a segunda nota:");
    double n2 = sc.nextDouble();
    System.out.print("Digite a terceira nota:");
    double n3 = sc.nextDouble();
    System.out.print("Digite a quarta nota:");
    double n4 = sc.nextDouble();

    sc.close();

    Double media = (n1 + n2 + n3 + n4)/ 4;

    System.out.print("Sua media final é de " + media);
    }
    
}