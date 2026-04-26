### 🗺️ Módulo 5 (Final): Ferramental de Mercado (Testes)

Chegamos ao último degrau antes de você ter uma base corporativa sólida. Você sabe a sintaxe, sabe orientar a objetos e domina a manipulação de dados em memória. Falta uma coisa: **Nenhum código vai para produção sem testes automatizados.**

**Teoria Rápida (C++ & Python vs. Java):**
* **Build Tools:** No C++, você compila com `g++` e usa `Makefiles` ou `CMake`. No Java, **ninguém** usa `javac` na mão. Nós usamos **Maven** ou **Gradle**. Eles baixam dependências (como o `pip` do Python) e orquestram a compilação e os testes.
* **Testes:** No Python, você usaria o `pytest`. No Java, o padrão absoluto da indústria é o **JUnit 5**.

Como não temos um arquivo `pom.xml` (Maven) aqui no chat para baixar dependências, vamos simular a escrita de uma classe de teste.

#### 🚀 Desafio 5: Quebrando o Canvas Parser

Lembra do nosso `CanvasParser` do Módulo 3? 
```java
public Command parse(String input) {
    String[] partes = input.split(" ");
    if (partes.length != 3) {
        throw new InvalidCanvasCommandException("Formato inválido");
    }
    return new Command(partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
}
```

O desafio é escrever a classe de teste `CanvasParserTest` usando a sintaxe do JUnit 5.

1. Crie uma classe `CanvasParserTest`.
2. Crie um método `void deveFazerParseDeComandoValido()`. 
    * Anote este método com `@Test` (finja que a anotação está importada).
    * Instancie o `CanvasParser`.
    * Chame o método `parse("RECTANGLE 10 20")`.
    * Use o método `assertEquals(valorEsperado, valorAtual)` para garantir que o *shape* gerado foi `"RECTANGLE"` e que o X foi `10`.
3. Crie um método `void deveLancarExcecaoQuandoComandoInvalido()`.
    * Anote com `@Test`.
    * Use o método `assertThrows(ClasseDaExcecao.class, () -> codigoQueGeraOErro)` para garantir que passar `"DRAW 50"` lança a sua `InvalidCanvasCommandException`. *(Isso é o equivalente direto do `pytest.raises` no Python!)*.
