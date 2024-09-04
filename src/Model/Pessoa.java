package Model;

public class Pessoa {
    private String nome;
    private String cabelo;
    private String olho;
    private boolean sexo;
    private int PontosDeVida = 100;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getOlho() {
        return olho;
    }

    public void setOlho(String olho) {
        this.olho = olho;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getPontosDeVida() {
        return PontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        PontosDeVida = pontosDeVida;

    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cabelo=" + cabelo + ", olho=" + olho + ", sexo=" + sexo + ", PontosDeVida="
                + PontosDeVida + "]";

    }

    public Pessoa() {
    }

    public Pessoa(String nome, String cabelo, String olho, boolean sexo) {
        this.nome = nome;
        this.cabelo = cabelo;
        this.olho = olho;
        this.sexo = sexo;
        
    }

}
