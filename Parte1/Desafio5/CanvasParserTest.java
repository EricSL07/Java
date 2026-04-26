package Desafio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

public class CanvasParserTest {
    
    @Test
    public void deveFazerParseDeComandoValido() {
        CanvasParser parser = new CanvasParser();

        Command cmd = parser.parse("RECTANGLE 10 20");

        assertEquals("RECTANGLE", cmd.shape());
        assertEquals(10, cmd.x());
        assertEquals(20, cmd.y());
    }

    @Test
    public void deveLancarExcecaoQuandoComandoInvalido() {

        CanvasParser parser = new CanvasParser();

        assertThrows(InvalidCanvasCommandException.class, () -> {
            parser.parse("DRAW 50"); 
        });
    }
}