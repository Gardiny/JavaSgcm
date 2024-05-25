
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.dao.ConexaoBD;
import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

public class App {
    public static void main(String [] args){
        Profissional p1 = new Profissional();
        p1.setId(1L);;
        p1.setNome("nome do profissional");
        p1.setEmail("email");
        p1.setTelefone("9999999");
        p1.setRegistro("Registro");

        Unidade u1 = new Unidade();
        u1.setId(1L);
        u1.setNome("Nome da unidade");
        u1.setEndereco("Endereco da unidade");

        Especialidade e1 = new Especialidade();
        e1.setId(1L);
        e1.setNome("Nome da especialidade");

        p1.setUnidade(u1);
        p1.setEspecialidade(e1);

        System.out.println(p1.getNome());
        System.out.println(p1.getUnidade().getNome());
        System.out.println(p1.getEspecialidade().getNome());

        ConexaoBD conexao = new ConexaoBD();
        conexao.getConexao();
        Connection instancia = conexao.getConexao();
        if(instancia != null) {
            System.out.println("conectou");
        }else {
            System.out.println("falhou");
        }
        EspecialidadeDao eDao = new EspecialidadeDao();
        List<Especialidade> listEspecialidade = eDao.get();
        System.out.println("Lista de Especialidade");
        for (Especialidade item : listEspecialidade){
            System.out.println(item.getId() + "|" +item.getNome());
        }
        System.out.println("Uma Especialidade");
        Especialidade esp = eDao.get(2L);
        System.out.println(esp.getId() + "|" +esp.getNome());
        System.out.println("Lista com termo de busca:gia");
        
        List<Especialidade> listaBusca = eDao.get("gia");
        for (Especialidade item : listaBusca){
            System.out.println(item.getId() + "|" +item.getNome())
        }
    }
    //retorne conforme um termo de busca
    public List<Especialidade> get(String termoBusca){
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade WHERE nome LIKE ?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" +termoBusca+ "%" );
            rs = ps.executeQuery();
            while (rs.netx()) {
                Especialidade registro = new Especialidade();
                registro.setId(rs.getLong("id"));
                registro.setNome(rs.getString("nome"));
                registros.add(registro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;
    }
    // inserir uma especialidade
    public void insert(Especialidade objeto){
        String sql = "INSERT INTO especialidade nome VALUES ?";
        try{
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            registroAfetados = ps.executeUpdate();
        }catch{SQLException e}{
            e.printStackTrace();
        }
        return registroAfetados;
    }
}
