package Exercicios_Metodos1;

public class Main {
    public  static void main (String [] args) {

        //calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma (10, 6);
        Calculadora.subtracao (10, 6);
        Calculadora.multiplicacao (10, 6);
        Calculadora.divisao (10, 10);

        //Exercício Sobrecarga
        System.out.println("Exercicio quadrilatero");
        Quadrilatero_Sobrecarga.area(3);
        Quadrilatero_Sobrecarga.area(5,5);
        Quadrilatero_Sobrecarga.area(7,8,9);

    }


    }



