### 🗺️ Avançando para o Módulo 4: Streams, Lambdas & Optional

Agora vamos entrar no que mudou a história do Java moderno (Java 8+). Acabaram os milhares de `for` e `if` aninhados.

**Teoria Rápida (C++ & Python vs. Java):**
* **Programação Funcional:** No Python, você usaria list comprehensions como `[x.nome for x in atletas if x.peso > 100]`. No C++, usaria `<algorithm>`. No Java, usamos a **Stream API**. Uma Stream é um fluxo de dados que permite filtrar (`filter`), transformar (`map`) e reduzir/agrupar (`collect`) dados de forma declarativa e paralelizável.
* **Fim do NullPointerException:** No C/C++, você lidava com segfaults por causa de ponteiros nulos. No Java antigo, métodos retornavam `null` e causavam o famoso NPE se você esquecesse um `if (obj != null)`. Hoje, o Java usa a classe **`Optional<T>`** para indicar: "Pode ser que eu te retorne algo, pode ser que não. Trate isso!".

#### 🚀 Desafio 4: Olympia Stats Analyzer

Como você curte o universo do fisiculturismo, vamos analisar o Mr. Olympia sem usar nenhum loop tradicional (`for` ou `while`).

Aqui está o seu Record base (Pode copiar e colar):
```java
public record Bodybuilder(String name, String category, double weightKg) {}
```

**O Desafio de Código:**
Crie uma classe `Main` com uma lista contendo alguns atletas. Exemplo:
* Chris Bumstead ("Classic Physique", 104.5)
* Ramon Dino ("Classic Physique", 101.0)
* Derek Lunsford ("Open", 115.0)
* Hadi Choopan ("Open", 114.0)
* Ryan Terry ("Men's Physique", 85.0)

Agora, usando **apenas a API de Streams (`.stream()`)**, resolva as seguintes missões:

1. **A Missão do Filtro:** Filtre a lista para encontrar apenas os atletas da categoria `"Classic Physique"`, extraia apenas o **nome** deles (usando `.map()`), e guarde o resultado em uma `List<String>`. Imprima essa lista.
2. **A Missão do Cálculo:** Use uma Stream para pegar todos os atletas da categoria `"Open"`, extrair os pesos deles (usando `.mapToDouble()`), e calcule a **média de peso** (usando `.average()`). 
3. **A Missão do Optional:** Use a stream para procurar o atleta chamado `"Ramon Dino"` (usando `.filter()` e `.findFirst()`). Como `.findFirst()` retorna um `Optional<Bodybuilder>`, use o método `.ifPresent()` ou `.ifPresentOrElse()` do Optional para imprimir uma mensagem caso o encontre, ou avisar caso não exista.

**Regra de Ouro:** ZERO blocos `for` ou `if/else` explícitos. Tudo funcional e encadeado! Mostre do que você é capaz.