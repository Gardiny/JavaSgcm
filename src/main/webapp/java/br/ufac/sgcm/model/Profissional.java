package br.ufac.sgcm.model;

import java.io.Serializable;

public class Profissional implements Serializable{
    private Long id;
    private String nome;
    private String registro;
    private String email;
    private String telefone;
    private Unidade unidade;
    private Especialidade especialidade;

    //construtor vazio
    public Profissional(){

    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Long getId(){
        return this.id;
    }

    public void serId(Long id){
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
