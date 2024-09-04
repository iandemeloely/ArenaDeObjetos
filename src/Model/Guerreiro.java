package Model;

public class Guerreiro {

    public class guerreiro extends Pessoa{
        private String armamento;

        public guerreiro() {
        
        }

        public guerreiro(String nome, String cabelo, String olho, boolean sexo, String armamento) {
            super(nome, cabelo, olho, sexo);
            this.armamento = armamento;


        }

        public String getArmamento() {
            return armamento;
        }

        public void setArmamento(String armamento) {
            this.armamento = armamento;
        }

        public void atacar(){
            this.dano(10);
        }
        

        
    }

}
