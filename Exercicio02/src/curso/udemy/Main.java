package curso.udemy;

import entidades.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Desconto: ");
        empregado.desconto = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + empregado);

        System.out.println();
        System.out.println("Qual a porcentagem de aumento salárial?");
        double porcentagem = sc.nextDouble();
        empregado.salarioLiquido(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + empregado);







        sc.close();

    }
}
