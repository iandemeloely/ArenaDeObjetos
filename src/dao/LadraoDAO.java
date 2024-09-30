package dao;
    
    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Ladrao;
import conexao.Conexao;
    
    public class LadraoDAO {
    
        public void cadastrarLadrao(Ladrao lVO) {
            try {
                Connection con = Conexao.getConnection();
                // id nome olho cabelo pele sexo armamento planodefuga pontosdevida
                String sql = "insert into pessoa values" + "(null, ?, ?, ?, ?, ?, null, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, lVO.getNome());
                pst.setString(2, lVO.getOlho());
                pst.setString(3, lVO.getCabelo());
                pst.setString(4, lVO.getPele());
                pst.setBoolean(5, lVO.isSexo());
                pst.setInt(6, lVO.getPontosDeVida());
                pst.execute();
                System.out.println("Ladrao cadastrado com sucesso ");
            } catch (SQLException e) {
                System.out.println("Erro ao cadastrar Ladrão.\n" + e.getMessage());
    
            }
        }
    
        public ArrayList<Ladrao> getLadraos() {
            ArrayList<Ladrao> Ladraos = new ArrayList<>();
            try {
                Connection con = Conexao.getConnection();
                String sql = "select * from pessoa " + "Where planodefuga is not null";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
    
                while (rs.next()) {
                    Ladrao l = new Ladrao();
                    l.setNome(rs.getString("nome"));
                    l.setCabelo(rs.getString("cabelo"));
                    l.setOlho(rs.getString("olho"));
                    l.setPele(rs.getString("pele"));
                    l.setSexo(rs.getBoolean("sexo"));
                    l.setPontosDeVida(rs.getInt("pontos de vida"));
                    Ladraos.add(l);
                }
    
            } catch (SQLException e) {
                System.out.println("Erro ao listar Ladrao.\n" + e.getMessage());
            }
            return Ladraos;
        }
    
        public Ladrao getLadraobyname(String name) {
            Ladrao l = new Ladrao();
            try {
                Connection con = Conexao.getConnection();
                String sql = "select * from Ladrao where nome like ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, name);
                ResultSet rs = pst.executeQuery();
    
                while (rs.next()) {
    
                    l.setId(rs.getInt("id"));
                    l.setNome(rs.getString("nome"));
                    l.setCabelo(rs.getString("cabelo"));
                    l.setOlho(rs.getString("olho"));
                    l.setPele(rs.getString("pele"));
                    l.setSexo(rs.getBoolean("sexo"));
                    l.setPontosDeVida(rs.getInt("pontosdevida"));
                }
    
            } catch (SQLException e) {
                System.out.println("ERRO ao buscar Ladrao.\n" + e.getMessage());
            }
    
            return l;
        }
    
        public void atualizarLadrao(Ladrao lVO) {
            try {
                Connection con = Conexao.getConnection();
                String sql = "update Ladrao set cabelo = ? where id = ? ";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, lVO.getCabelo());
                pst.setInt(2, lVO.getId());
                pst.executeUpdate();
    
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar Ladrao.\n" + e.getMessage());
            }
        }
    
        public boolean deletarLadrao(int id) {
            
            try{
                Connection con = Conexao.getConnection();
                String sql = "delete from pessoa where id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                return pst.executeUpdate() != 0;
                
            }catch (SQLException e) {
                System.out.println("Erro ao deletar Ladrao.\n" + e.getMessage());
            }
            
            return true;
    
        }
    
    }




