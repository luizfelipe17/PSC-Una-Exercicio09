package com.mycompany.dragonball;

public class PersonagemFactory {

    public void kuririn(Terraqueo terraqueo) {

        terraqueo.setNome("Kuririn");
        terraqueo.setIdade(30);
        terraqueo.setSexo("Masculino");
        terraqueo.setTemporada(1);
        terraqueo.setKi(1000);
        terraqueo.setPoderEspecial("Kamehameha");
        terraqueo.setPais("Terra");
        terraqueo.setCidade("Vila Kame");

    }

    public void goku(Sayajin sayajin) {

        sayajin.setNome("Goku");
        sayajin.setIdade(35);
        sayajin.setSexo("Masculino");
        sayajin.setTemporada(1);
        sayajin.setKi(9000);
        sayajin.setPoderEspecial("Genki Dama");
        sayajin.setNivelMaximoSSJ(1);
        sayajin.setTemRabo(true);

    }

    public void gohan(Sayajin sayajin) {

        sayajin.setNome("Gohan");
        sayajin.setIdade(18);
        sayajin.setSexo("Masculino");
        sayajin.setTemporada(1);
        sayajin.setKi(5000);
        sayajin.setPoderEspecial("Kamehameha");
        sayajin.setNivelMaximoSSJ(1);
        sayajin.setTemRabo(true);

    }

    public void dende(Namekuseijin namekuseijin) {

        namekuseijin.setNome("Dendê");
        namekuseijin.setIdade(10);
        namekuseijin.setSexo("Masculino");
        namekuseijin.setTemporada(1);
        namekuseijin.setKi(2000);
        namekuseijin.setPoderEspecial("Curar");
        namekuseijin.setPodeCurar(true);
        namekuseijin.setQuantidadesEsferas(7);

    }

}
