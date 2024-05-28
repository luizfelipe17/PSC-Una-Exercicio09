package com.mycompany.dragonball;

public class DragonBall {

    public static void main(String[] args) {

        PersonagemFactory personagens = new PersonagemFactory();
        Sayajin sayajin = new Sayajin();
        Terraqueo terraqueo = new Terraqueo();
        Namekuseijin namekuseijin = new Namekuseijin();

        personagens.kuririn(terraqueo);
        terraqueo.calcularPoder();
        System.out.println(terraqueo.toString());

        personagens.goku(sayajin);
        sayajin.calcularPoder();
        sayajin.setNivelMaximoSSJ(4);
        sayajin.transformar(sayajin.getNivelMaximoSSJ());
        System.out.println(sayajin.toString());

        personagens.gohan(sayajin);
        sayajin.calcularPoder();
        sayajin.setNivelMaximoSSJ(3);
        sayajin.transformar(sayajin.getNivelMaximoSSJ());
        System.out.println(sayajin.toString());

        personagens.dende(namekuseijin);
        namekuseijin.calcularPoder();
        System.out.println(namekuseijin.toString());
        namekuseijin.realizarDesejo();

    }

}
