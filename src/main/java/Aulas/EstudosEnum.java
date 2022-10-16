package Aulas;//enum são estruturas com constantes definidas
//dias da semana, meses do ano, turnos, estações
// NIVEIS (juniors, pleno senior / feriados nacionais / naipes

public class EstudosEnum {
    public static void main(String[] args){
        enum DiadaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiadaSemana hoje = DiadaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev {junior, pleno, senior}
        NivelDev nivel = NivelDev.pleno;

        switch (nivel) {
            case junior:
            System.out.println("Seu nivel é Junior");
            break;
            case pleno:
                System.out.println("Seu nivel é Pleno");
                break;
            case senior:
                System.out.println("Seu nivel é Senior");
                break;
            // VERSÃO ENHANCED
        }
    }
}
