package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeDao {
    Connection conexao;
    PreparedStatement ps;
    ResultSet rs;
    public EspecialidadeDao(){
        conexao = new ConexaoBD().getConexao();
    }
    // retornar todos as especialidade
    public List<Especialidade> get(){
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade";
        try{
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidade registro = new Especialidade();
                registro.setId(rs.getLong("id"));
                registro.setNome(rs.getString("Nome"));
                registros.add(registro);
            }
        }catch(SQLException e){
            e.printStackTrace();

        }
        return registros;
    }
    //Retornar um ojeto do tipo especialidade
    public Especialidade get(Long id){
        Especialidade registro = new Especialidade();
        String sql = "SELECT * FROM especialidade WHERE id = ?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, id);
            rs=ps.executeQuery();
            if (rs.next()) {
                registro.setId(rs.getLong("id"));
                registro.setNome(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registro;
    }
    
}
