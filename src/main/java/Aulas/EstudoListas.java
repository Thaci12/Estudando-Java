package Aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main (String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        //adicionando elemtnos no array
        numeros.add(10); //equivalente ao push noJS
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2)); //pegar o array na posição 2

        //numeros[0] = 500
        numeros.set(0, 500);
        System.out.println(numeros);

        //remover um elemnto do array
        numeros.remove(0);
        System.out.println(numeros);
        // colocar na posição que eu quero
        numeros.add(1, 200);
        System.out.println(numeros);
        numeros.add(3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size()); //array.lenght

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        for(int numero : numeros){ //para cada valor dentro do array ele executa o cód
            System.out.println(numero);
        }
        System.out.println(numeros.contains(500)); // contians=contém true=achou false=não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição, caso tenha no array
        System.out.println(numeros.indexOf(300)); // não dá erro, ele colocar -1, não achou o elemnto
        System.out.println(numeros.indexOf(200)); // mostra o array da priemira posição
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado
    }

}
