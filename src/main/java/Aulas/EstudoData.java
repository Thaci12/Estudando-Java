package Aulas;

import java.time.LocalDate;

public class EstudoData {
    public static void main(String[] args) {
        // dia - mes - ano
        //localdate armazena qualquer data
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); //verifica se a data é depois do natal
        System.out.println(hoje.isBefore(natal)); // verifica se data é antes do natal
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        int diasparaonatal = natal.getDayOfYear() - hoje.getDayOfYear();
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.println("faltam " + diasparaonatal + "dias p/ o natal");System.out.println(hoje.getDayOfYear()-natal);
    }




}
