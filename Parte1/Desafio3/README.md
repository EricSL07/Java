### 🗺️ Avançando para o Módulo 3: Imutabilidade, Records & Tratamento de Erros

Seu arquivo `Manga.java` ficou com 30 linhas. Mas repare: ele é apenas um "carregador de dados". Não tem regra de negócio complexa.

**Teoria Rápida (C++ & Python vs. Java):**
* **Records (O `dataclass` do Java):** No Python, você usaria `@dataclass`. No C++, um `struct`. No Java 14+, introduziram o `record`. Um `record` gera **automaticamente** o construtor, os getters, o `equals()`, o `hashCode()` e o `toString()`. 
Aquele seu `Manga.java` inteiro de 30 linhas poderia ser escrito assim hoje em dia:
`public record Manga(String titulo, String autor) {}`
* **Exceções (O Calcanhar de Aquiles):** No C++ e Python, exceções não são checadas em tempo de compilação. Em Java, temos uma divisão estrita:
    1. **Checked Exceptions (`Exception`):** O compilador te **obriga** a colocar um `try/catch` ou repassar o erro (`throws`). Usado para coisas fora do controle da aplicação (ex: falha de rede, arquivo não encontrado).
    2. **Unchecked Exceptions (`RuntimeException`):** O compilador não te obriga a tratar. Usado para erros de lógica ou programação (ex: `NullPointerException`, tentar acessar um índice inválido de um array). Padrões corporativos modernos (como o framework Spring Boot) dão muita preferência para *Unchecked Exceptions*.

#### 🚀 Desafio 3: Design Canvas Console Parser

Vamos criar um interpretador que lê comandos em texto (como se viessem de um arquivo ou do terminal) e os converte em objetos, lidando com erros caso o usuário digite besteira.

1. Crie um **`record`** chamado `Command` que receba três propriedades: `String shape` (forma), `int x`, e `int y` (coordenadas). *(Veja como fica minúsculo comparado a uma classe normal!)*
2. Crie uma **exceção customizada** chamada `InvalidCanvasCommandException`. Ela deve herdar de `RuntimeException` (Unchecked). Crie um construtor nela que receba a mensagem de erro e passe para a superclasse (`super(mensagem)`).
3. Crie uma classe `CanvasParser` com um método: `public Command parse(String input)`.
    * O `input` será algo como `"RECTANGLE 10 20"`.
    * Dica: use `input.split(" ")` para quebrar a string em um array de partes.
    * **Regra de Validação:** Se o array não tiver exatamente 3 partes, lance a sua `InvalidCanvasCommandException` com uma mensagem amigável (ex: *"Comando inválido. O formato deve ser: FORMA X Y"*).
    * Se for válido, converta as posições 1 e 2 do array para inteiros (use `Integer.parseInt()`) e retorne um novo objeto `Command`.
4. No seu `Main`, teste o parser dentro de um bloco `try / catch`. Passe um comando válido (ex: `"CIRCLE 5 5"`) e imprima o resultado (só dar um `System.out.println` no record). Depois, passe um comando inválido (ex: `"DRAW 10"`) e capture a exceção, imprimindo a mensagem de erro dela no terminal.
