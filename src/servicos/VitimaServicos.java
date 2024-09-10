package servicos;

import Model.Pessoa;
import dao.DAOfactory;
import dao.VitimaDAO;

public class VitimaServicos {

    public void cadastrarvitima(Pessoa vVO) {
        VitimaDAO vDao = DAOfactory.geVitimaDAO();
        vDao.cadastrarvitima(vVO);

    }

}
