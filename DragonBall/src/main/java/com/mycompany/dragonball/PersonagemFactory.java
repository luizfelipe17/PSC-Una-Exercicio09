package com.mycompany.dragonball;

public class PersonagemFactory {

    public static Terraqueo criarKuririn() {
        
        return Terraqueo("Kuririn", 35, "Masculino", "Z", 1500, "Disco Destruidor", "Terra", "Cidade do Oeste");
        
    }

    public static Sayajin criarGoku() {
        
        return new Sayajin("Goku", 40, "Masculino", "Super", 10000, "Kamehameha", 5, true);
        
    }

    public static Sayajin criarGohan() {
        
        return new Sayajin("Gohan", 23, "Masculino", "Super", 9000, "Masenko", 3, true);
        
    }

    public static Namekuseijin criarDende() {
        
        return new Namekuseijin("Dendê", 20, "Masculino", "Z", 3000, "Curar", 7, true);
        
    }
}
