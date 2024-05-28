package com.mycompany.dragonball;

public class Sayajin extends PersonagemDragonBall implements I_Transformavel {

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

            System.out.println("{{ " + getNome() + " }} transformou para super sayajin nível {{ " + getNivelMaximoSSJ() + " }}");

        } else if (getNivelMaximoSSJ() <= 3) {

            System.out.println("{{ " + getNome() + " }} transformou para super sayajin nível {{ " + getNivelMaximoSSJ() + " }}");

        } else {

            System.out.println("Não foi possível transformar esse sayajin");

        }

    }

    @Override
    public String toString() {

        return "Terraqueo:\n\n"
                + "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Temporada: " + getTemporada() + "\n"
                + "ki: " + calcularPoder() + "\n"
                + "Poder Especial: " + getPoderEspecial() + "\n"
                + "Tem rabo? " + isTemRabo() + "\n";

    }

}
