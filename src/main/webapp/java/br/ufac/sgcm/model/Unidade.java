import java.io.Serializable;

public class Unidade implements Serializable{

    private long id;
    private string nome;
    private string endereço;

    public Unidade(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getEndereço() {
        return endereço;
    }

    public void setEndereço(string endereço) {
        this.endereço = endereço;
    }
    
}