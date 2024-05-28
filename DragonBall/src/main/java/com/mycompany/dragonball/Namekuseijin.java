package com.mycompany.dragonball;

import java.util.Scanner;

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
        
        return this.getKi() * (1 + (podeCurar ? 0.2 : 0));
        
    }

    @Override
    public String toString() {

        return "NameKuseijin:\n\n"
                + "Nome: " + getNome()+ "\n"
                + "Idade: " + this.getIdade() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "Temporada: " + this.getTemporada() + "\n"
                + "ki: " + this.calcularPoder() + "\n"
                + "Poder Especial: " + this.getPoderEspecial() + "\n"
                + "Pode curar? " + this.isPodeCurar()+ "\n"
                + "Esferas Quantidades: " + this.getQuantidadesEsferas() + "\n";

    }
    
    public String realizarDesejo(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Realize o desejo: ");
        String desejo = ler.nextLine();
        System.out.println("");
        
        System.out.println("Desejo realizado " + desejo);
        
        return desejo;
    }
    
}
