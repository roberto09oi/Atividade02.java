import java.util.Scanner;

public class VerificaçãoDeNúmeroPositivoNegativoOuZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;

        System.out.println("digite um número para a verificação: ");
        numero = sc.nextDouble();

        if (numero >0){
            System.out.println("esse número é positivo");
        }
        else if (numero <0){
            System.out.println("esse número é negativo");
        }
        else {
            System.out.println(" zero");
        }

    }

}
