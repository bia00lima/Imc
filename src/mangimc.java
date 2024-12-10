import java.util.Scanner;

public class mangimc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = 0.0, altura = 0.0, imc = 0.0;
        String resultado = " ", nome = " ";

        System.out.println("Programa para calcular o Imc");
        System.out.println("Digite o nome do paciente: ");
        nome= sc.nextLine();
        System.out.println("digite o peso do paciente: ");
        peso= sc.nextDouble();
        System.out.println("Digite a altura do paciente: ");
        altura= sc.nextDouble();



        imc= Imc1.calcularimc(peso,altura);
        resultado= Imc1.classificarimc(imc);
        System.out.printf("O paciente %s tem um imc = %.2f \n",nome);
        System.out.println("A classificaca do imc é: %s \n");


        sc.close();
    }
}
