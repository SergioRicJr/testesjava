package main.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExtra {
    @Test
    void validarLancamentos() {
        int[] primeiro = {10,20,30,40,50};
        int[] segundo = {10,20,30,40,50};
    
        Assertions.assertArrayEquals(primeiro, segundo);
    }

    @Test
    void validaSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
    }
}
