import java.util.ArrayList;
import java.util.Scanner;

import Model.Guerreiro;
import Model.Ladrao;
import Model.Pessoa;
import servicos.ServicosFactory;
import servicos.VitimaServicos;

public class Arenadeobjetos {
    static Scanner ler = new Scanner(System.in);
    static int opMP;

    static ArrayList<Guerreiro> guerreiros = new ArrayList<>();
    static ArrayList<Ladrao> ladroes = new ArrayList<>();
    static ArrayList<Pessoa> vitimas = new ArrayList<>();

    public static int lerInt() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {// o que pode dar erro
            num = ler.nextInt();
        } catch (Exception e) {// tratar o erro
            System.out.print("Tente Novamente: ");
            lerInt();
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
        opMP = lerInt();

    }// fim do menu

    public static void subMenu(int omP) {
        System.out.println(".:Sub Menu:.");
        String subMenu;
        switch (omP) {
            case 1:
                System.out.println("1 - Guerreiro" + "\n2 - Ladrão" + "\n3 - Vitima" + "\nDigite opção");
                int opSM = lerInt();
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
                for (Ladrao l : ladroes) {
                    System.out.println("ladrão " + l.getNome());
                    System.out.println("Plano de fuga " + l.getplanodefuga());
                    System.out.println("pontos de vida " + l.getPontosDeVida());
                }
                for (Pessoa v : vitimas) {
                    System.out.println("vitima " + v.getNome());
                    System.out.println("cabelo " + v.getCabelo());
                    System.out.println("pele " + v.getPele());
                    System.out.println("olho " + v.getOlho());
                    System.out.println("pontos de vida " + v.getPontosDeVida());
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
                int sexoInt = lerInt();
                boolean sexo = false;
                if (sexoInt == 2) {
                    sexo = true;
                }
                g.setSexo(sexo);
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
                int sexoIntl = lerInt();
                boolean sexol = false;
                if (sexoIntl == 2) {
                    sexol = true;
                }
                l.setSexo(sexol);
                System.out.println("Qual e o seu plano de fuga ");
                l.setplanodefuga(ler.nextLine());

                break;
            case 3:
                System.out.println("Criar Vítima");
                Pessoa v = new Pessoa();
                System.out.print("Informe o nome da vítima ");
                v.setNome(ler.nextLine());
                System.out.print("Informe a cor do olho ");
                v.setOlho(ler.nextLine());
                System.out.print("Informe a cor do cabelo ");
                v.setCabelo(ler.nextLine());
                System.out.print("Informe a cor da pele ");
                v.setPele(ler.nextLine());
                System.out.print("Escolha o sexo\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntv = lerInt();
                boolean sexov = false;
                if (sexoIntv == 2) {
                    sexov = true;
                }
                v.setSexo(sexov);
                vitimas.add(v);
                VitimaServicos vs = ServicosFactory.getVitimaServicos();
                vs.cadastrarvitima(v);
                break;
            case 0:

            default:
                System.out.println("Opção invalida tente novamente");
                menuP();

        }

    }
}
