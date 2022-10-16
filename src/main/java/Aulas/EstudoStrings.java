package Aulas;

import java.util.Scanner;

public class EstudoStrings {
    public static void main (String[] args){
        //strings ~sao cadeias de caracteres
        //jose -> j=0. o=1, s=2, e=3
        String nome = "Pedro";

        if(nome == "Pedro") {
            System.out.println("São Iguais");
        }
        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")){ //aqui compara o conteudo de strings
            System.out.println("São Iguais");
        } else {
            System.out.println("são diferente");
        }
        //sobrenome.equalsIgnoreCase("pereira"); ignora maiusculo e minusculo
        // outros metodos
        String java = "java";
        String ja = java.substring(0, 2); //começa do 0 e vai até 2 mas ele ignora o 2
        String va = java.substring(2); // corta ate o final da sting

        System.out.println(ja);
        System.out.println(va);

        String m1 = "hello";
        String m2 = "world";
        String m3 = m1.concat(m2);
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se esta vazia
        System.out.println(java.toUpperCase()); //DEIXA EM CAIXA ALTA
        System.out.println(java.toLowerCase()); // caixa baixa
    }
        String data = "13/10/2002";
        String[] valores = data.split("/");


}
