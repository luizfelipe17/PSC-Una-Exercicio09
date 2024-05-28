package com.mycompany.dragonball;

public class Terraqueo extends PersonagemDragonBall {

    private String pais, cidade;

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public double calcularPoder() {

        return getKi();

    }

    @Override
    public String toString() {

        return "Terraqueo:\n\n"
                + "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Temporada: " + getTemporada() + "\n"
                + "ki: " + getKi() + "\n"
                + "Poder Especial: " + getPoderEspecial() + "\n"
                + "País: " + getPais() + "\n"
                + "Cidade: " + getCidade() + "\n";

    }

}
