package Model;

public class Ladrao extends Pessoa {
    private String planodefuga;

    public Ladrao() {

    }

    public Ladrao(String nome, String cabelo, String olho, String pele, boolean sexo, String planodefuga) {
        super(nome, cabelo, olho, pele, sexo);
        this.planodefuga = planodefuga;
    }

    public String getplanodefuga() {
        return planodefuga;
    }

    public void setplanodefuga(String panodefuga) {
        this.planodefuga = panodefuga;
    }

    public String fugir() {
        return "da no pé";
    }

    public String roubar() {
        return "Arrastão";
    }

    @Override
    public String toString() {
        return "Ladrao [getNome()=" + getNome() + ", getplanodefuga()=" + getplanodefuga() + ", getCabelo()="
                + getCabelo() + ", getOlho()=" + getOlho() + ", getPontosDeVida()=" + getPontosDeVida()
                + ", getClass()=" + getClass() + "]";
    }

}
