package Aulas;

import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();
        System.out.println(nome);

        System.out.println("qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("qual a sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("qual o seu peso? (kg)");
        double peso = entrada.nextDouble();

        //calcule i IMC = peso / altura^2

        double imc = peso / Math.pow(altura,2);


        System.out.println("olá meu nome é " + nome + " e tenho " + idade + " anos ");
        System.out.println("esse é seu IMC " + imc);
        System.out.printf("esse é o meu imc = %.2f\n", imc);
        System.out.printf("meu nome é %s e tenho %d anos!\n",nome,idade);

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if(imc > 17 && imc <= 18.49){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso Normal");
        }else if(imc >= 25 && imc <= 29.99){
            System.out.println("Acima do peso");
        }else if(imc >= 30 && imc <= 34.99){
            System.out.println("Obesidade I");
        }else if(imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II (Severa)");
        }else {
            System.out.println("Obesidade III(Mórbida");
        }

        //switch-case
        System.out.println("selecione uma dieta(1 a 3)");
        System.out.println("1 - água");
        System.out.println("1 - fruta");
        System.out.println("1 - batata");
        int dieta = entrada.nextInt();

        switch (dieta){
            case 1:
                System.out.println("vc escolheu a dieta da agua");
                break; //impedir a testar as condições abaixo
            case 2:
                System.out.println("vc escolheu a dieta da fruta");
                break;
            case 3:
                System.out.println("vc escolheu a dieta da batata");
                break;
            default:
                System.out.println("esta dieta não existe");
        }
        System.out.println("vc tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for(int i = 0; i <= totalAlimentos;i++){
            System.out.println(i);
        }
        int i = 0;
        while (i < totalAlimentos){
            System.out.println(i); i++;
        }
        System.out.println(i);
    }
}
