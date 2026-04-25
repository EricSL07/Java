### 🚀 Desafio 1: Fundamentos do CLI Calisthenics Tracker

**Teoria Rápida (C++ & Python vs. Java):**
* **Ponteiros vs. Referências:** No C++, você gerencia a memória (`new`/`delete`). No Python, tudo é uma referência mutável por baixo dos panos. No Java, *tudo que é um Objeto é uma referência*, mas alocada na Heap e gerenciada pelo **Garbage Collector (GC)**. Você não precisa (nem pode) deletar objetos manualmente.
* **Herança:** C++ e Python permitem herança múltipla de classes. Java **não**. Para resolver isso, o Java usa **Interfaces** (contratos de comportamento). Uma classe só estende *uma* superclasse, mas implementa *N* interfaces.

**O Desafio de Código:**
Vamos criar o núcleo do seu rastreador de treinos. Quero ver como você estrutura seus objetos.

1.  Crie uma Interface chamada `Trackable` com um método: `void logProgress();`.

2.  Crie uma Classe Abstrata `Exercise` que implemente `Trackable`. Ela deve ter 
atributos encapsulados (privados) para o `nome` do exercício e o `grupoMuscular`, 
além de um construtor e métodos *getters*.

3.  Crie duas classes concretas que estendam `Exercise`:
    * `DynamicExercise` (ex: *Archer Pull-up*): deve adicionar atributos para `sets` e `reps` (repetições).
    * `StaticExercise` (ex: *L-Sit*): deve adicionar um atributo para `holdTimeSeconds` (tempo de isometria).

4.  Sobrescreva (override) o método `logProgress()` em ambas as classes concretas para imprimir no console 
o progresso de forma formatada (ex: *"Archer Pull-up - Back: 3 sets of 8 reps"* ou *"L-Sit - Core: 30 seconds hold"*).

5.  No método `main`, crie uma lista genérica (pode usar um array simples ou dar um spoiler do próximo
módulo usando `ArrayList`) contendo alguns exercícios mistos e itere sobre eles chamando `logProgress()`.
