package sgcm.src.main;

import sgcm.src.main.java.br.ufac.sgcm.model.Especialidade;
import sgcm.src.main.java.br.ufac.sgcm.model.Profissional;
import sgcm.src.main.java.br.ufac.sgcm.model.Unidade;

public class App {
    public static void main(String[] args){
        profissional p1 = new profisional();
        p1.setId(id:1L);
        p1.setNome(nome:"Limeira");
        p1.setEmal(email:"limeira@ufac.br");
        p1.setTelefone(telefone:"99999999");
        p1.setRegistro(registro:"crm-123");

        Unidade ul = new Unidade();
        ulsetId(id:1l);
        ul.setNome(nome:"Pronto Atendimeto");
        ul.setEndereço(endereco:"Av. Rocha  viana");

        Especialidade el = new Especialidade();
        el.setId(id:1L);
        el.setNome(nome:"Pediatra");

        p1.setUnidade(ul);
        p1.setEspecialidade(el);

        System.out.println(p1.getNome);
        System.out.println(p1.getUnidade().getNome());
        System.out.println(p1.getEspecialidade().p1.getNome());
    }
}
