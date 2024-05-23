import java.io.Serializable;

public class Profissional implements Serializable{
  private long id;
  private String nome;
  private String registro;
  private String email;
  private String telefone;
  private Unidade unidade;
  private Especialidade especialidade;



  public Long getId(){
    return this.id;

  }
  public void setId(Long id){
    this.id = id;
  }
public String getNome() {
    return nome;
}
public String getRegistro() {
    return registro;
}
public String getEmail() {
    return email;
}
public String getTelefone() {
    return telefone;
}
public Unidade getUnidade() {
    return unidade;
}
public Especialidade getEspecialidade() {
    return especialidade;
}
  

}
