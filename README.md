# Praticando Java

Repositório de estudos com os exercícios que venho praticando em Java, com foco em orientação a objetos.

Atualmente contém o projeto **AulasAluraJava**, um catálogo simples de filmes e séries (inspirado no Screenmatch, da Alura) usado para exercitar classes, encapsulamento, herança e polimorfismo.

## Estrutura

```
AulasAluraJava/
└── src/
    ├── Principal.java
    └── br/com/alura/AulasAluraJava/
        ├── modelos/
        │   ├── Titulo.java
        │   ├── Filme.java
        │   └── Serie.java
        └── calculos/
            └── CalculadoraDeTempo.java
```

## Classes

| Classe | Descrição |
| --- | --- |
| `Titulo` | Classe base com nome, ano de lançamento, duração e sistema de avaliações (`avalia`, `pegaMedia`). |
| `Filme` | Estende `Titulo` e acrescenta o diretor. |
| `Serie` | Estende `Titulo` e sobrescreve o cálculo de duração: temporadas × episódios × minutos por episódio. |
| `CalculadoraDeTempo` | Acumula a duração total dos títulos incluídos. |
| `Principal` | Classe de entrada, onde os objetos são criados e os métodos testados. |

## Conceitos praticados

- Classes, atributos e métodos
- Encapsulamento com getters e setters
- Herança (`extends`)
- Sobrescrita de método (`@Override`)
- Organização em pacotes

## Como executar

Requer JDK instalado (o projeto foi configurado com o JDK 25).

```bash
cd AulasAluraJava
javac -d out $(find src -name "*.java")
java -cp out Principal
```

Ou abra a pasta `AulasAluraJava` no IntelliJ IDEA e rode a classe `Principal`.

## Próximos passos

- [ ] Fazer a `CalculadoraDeTempo` aceitar qualquer `Titulo`, não apenas `Filme`
- [ ] Tratar a média quando ainda não há avaliações
- [ ] Criar uma interface `Classificavel`
- [ ] Armazenar os títulos em uma lista e ordená-los
