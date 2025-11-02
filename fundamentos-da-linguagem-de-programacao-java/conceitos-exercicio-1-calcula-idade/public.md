# 🔑 public

## 💬 O que é

A palavra-chave `public` em Java é um **modificador de acesso**.
Ela define **quem pode acessar** uma classe, método ou variável dentro do código.

Quando algo é `public`, significa que ele pode ser **acessado por qualquer outra classe e de qualquer pacote**.

Em outras palavras, o `public` **torna o código visível globalmente** dentro do projeto.

## ⚙️ Exemplo prático

No exercício, temos a declaração:

```
public class CalculaIdade {
    // código...
}
```

Aqui, o `public` indica que a classe `CalculaIdade` pode ser usada por **qualquer outra classe**, mesmo que esteja em outro pacote.

Por exemplo, se outra classe quiser criar um objeto de `CalculaIdade`, isso é possível porque ela foi declarada como `public`.

Dessa forma:

```
CalculaIdade calcula = new CalculaIdade();
```

Mas se a classe **não fosse pública**, ela só poderia ser acessada **dentro do mesmo pacote**.

## 💡 Dica rápida

* Use `public` quando quiser que uma classe, método ou variável **seja acessível de qualquer parte do código**.
* Se quiser restringir o acesso, há outros modificadores como `private`, `protected` e o **padrão (sem palavra-chave)**.

## 📚 Mais sobre o assunto

Quer entender melhor os modificadores de acesso em Java?

🔗 [Documentação oficial — Java Language Specification (Oracle)](https://docs.oracle.com/javase/specs/jls/se17/html/jls-6.html#jls-6.6)
