
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Maquina maquina = new Maquina();
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("Olá, Seja Bem Vindo à MiniVenda JAVA");

            System.out.println("O que deseja fazer?\n1- Estocagem\n2- Consultar\n3- Vender\n4- Sair");
            int op = scn.nextInt();
            switch(op){
                case 1:
                    maquina.armazenar();
                    break;
                case 2:
                    maquina.Consultar();
                    break;
                case 3:
                    maquina.Vender();
                    break;
            }
            if(op == 4){
                break;
            }
        }

    }

}