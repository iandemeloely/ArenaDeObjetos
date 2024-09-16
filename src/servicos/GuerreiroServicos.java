package servicos;


    import java.util.ArrayList;

import Model.Guerreiro;
import dao.DAOfactory;
import dao.GuerreiroDAO;

public class GuerreiroServicos {
    GuerreiroDAO gDao = DAOfactory.geGuerreiroDAO();

    public void cadastrarguerreiro(Guerreiro gVO) {
        gDao.cadastrarguerreiro(gVO);

    }

    public ArrayList<Guerreiro> listaguerreiro() {
        return gDao.getGuerreiro();
    }

    public Guerreiro buscaguerreirobynome(String nome) {
        return gDao.getGuerreirobyname(nome);
    }

    public void atualizarguerreiro(Guerreiro gVO) {
        gDao.atualizarGuerreiro(gVO);
    }

    public boolean deletarguerreiro(int id) {
        return gDao.deletarGuerreriro(id);
    }

}



