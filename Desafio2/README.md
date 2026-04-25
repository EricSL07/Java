### 🗺️ Avançando para o Módulo 2: Collections Framework & Equals/HashCode

Você usou uma `List`, que é ótima para sequências. Mas e quando precisamos de buscas ultrarrápidas, como um dicionário no Python? No Java, usamos a interface `Map` (geralmente implementada por `HashMap`).

**Teoria Rápida (C++ & Python vs. Java):**

- **Dicionários:** O `dict` do Python equivale ao `Map<Key, Value>` no Java. O `std::unordered_map` do C++ é o equivalente direto do `HashMap` do Java.
- **O Segredo do HashMap:** Para o Java saber se duas chaves são iguais (por exemplo, evitar capítulos duplicados), ele **não** olha para o endereço de memória. Ele usa dois métodos que _toda_ classe herda da classe mãe `Object`: `equals()` e `hashCode()`. Se você cria uma classe customizada e a usa em um `HashMap` ou `HashSet`, você **precisa** sobrescrever esses dois métodos.

#### 🚀 Desafio 2: Manga & Manhwa Catalog

Vamos sair do console simples e começar a trabalhar com memória estruturada. Imagine que você está lendo _Solo Max Level Newbie_ ou _Doom Breaker_ e quer registrar quais capítulos já leu.

1. Crie uma classe `Manga` com os atributos `final`: `String titulo` e `String autor`.
2. **O Pulo do Gato:** Sobrescreva os métodos `equals()` e `hashCode()` na classe `Manga`. Dois mangás são iguais se tiverem o mesmo `titulo`. (Dica: a sua IDE pode gerar isso para você, mas tente entender a lógica de comparar as strings).
3. Crie uma classe `CatalogManager`. Ela deve ter um atributo privado: um `Map<Manga, List<Integer>>` chamado `readChapters`. A chave é o objeto `Manga` e o valor é uma lista de capítulos (números inteiros) lidos.
4. No `CatalogManager`, crie um método `addChapter(Manga manga, int chapterNumber)` que adiciona um capítulo lido à lista daquele mangá específico. (Atenção: se for a primeira vez adicionando um capítulo para aquele mangá, você precisará instanciar a `List` para ele dentro do Map primeiro).
5. No `Main`, instancie dois mangás, adicione alguns capítulos lidos e imprima os capítulos de um mangá buscando-o no Map.
