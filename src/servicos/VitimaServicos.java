package servicos;

import java.util.ArrayList;

import Model.Pessoa;
import dao.DAOfactory;
import dao.VitimaDAO;

public class VitimaServicos {
    VitimaDAO vDao = DAOfactory.geVitimaDAO();

    public void cadastrarvitima(Pessoa vVO) {
        vDao.cadastrarvitima(vVO);

    }

    public ArrayList<Pessoa> listaVitimas() {
        return vDao.getVitimas();
    }

    public Pessoa buscaVitimabynome(String nome) {
        return vDao.getVitimabyname(nome);
    }

}
