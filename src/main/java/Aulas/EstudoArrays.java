package Aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
        int [] numeros = {1,2,3,4,5};
        System.out.println(numeros.length);
        numeros[3]=1000;
        System.out.println(numeros[3]);

        for(int i = 0; i < numeros.length; i++); {
        System.out.println("a posição" + i + "com valor de"+numeros[i]);
        }
        int[] numeros2 = new int[50];  //0.49
        numeros2[0] =500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"jose almir", "renato pereira","victor icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int quant = entrada.nextInt();
        boolean[] valores = new boolean[quant];

        //exemplo
        System.out.println("digite o total de notas: ");
        int totalNotas = entrada.nextInt(); //5
        double[] notasProva = new double[totalNotas]; // ...4

        double soma = 0.0;
        for(double nota : notasProva){
            soma += nota;

        }
        double media = soma / notasProva.length;

        //condição tenária
        String mensagem = (media <7) ? "voce esta reprovado" : "aprovado";
        System.out.println(mensagem);

        //default values
        int numero; //padrão = 0
        double nota2; //padrao = 0.0
        boolean teste; // padrao = false
        String nome; // null - ausencia de objeto na variavel

        //wrapper classes
        Integer num2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;
    }
}
