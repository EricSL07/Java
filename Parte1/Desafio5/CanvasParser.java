package Desafio5;

public class CanvasParser {
    public Command parse(String input) {

    String[] partes = input.split(" ");

    if (partes.length != 3) {
        throw new InvalidCanvasCommandException(
            "Comando inválido. O formato deve ser: FORMA X Y"
        );
    }

    String forma = partes[0];
    int x = Integer.parseInt(partes[1]);
    int y = Integer.parseInt(partes[2]);

    return new Command(forma, x, y);

    }
}
