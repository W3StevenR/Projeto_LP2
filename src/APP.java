package Trab;

import java.util.ArrayList;
import java.util.Scanner;
public class APP {
    
            public static void main(String args[]) {

            Scanner entrada = new Scanner(System.in);
            int opcaoMenu1, comparadorMenu1=0;
            do{

                comparadorMenu1 = 0;
                System.out.println("######## CADASTRO DE INFORMAÇÕES ########");
                System.out.println("             PAÍS & ESTADO");
                
                System.out.println("1 --- Cadastrar um País");
                System.out.println("2 --- Cadastrar uma Região");
                System.out.println("3 --- Cadastrar um Estado");
                System.out.println("4 --- Carregar informações do Arquivo");
                System.out.println("5 --- Obter Informações de um Estado (pela SIGLA)");
                System.out.println("6 --- Obter Informações de uma Região");
                System.out.println("7 --- Obter Informações de um País\n\n");

                System.out.print("Digite a Opção desejada: ");
                opcaoMenu1 = entrada.nextInt();

                if(opcaoMenu1 > 7 || opcaoMenu1 < 1){
                    System.out.println("Opção Inválida, digite novamente");
                }else{
                    comparadorMenu1 = 1;
                }

            }while(comparadorMenu1 == 0);

            entrada.close();
        }
        
        public void cadastrarPais(){
            String nome, sigla, capital;
            Double area;
            int populacao;
            float PIB, IDH;
            ArrayList<Região> regioes;
            

            System.out.println("DIGITE AS INFORMAÇÕES DO PAÍS");

        }
    
}
