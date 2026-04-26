# ☕ Java Fast-Track & Algorithms

Bem-vindo ao meu repositório focado no ecossistema Java moderno. O objetivo deste projeto é documentar minha evolução na linguagem, partindo de fundamentos de Orientação a Objetos até a implementação de algoritmos complexos de grafos e manipulação de arquivos.

Todos os micro-projetos aqui foram desenvolvidos com foco em **Boas Práticas Corporativas**, arquitetura limpa e utilização das APIs mais recentes do Java.

## 🚀 Tecnologias e Ferramentas
* **Java 17+** (Uso extensivo de `Records`, `Streams` e `Optional`)
* **JUnit 5** (Testes Unitários)
* **Java DOM Parser** (Manipulação de XML)
* **Estruturas de Dados:** `List`, `Map`, `Set`, `Queue` (LinkedList)

---

## 📂 Estrutura dos Projetos

### 1. Calisthenics Tracker (OOP Avançada)
Um sistema de linha de comando para modelar exercícios físicos estáticos e dinâmicos.
* **Foco:** Herança, Polimorfismo, abstração profunda com Interfaces (`Trackable`) e encapsulamento rigoroso (`final`).

### 2. Manga & Manhwa Catalog (Collections Framework)
Um gerenciador em memória de alta performance para rastrear capítulos lidos de obras literárias.
* **Foco:** Contratos de `equals()` e `hashCode()`, uso de `HashMap` para buscas em O(1) e inicialização funcional com `computeIfAbsent()`.

### 3. Design Canvas Console Parser (Tratamento de Erros)
Um interpretador de comandos em texto estruturado que converte inputs em entidades de domínio estritas.
* **Foco:** Utilização de `Records` para imutabilidade de dados, criação de Unchecked Exceptions customizadas e validação estrita de domínios.

### 4. Olympia Stats Analyzer (Programação Funcional)
Processamento e análise estatística de um dataset em memória de atletas de fisiculturismo.
* **Foco:** Substituição completa de laços `for` e `if` convencionais pela **Stream API** (`filter`, `map`, `average`), Method References (`::`) e mitigação de *NullPointerExceptions* utilizando `Optional`.

### 5. Graph Metrics Analyzer: Les Misérables (Estruturas de Dados e Algoritmos)
O projeto mais robusto do repositório. Uma aplicação de análise de redes que lê uma representação estruturada das interações entre personagens do romance *Os Miseráveis* e extrai métricas matemáticas complexas.
* **Foco:** * Modelagem de um Grafo Não Dirigido utilizando Listas de Adjacência.
  * Parsing de arquivos XML (`.gexf`) nativo com `DocumentBuilder`.
  * Implementação do algoritmo **Breadth-First Search (BFS)** utilizando filas (`Queue`).
  * Cálculo matemático de **Excentricidade** e **Closeness Centrality Normalizada**.
  * Escrita e exportação de relatórios `.txt` utilizando o padrão *Try-With-Resources*.
 
---

## 🔜 Próximos Passos (Roadmap)
- [ ] Integração com **Spring Boot** para transformar as aplicações console em APIs RESTful.
- [ ] Persistência em Banco de Dados Relacional utilizando **JPA/Hibernate**.
