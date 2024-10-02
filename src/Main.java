import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] taffismo = new String[0];
        String [] PatinhoBranco = new String[0];
        String [] LucasFc = new String[0];
        String [] SportRedesFc = new String[0];
        int quantidadeDeVotantes = 0;
        Scanner entrada = new Scanner(System.in);
        int time1 = 0;
        int time2 = 0;
        int time3 = 0;
        int time4 = 0;

        System.out.println("Quantidade de votantes : ");
        quantidadeDeVotantes = entrada.nextInt();

        System.out.println("Quantidade de votantes : " + quantidadeDeVotantes);
        System.out.println("Escolha seu time :");


        System.out.println("1- Taffismo Club , vote 80" +
                           "     2- Patinho Branquinho, vote 70" +
                           "     3- Lucas FC, vote 60" +
                           "     4- Sport Redes FC, vote 50");

        System.out.println("Digite o número do seu time : ");

        while (time1 != 80){
            time1 = time1 + 1;
        }while (time2 != 70){
            time2 = time2 + 1;
        }while (time3 != 60){
            time3 = time3 + 1;
        }while (time4 != 50){
            time4 = time4 + 1;
        }


        System.out.println("Os resultados foram : " + time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);

    }
}