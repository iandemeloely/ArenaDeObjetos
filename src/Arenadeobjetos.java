import java.util.Scanner;

public class Arenadeobjetos {
    static Scanner ler = new Scanner(System.in);

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

            /*String texto;
            int num;
            System.out.println("digite o nome ");
            texto = ler.nextLine();
            System.out.println("Informe a idade ");
            num = lerint();*/
        }

        public static void menuP(){
            String menu = "1 - Criar Persnagens: " + "\n2 - Listar personagens: " + "/n3 Batalha: " + "\n0 - Sair do jogo: " + "\nDigite a opção: ";
            System.out.print(menu);

        }//fim do menu

        public static void subMenu(int omP){
            String subMenu;
            switch (omP) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0 :
                    break;
            }
        }
        }




        



