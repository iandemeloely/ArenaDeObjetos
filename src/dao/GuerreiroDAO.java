package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Guerreiro;
import conexao.Conexao;

public class GuerreiroDAO {



    public void cadastrarguerreiro(Guerreiro gVO) {
        try {
            Connection con = Conexao.getConnection();
            // id nome olho cabelo pele sexo armamento planodefuga pontosdevida
            String sql = "insert into pessoa values " + "(null, ?, ?, ?, ?, ?, ?, null, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getNome());
            pst.setString(2, gVO.getOlho());
            pst.setString(3, gVO.getCabelo());
            pst.setString(4, gVO.getPele());
            pst.setBoolean(5, gVO.isSexo());
            pst.setString(6, gVO.getArmamento());
            pst.setInt(7, gVO.getPontosDeVida());
            pst.execute();
            System.out.println("Guerreiro cadastrado com sucesso ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Pessoa.\n" + e.getMessage());

        }
    }

    public ArrayList<Guerreiro> getGuerreiro() {
        ArrayList<Guerreiro> Guerreiro = new ArrayList<>();
        try {
            Connection con = Conexao.getConnection();
            String sql = "select * from pessoa " + "Where armamento is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Guerreiro g = new Guerreiro();
                g.setNome(rs.getString("nome"));
                g.setCabelo(rs.getString("cabelo"));
                g.setOlho(rs.getString("olho"));
                g.setPele(rs.getString("pele"));
                g.setSexo(rs.getBoolean("sexo"));
                g.setPontosDeVida(rs.getInt("pontosdevida"));
                Guerreiro.add(g);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar guerreiro.\n" + e.getMessage());
        }
        return Guerreiro;
    }

    public Guerreiro getGuerreirobyname(String name) {
        Guerreiro g = new Guerreiro();
        try {
            Connection con = Conexao.getConnection();
            String sql = "select * from pessoa where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                g.setId(rs.getInt("id"));
                g.setNome(rs.getString("nome"));
                g.setCabelo(rs.getString("cabelo"));
                g.setOlho(rs.getString("olho"));
                g.setPele(rs.getString("pele"));
                g.setSexo(rs.getBoolean("sexo"));
                g.setPontosDeVida(rs.getInt("pontosdevida"));
            }

        } catch (SQLException e) {
            System.out.println("ERRO ao buscar Guerreiro.\n" + e.getMessage());
        }

        return g;
    }

    public void atualizarGuerreiro(Guerreiro gVO) {
        try {
            Connection con = Conexao.getConnection();
            String sql = "update pessoa set cabelo = ? where id = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getCabelo());
            pst.setInt(2, gVO.getId());
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar vitima.\n" + e.getMessage());
        }
    }

    public boolean deletarGuerreriro(int id) {
        
        try{
            Connection con = Conexao.getConnection();
            String sql = "delete from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar guerreiro.\n" + e.getMessage());
        }
        
        return true;

    }

}



