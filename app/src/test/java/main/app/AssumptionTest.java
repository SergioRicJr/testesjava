package main.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class AssumptionTest {
    
    @Test
    void validarUsuario() {
        //Assumption, so roda teste nessa condicao
        Assumptions.assumeTrue("Sergio".equals(System.getenv("USER")));
        Assertions.assertEquals(10, (5+5));
    }

    //testeCondicional - gera mesmo resultado que assumption
    @Test
    //enable ou disable
    @EnabledIfEnvironmentVariable(matches = "USER", named = "Sergio")
    void validarAlgoSomenteNoUsuario() {
        Assertions.assertEquals(10, (5+5));
    }

    @Test
    @DisabledIfEnvironmentVariable(matches = "USER", named = "Sergio")
    void validarAlgoSomenteNoUsuarioe() {
        Assertions.assertEquals(10, (5+5));
    }

    @Test
    @EnabledOnOs(OS.WINDOWS) //teste que roda so no OS windows
    void validaMaisUmAqui() {
        Assertions.assertEquals(25, 20+5);
    }

}
