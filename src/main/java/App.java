
import java.sql.Connection;
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
        for (Especialidade item : listEspecialidade){
            System.out.println(item.getId() + "|" +item.getNome());
        }
    }
}
