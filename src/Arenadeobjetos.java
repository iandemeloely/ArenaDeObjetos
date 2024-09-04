import Model.Pessoa;

public class Arenadeobjetos {

    public static void main(String[] args) {
        
        Pessoa vitima = new Pessoa("Vitima1", "castanho", "castanho", true);
        System.out.println("vitima:\n" + vitima.toString());
        System.out.println("Perdeu 25 pontos de vida");
        int pontosatuais = vitima.getPontosDeVida();
        vitima.setPontosDeVida(pontosatuais - 25);
        System.out.println("vitima:\n" + vitima.toString());

        

        
    }

}
