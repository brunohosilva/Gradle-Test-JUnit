package app;

import model.CalcAluguel;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        CalcAluguel aluguel = new CalcAluguel();
        Scanner myObj = new Scanner(System.in);
        float nominal;
        int day;

        // Enter nominal_value
        System.out.println("Digite o valor nominal");
        nominal = myObj.nextFloat();

        // Enter how many days
        System.out.println("Digite a quantidade de dias");
        day = myObj.nextInt();

        float result = aluguel.Calc(nominal, day);
        System.out.println("Bruno Henique de Oliveira Silva ---Consumindo api -->  "+result);
    }
}