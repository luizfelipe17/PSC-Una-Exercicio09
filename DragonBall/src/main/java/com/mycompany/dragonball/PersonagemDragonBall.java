package com.mycompany.dragonball;

abstract class PersonagemDragonBall {

    private String nome;
    private int idade;
    private String sexo;
    private int temporada;
    private int ki;
    private String poderEspecial;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getKi() {
        return ki;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }
    
    public int calcularPoder(){
        
        return 0;
        
    }

}
