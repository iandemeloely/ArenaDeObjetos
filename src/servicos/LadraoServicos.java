package servicos;

import java.util.ArrayList;

import Model.Ladrao;
import dao.DAOfactory;
import dao.LadraoDAO;


public class LadraoServicos {


    LadraoDAO lDao = DAOfactory.geLadrDao();

    public void cadastrarLadrao(Ladrao lVO) {
        lDao.cadastrarLadrao(lVO);

    }

    public ArrayList<Ladrao> listaVitimas() {
        return lDao.getLadraos();
    }

    public Ladrao buscaLadraobynome(String nome) {
        return lDao.getLadraobyname(nome);
    }

    public void atualizarLadrao(Ladrao lVO) {
        lDao.atualizarLadrao(lVO);
    }

    public boolean deletarLadrao(int id) {
        return lDao.deletarLadrao(id);
    }

}


