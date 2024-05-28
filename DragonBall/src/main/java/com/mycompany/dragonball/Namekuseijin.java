package com.mycompany.dragonball;

public class Namekuseijin extends PersonagemDragonBall {

    private int quantidadesEsferas;
    private boolean podeCurar;

    public int getQuantidadesEsferas() {
        return quantidadesEsferas;
    }

    public boolean isPodeCurar() {
        return podeCurar;
    }

    public void setQuantidadesEsferas(int quantidadesEsferas) {
        this.quantidadesEsferas = quantidadesEsferas;
    }

    public void setPodeCurar(boolean podeCurar) {
        this.podeCurar = podeCurar;
    }
    
    @Override
    public double calcularPoder() {
        
        return getKi() * (1 + (podeCurar ? 0.2 : 0));
        
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
                + "Pode curar? " + isPodeCurar()+ "\n"
                + "Esferas Quantidades: " + getQuantidadesEsferas() + "\n";

    }
    
}
