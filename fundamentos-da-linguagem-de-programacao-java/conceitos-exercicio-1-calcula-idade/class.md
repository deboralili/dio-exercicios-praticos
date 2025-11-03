# 🧩 class

## 💬 O que é

A palavra-chave `class` em Java é usada para **definir uma classe**, que é o **modelo ou estrutura básica** para criar objetos.</br>
Ela descreve **como algo se comporta** (métodos) e **quais informações possui** (atributos).

Em outras palavras, uma classe é como **a planta de uma casa**: ela define o formato e as regras, mas a casa em si (o objeto) só existe
quando você cria uma **instância** dessa classe.

Por exemplo, se tivermos uma classe `Pessoa`, podemos criar vários objetos do tipo `Pessoa`, cada um com seus próprios valores (nome, idade, etc).

## 🧩 Exemplo prático

Vamos ver essa classe `Pessoa`:

```
public class Pessoa {
    // Atributos (características)
    String nome;
    int idade;

    // Método (comportamento)
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

Para usar essa classe fazemos o seguinte:

```
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulano";
        pessoa1.idade = 25;
        pessoa1.apresentar();
    }
}
```

A saída será assim:

```
Olá, meu nome é Fulano e tenho 25 anos.
```

Resumindo o que há no exemplo:
* `Pessoa` é a classe;
* `nome` e `idade` são atributos;
* `apresentar()` é um método;
* e `pessoa1` é um **objeto**, criado a partir da classe.

## 💡 Dica rápida

Em Java, é uma boa prática (e muitas vezes obrigatória) manter apenas uma classe pública por arquivo, e o nome da classe deve ser igual
ao nome do arquivo.

Por exemplo:
* Arquivo: `Pessoa.java`
* Classe: `public class Pessoa`

Isso ajuda o compilador e outros desenvolvedores a encontrarem o código facilmente.

## 📚 Mais sobre o assunto

Quer se aprofundar mais?

🔗 [Documentação oficial — Classes (Oracle)](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
