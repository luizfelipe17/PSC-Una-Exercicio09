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

        return this.getKi();

    }

    @Override
    public String toString() {

        return "Terraqueo:\n\n"
                + "Nome: " + this.getNome() + "\n"
                + "Idade: " + this.getIdade() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "Temporada: " + this.getTemporada() + "\n"
                + "ki: " + this.getKi() + "\n"
                + "Poder Especial: " + this.getPoderEspecial() + "\n"
                + "País: " + this.getPais() + "\n"
                + "Cidade: " + this.getCidade() + "\n";

    }

}
