package Desafio3;

public class Main {
    public static void main(String[] args) {
        CanvasParser parser = new CanvasParser();

        testarComando(parser, "RECTANGLE 10 20");
        testarComando(parser, "DRAW 50"); 
        testarComando(parser, "CIRCLE DEZ VINTE"); 
    }

    private static void testarComando(CanvasParser parser, String input) {
        System.out.println("Testando: " + input);
        try {
            Command cmd = parser.parse(input);
            System.out.println("Sucesso! Comando gerado: " + cmd);
            
        } catch (InvalidCanvasCommandException e) {
            System.out.println("Erro de Sintaxe: " + e.getMessage());
            
        } catch (NumberFormatException e) {
            System.out.println("Erro de Tipagem: As coordenadas devem ser números!");
        }
        System.out.println("---");
    }
}