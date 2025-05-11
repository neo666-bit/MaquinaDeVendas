import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Maquina {
    public Scanner scn = new Scanner(System.in);
    public ArrayList<String> salgados = new ArrayList<>();
    public ArrayList<String> refrigerantes = new ArrayList<>();
    public ArrayList<String> doces = new ArrayList<>();
    public ArrayList<Integer> quantRef = new ArrayList<>();
    public ArrayList<Integer> quantSal = new ArrayList<>();
    public ArrayList<Integer> quantDoc = new ArrayList<>();

    String path = "src/estoque.txt";




    public void armazenar() throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(path));
        System.out.println("Bem Vindo ao sistema de armazenamento!");
        System.out.println("O que deseja armazenar?");
        System.out.println("1- Salgados\n2- Bebidas\n3- Doces\n4-Sair");
        int opa = scn.nextInt();

        switch (opa) {
            case 1:
                System.out.println("Que Salgados você deseja armazenar?");
                System.out.println("Digite o nome do Salgado:");
                do {
                    salgados.add(scn.nextLine());
                } while (salgados.size() < 5);
                if (salgados.size() == 5) {
                    for (String salgado : salgados) {
                        System.out.println("Digite as quantidades de:" + salgado);
                        quantSal.add(scn.nextInt());
                    }
                }
                break;
            case 2:
                System.out.println("Que refrigerantes você deseja armazenar?");
                System.out.println("Digite o nome do Refrigerante:");
                do {
                    refrigerantes.add(scn.nextLine());
                } while (refrigerantes.size() < 5);
                if (refrigerantes.size() == 5) {
                    for (String refrigerante : refrigerantes) {
                        System.out.println("Digite as quantidades de:" + refrigerante);
                        quantRef.add(scn.nextInt());
                    }
                }
                break;
            case 3:
                System.out.println("Quais doces você deseja armazenar?");
                System.out.println("Digite o nome do doce:");
                do {
                    doces.add(scn.nextLine());
                } while (doces.size() < 5);

                if (doces.size() == 5) {
                    for (String doce : doces) {
                        System.out.println("Digite as quantidades de:" + doce);
                        quantDoc.add(scn.nextInt());
                    }
                }
                break;
        }
    }

    public void Consultar() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(path));
        while (true) {
            System.out.println("Bem Vindo ao Sistema de consulta");
            System.out.println("O que deseja consultar\n1- Salgados\n2- Refrigerantes\n3- Doces\n4- Sair ?");
            int opc = scn.nextInt();

            switch (opc) {
                case 1:
                    for (int i = 1; salgados.size() > i; i++) {
                        System.out.println("No estoque tem: " + quantSal.get(i) + " de " + salgados.get(i));
                    }
                    break;
                case 2:
                    for (int i = 1; refrigerantes.size() > i; i++) {
                        System.out.println("No estoque tem: " + quantRef.get(i) + " de " + refrigerantes.get(i));
                    }
                    break;
                case 3:
                    for (int i = 1; doces.size() > i; i++) {
                        System.out.println("No estoque tem: " + quantDoc.get(i) + " de " + doces.get(i));
                    }
                    break;
            }
            if (opc == 4) {
                break;
            }
        }
    }

    public void Vender() {
        int compra;
        int quantia;
        System.out.println("Bem Vindo ao sistema de vendas");
        System.out.println("O que deseja vender?\n1- Salgados\n2- Refrigerantes\n3- Doces\n4- Sair");
        int opv = scn.nextInt();

        switch (opv) {
            case 1:
                System.out.printf("Qual salgado deseja comprar?\n1- %s\n2- %s\n3- %s\n4- %s\n", salgados.get(1), salgados.get(2), salgados.get(3), salgados.get(4));
                compra = scn.nextInt();
                switch (compra) {
                    case 1:
                        System.out.println("Quantos " + salgados.get(1) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantSal.get(1)) {
                            System.out.println("Você comprou " + quantia + " de " + salgados.get(1));
                            quantSal.set(1, quantSal.get(1) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 2:
                        System.out.println("Quantos " + salgados.get(2) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantSal.get(2)) {
                            System.out.println("Você comprou " + quantia + " de " + salgados.get(2));
                            quantSal.set(2, quantSal.get(2) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 3:
                        System.out.println("Quantos " + salgados.get(3) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantSal.get(3)) {
                            System.out.println("Você comprou " + quantia + " de " + salgados.get(3));
                            quantSal.set(3, quantSal.get(3) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 4:
                        System.out.println("Quantos " + salgados.get(4) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantSal.get(4)) {
                            System.out.println("Você comprou " + quantia + " de " + salgados.get(4));
                            quantSal.set(4, quantSal.get(4) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                }
                break;

            case 2:
                System.out.printf("Qual refrigerante deseja comprar?\n1- %s\n2- %s\n3- %s\n4- %s\n", refrigerantes.get(1), refrigerantes.get(2), refrigerantes.get(3), refrigerantes.get(4));
                compra = scn.nextInt();
                switch (compra) {
                    case 1:
                        System.out.println("Quantos " + refrigerantes.get(1) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantRef.get(1)) {
                            System.out.println("Você comprou " + quantia + " de " + refrigerantes.get(1));
                            quantRef.set(1, quantRef.get(1) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 2:
                        System.out.println("Quantos " + refrigerantes.get(2) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantRef.get(2)) {
                            System.out.println("Você comprou " + quantia + " de " + refrigerantes.get(2));
                            quantRef.set(2, quantRef.get(2) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 3:
                        System.out.println("Quantos " + refrigerantes.get(3) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantRef.get(3)) {
                            System.out.println("Você comprou " + quantia + " de " + refrigerantes.get(3));
                            quantRef.set(3, quantRef.get(3) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 4:
                        System.out.println("Quantos " + refrigerantes.get(4) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantRef.get(4)) {
                            System.out.println("Você comprou " + quantia + " de " + refrigerantes.get(4));
                            quantRef.set(4, quantRef.get(4) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;


                }
                break;
            case 3:
                System.out.printf("Qual doce deseja comprar?\n1- %s\n2- %s\n3- %s\n4- %s\n", doces.get(1), doces.get(2), doces.get(3), doces.get(4));
                compra = scn.nextInt();
                switch (compra) {
                    case 1:
                        System.out.println("Quantos " + doces.get(1) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantDoc.get(1)) {
                            System.out.println("Você comprou " + quantia + " de " + doces.get(1));
                            quantDoc.set(1, quantDoc.get(1) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 2:
                        System.out.println("Quantos " + doces.get(2) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantDoc.get(2)) {
                            System.out.println("Você comprou " + quantia + " de " + doces.get(2));
                            quantDoc.set(2, quantDoc.get(2) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 3:
                        System.out.println("Quantos " + doces.get(3) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantDoc.get(3)) {
                            System.out.println("Você comprou " + quantia + " de " + doces.get(3));
                            quantDoc.set(3, quantDoc.get(3) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    case 4:
                        System.out.println("Quantos " + doces.get(4) + " você deseja comprar?");
                        quantia = scn.nextInt();
                        if (quantia <= quantDoc.get(4)) {
                            System.out.println("Você comprou " + quantia + " de " + doces.get(4));
                            quantDoc.set(4, quantDoc.get(4) - quantia);
                        } else {
                            System.out.println("Desculpe, não temos essa quantidade em estoque");
                        }
                        break;
                    }
            break;
        }
    }
}


