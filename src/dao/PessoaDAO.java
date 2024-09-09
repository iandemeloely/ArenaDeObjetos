package dao;

import java.sql.Connection;

import Model.Pessoa;
import conexao.Conexao;

public class PessoaDAO {

    public void cadastrarpessoa(Pessoa pVO){
        try{
            Connection  con = Conexao.getConexao();
            //id	nome	olho	cabelo	pele	sexo	armamento	planodefuga	pontosdevida
            String sql = "insert into pessoa values" + "(null, ?, ?, ?, ?, ?, ?, ?, ?, ?,)";
            PreparedSratemant pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
        }catch (SQLException e){

        }
    }

}
