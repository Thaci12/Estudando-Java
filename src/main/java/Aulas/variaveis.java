package Aulas;

public class variaveis {
    //execução do nosso programa JAVA
    public static void main(String[]args){
        System.out.println("hello"); //equivale ao console.log

        //Aulas.variaveis no JAVA
        //fortemente tipado e estaticamente tipado
        int idade = 20; //int = num inteiro (limite ate 2bilhoes)
        double salario = 4500.99; //num quebrado double=dupla precisão
        float nota = 7.5f; //sufixo para float
        long popdaterra = 7_900_000_000l;
        boolean tarefaconcluida = false; //true e false
        int i = 1, j =0, k=1000;//multiplas Aulas.variaveis
        String nomecompleto ="thaci lima"; //sempre aspas duplas

        int teste = 10;
        teste = 9; //retribuição de Aulas.variaveis
         final int teste2 = 200; // impossivel mudar o valor
        //teste2 = 1000;

        //operadores
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        System.out.println("o resultado da soma é " + soma);

        int sete = 7;
        int dois = 2;
        System.out.println(sete/dois);

        //math
        double x = Math.sqrt(144); // raiz quadrada
        double y = Math.pow(5,2); // potencia
        System.out.println(Math.PI);
        // CASTING
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        // operadores relacionais
        boolean teste1 = 5>1; //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5==5; //true
        boolean teste5 = 5!=1; //true
        boolean teste6 = 6>=6; //true
        boolean teste7 = 5<=9; // true

        //operadores lógicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; //true
        boolean teste10 = (5>10) && (10 <5); //false
        boolean teste11 = (10 >=0)|| (1<5); //true
        boolean teste12 = (5 >1); //true
        boolean teste13 = !teste12; //false //! simbolo inverte o valor
    }
}
