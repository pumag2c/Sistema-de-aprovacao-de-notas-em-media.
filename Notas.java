import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Qual a sua matricula?");
        int matricula = scanner.nextInt();

        System.out.println ("Qual foi a sua nota 1?");
        double nota1 = scanner.nextDouble();

        System.out.println ("Qual foi a sua nota 2?");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println ("Aluno aprovado com média: " + media);
        } else if (media >= 5) {
            System.out.println ("Aluno em recuperação com média: " + media);
        } else {
            System.out.println ("Aluno reprovado com média: " + media);
        }

        scanner.close();

        



    }

}
  

  