import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declarei as variáveis utilizadas
        Scanner input = new Scanner(System.in);
        int sair = 3;
        int vendedor = 123456;
        //Criei a matriz
        String[][] filmes = new String[5][3];
        for (int i = 0;i<5;i++){
            for (int j = 0;j<3;j++){
                filmes[i][j] = " ";
            }
        }
        //Poderá escolher entre 3 filmes de ''escolha de assentos''
        String str = "filmes = [3]  ";
        String nomeFilmeLista = "";

        //UM POSSÍVEL VETOR PARA USAR DEPOIS

        /*System.out.println("Informe o filme desejado" +
                "1. Vingadores" +
                "2. Shazam" +
                "3. Thor");
        int numfilme = input.nextInt();

        int assentos = input.nextInt();
        filmes[numfilme][assentos] = "x";
        //System.out.println(filmes);
        for (int i = 0;i<3;i++){
            for (int j = 0;j<5;j++){
                System.out.println(filmes[i][j]);
            }
        }*/
        //assentos = 4;
        //boolean temEssefilme = nomeFilmeLista.equals(nomeFilme);
        //for (int i = 0; i < 1; i++) {

        //}
        //int i = filmes.length;
        //i++;
        //System.out.println(i);
        //nomeFilmeLista = filmes[i];
        // if = i temEsseFilme;
/*
        switch(numfilme){
            case 1:
                filme1[assentos]=
                System.out.println(filme1[]);
                break;
            case 2:
                break;
            case 3:
                break;
        }

        //vetor
        /*public static void filmes ()
        {
            Scanner input = new Scanner(System.in);
            int[] coluna;
            String[] linha;
            System.out.println("Digite o filme desejado");
            linha = input.next();
            System.out.println("Digite o acento");
            coluna = input.nextInt();
            */

            //Vendedor deve colocar o seu código psra poder efetuar a venda para o usuário
            int vendedor1;
            System.out.println("Insira o código do vendedor");
            vendedor1 = input.nextInt();
            if (vendedor == vendedor1) {
                //Menu com as opções de filmes
                while (sair == 3) {
                    System.out.println("(1) - Vendas");
                    System.out.println("(2) - Verificar lugares disponíveis");
                    System.out.println("(3) - Sair");
                    int menu = input.nextInt();

                    //Caso a opção seja 1 - será a venda dos ingressos
                   if (menu == 1) {
                       System.out.println("Informe o filme desejado" +
                               "0. Vingadores" +
                               "1. Shazam" +
                               "2. Thor");

                       //Escolha do assento em relação ao filme
                       int numfilme = input.nextInt();
                       System.out.println("Escolha o número do assento!!!!!");
                       int assentos = input.nextInt();
                       filmes[assentos - 1][numfilme] = "x";

                   }

                    //Caso for a opção 2 - irá verificar os lugares disponíveis, mostrando qual já está ''comprado''
                   else if (menu == 2){

                       //Aqui foi em relação a marcar o lugar, mas achei melhor formatar embaixo
                       /*for (int i = 0;i<3;i++) {
                           for (int j = 0; j < 5; j++) {
                               System.out.println(filmes[i][j]);
                           }
                       }*/

                       //Aqui foi usado uma CLASS STRING FORMAT para formatar a matriz para que a visualização fique melhor
                       String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                       System.out.format(format, "Vingadores", "Shazam", "Thor");
                       for (int i = 0; i < 5; i++){
                           //for(int j = 0; j < 5; j++){
                               System.out.format(format, filmes[i][0],filmes[i][1],filmes[i][2]);

                           //}
                       }



                    //Na escolha da opção 3 - ele irá terminar o código
                   }

                   else if (menu == 3){
                       break;
                   }


                }
            }
        input.close();

    }
}

