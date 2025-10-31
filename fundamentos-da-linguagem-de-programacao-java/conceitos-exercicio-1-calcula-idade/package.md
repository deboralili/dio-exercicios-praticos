# 🧠 package

## 💬 O que é

`package` (ou “pacote”) é uma forma de **organizar as classes e arquivos de um projeto Java**.  
Ele funciona como uma pasta dentro do código, ajudando a manter o projeto estruturado e a evitar 
conflitos entre classes que tenham o mesmo nome *(apesar de isso não ser muito recomendado de qualquer jeito 😅)*.

Todo arquivo Java pode (e geralmente deve) começar declarando o pacote ao qual pertence.  
Essa declaração indica **em que parte da estrutura do projeto** o arquivo está localizado e facilita 
o uso de importações entre diferentes classes.

Em resumo:
- Ajuda a **organizar o código**;
- Evita **nomes duplicados** em projetos grandes;
- Facilita a **manutenção e o reaproveitamento** do código.

## 🧩 Exemplo prático — `package`

Cada pasta (ou “pacote”) agrupa classes com **funções semelhantes**.
Este é um **exemplo didático**, mostrando **como o uso do `package` ajuda a evitar conflitos**:

Imagine que você está criando um projeto em que a classe `Item` aparece em partes diferentes - uma relacionada a **pedidos** e outra ao **estoque**.
Você pode organizar as classes, assim:

```
src/
 ├── pedido/
 │    └── Item.java
 └── estoque/
      └── Item.java
```

No início de cada arquivo, você declara o pacote ao qual ele pertence:

Arquivo: pedido/Item.java
```
package pedido;

public class Item {
    String nomeProduto;
    int quantidade;
}
```

Arquivo: estoque/Item.java
```
package estoque;

public class Item {
    String nome;
    int quantidadeDisponivel;
}
```

Dessa forma, o Java sabe **onde está cada classe** e **evita confusões**.
Mesmo que ambas tenham o mesmo nome (`Item`), **não há conflito**, já que cada uma pertence a um pacote diferente.

Ao importar essas classes em outro arquivo, você pode especificar qual está usando:

```
import pedido.Item;
import estoque.Item;

public class App {
    public static void main(String[] args) {
        pedido.Item itemPedido = new pedido.Item();
        estoque.Item itemEstoque = new estoque.Item();
    }
}
```

Se **não existissem pacotes**, o Java **não saberia qual `Item`** você está tentando usar e o código simplesmente **não funcionaria**.

## 💡 Dica rápida

Por convenção, os nomes de pacotes em Java são sempre escritos em **letras minúsculas** e costumam seguir a **estrutura invertida do 
domínio da empresa ou projeto**, por exemplo:

```
br.com.minhaempresa.meuprojeto.pedido
```

Isso evita conflitos de nome em projetos grandes e dá uma **identidade única** a cada pacote — mesmo que o mundo inteiro use o mesmo nome de classe. 🌍✨

## 📚 Mais sobre o assunto

Quer se aprofundar mais sobre pacotes em Java?

Você pode consultar a **documentação oficial da Oracle**, que explica em detalhes como os pacotes funcionam e como organizar seus projetos de forma eficiente:

🔗 [Documentação oficial — Packages (Oracle)](https://docs.oracle.com/javase/tutorial/java/package/index.html)
