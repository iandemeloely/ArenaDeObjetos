import java.util.ArrayList;
import java.util.Scanner;

import Model.Guerreiro;
import Model.Ladrao;
import Model.Pessoa;

public class Arenadeobjetos {
    static Scanner ler = new Scanner(System.in);
    static int opMP;

    static ArrayList<Guerreiro> guerreiros = new ArrayList<>();
    static ArrayList<Ladrao> ladroes = new ArrayList<>();
    static ArrayList<Pessoa> vitimas = new ArrayList<>();

    public static int lerint() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {
            num = ler.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("tente novamente!");
            lerint();
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println(".:Arena De Obejetos:.");
        do {
            menuP();
            subMenu(opMP);
        } while (opMP != 0);
        {

        }

    }

    public static void menuP() {
        String menu = "1 - Criar Personagens: " + "\n2 - Listar personagens: " + "\n3 - Batalha: "
                + "\n0 - Sair do jogo: " + "\nDigite a opção: ";
        System.out.print(menu);
        opMP = lerint();

    }// fim do menu

    public static void subMenu(int omP) {
        System.out.println(".:Sub Menu:.");
        String subMenu;
        switch (omP) {
            case 1:
                System.out.println("1 - Guerreiro" + "\n2 - Ladrão" + "\n3 - Vitima" + "\nDigite opção");
                int opSM = lerint();
                criarpersona(opSM);

                break;
            case 2:
                System.out.println("lista de personagens");
                System.out.println(guerreiros.toString());
                System.out.println("Lista Bonita");
                for (Guerreiro g : guerreiros) {
                    System.out.println("Guerreiro " + g.getNome());
                    System.out.println("Armamento " + g.getArmamento());
                    System.out.println("pontos de vida " + g.getPontosDeVida());
                }
                break;
            case 3:
                break;
            case 0:
                System.out.println("Arena de Objetos encerrado pelo usuario");
                break;
            default:
                System.out.println("Opção invalida tente novamente");
                menuP();

        }
    }

    private static void criarpersona(int opSM) {

        switch (opSM) {
            case 1:
                System.out.println("Criar Guerrreiro");
                Guerreiro g = new Guerreiro();
                System.out.print("Informe o nome do Guerreiro ");
                g.setNome(ler.nextLine());
                System.out.print("Informe a cor do olho ");
                g.setOlho(ler.nextLine());
                System.out.print("Informe a cor do cabelo ");
                g.setCabelo(ler.nextLine());
                System.out.print("Informe a cor da pele ");
                g.setPele(ler.nextLine());
                System.out.print("Escolha o sexo\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoInt = lerint();
                boolean sexo = false;
                if (sexoInt == 2) {
                    sexo = true;
                }
                System.out.println("qual e o armamento do guerreiro ");
                g.setArmamento(ler.nextLine());
                guerreiros.add(g);
                break;
            case 2:
                System.out.println("Criar Ladrão");
                Ladrao l = new Ladrao();
                System.out.print("Informe o nome do ladrão ");
                l.setNome(ler.nextLine());
                System.out.print("Informe a cor do olho ");
                l.setOlho(ler.nextLine());
                System.out.print("Informe a cor do cabelo ");
                l.setCabelo(ler.nextLine());
                System.out.print("Informe a cor da pele ");
                l.setPele(ler.nextLine());
                System.out.print("Escolha o sexo\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntl = lerint();
                boolean sexol = false;
                if (sexoIntl == 2) {
                    sexol = true;
                }
                l.setSexo(sexol);
                System.out.println(" ");
                l.setplanodefuga(ler.nextLine());
                guerreiros.add(l);

                break;
            case 3:
                break;
            case 0:

            default:
                System.out.println("Opção invalida tente novamente");
                menuP();

        }

    }
}
