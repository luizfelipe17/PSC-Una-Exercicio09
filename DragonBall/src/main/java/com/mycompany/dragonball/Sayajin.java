package com.mycompany.dragonball;

public class Sayajin extends PersonagemDragonBall implements I_Tranformavel {

    private int nivelMaximoSSJ;
    private boolean temRabo;

    public void setNivelMaximoSSJ(int nivelMaximoSSJ) {
        this.nivelMaximoSSJ = nivelMaximoSSJ;
    }

    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
    }

    public int getNivelMaximoSSJ() {
        return nivelMaximoSSJ;
    }

    public boolean isTemRabo() {
        return temRabo;
    }

    @Override
    public double calcularPoder() {

        double poderki = getKi() * (1 + getNivelMaximoSSJ() * 0.1);

        return poderki;

    }

    @Override
    public void transformar(int nivel) {

        if (getNome().equalsIgnoreCase("Goku") || getNome().equalsIgnoreCase("Vegeta") && getNivelMaximoSSJ() >= 4 && getNivelMaximoSSJ() <= 5) {

            System.out.println("{{ " + this.getNome() + " }} transformou para super sayajin nível {{ " + this.getNivelMaximoSSJ() + " }}");

        } else if (getNivelMaximoSSJ() <= 3) {

            System.out.println("{{ " + this.getNome() + " }} transformou para super sayajin nível {{ " + this.getNivelMaximoSSJ() + " }}");

        } else {

            System.out.println("Não foi possível transformar esse sayajin");

        }

    }

    @Override
    public String toString() {

        return "Sayajin:\n\n"
                + "Nome: " + this.getNome() + "\n"
                + "Idade: " + this.getIdade() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "Temporada: " + this.getTemporada() + "\n"
                + "ki: " + this.calcularPoder() + "\n"
                + "Poder Especial: " + this.getPoderEspecial() + "\n"
                + "Nivel Máximo SSJ: " + this.getNivelMaximoSSJ() + "\n"
                + "Tem rabo? " + this.isTemRabo() + "\n";

    }

}
