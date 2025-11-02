# 💬 Comentário de múltiplas linhas (`/* ... */`)

## 🧩 O que é

O comentário de múltiplas linhas em Java é escrito entre `/*` e `*/`. </br>
Ele serve para **adicionar explicações mais longas no código**, geralmente no início de um arquivo, classe ou método.

Esse tipo de comentário **não é lido pelo compilador** — ele é usado apenas para **ajudar humanos a entenderem o código** 😄.

## ⚙️ Como funciona

Tudo o que estiver **entre `/*` e `*/` será ignorado** pelo Java, não afetando a execução do programa.

Exemplo:

```
/*
 * Exercício 1:
 * Escreva um código que receba o nome e o ano de nascimento de alguém
 * e imprima na tela a seguinte mensagem:
 * "Olá 'Fulano', você tem 'X' anos".
 */
```

Você também pode usá-lo para comentar **blocos inteiros de código**, por exemplo:

```
/*
System.out.println("Teste 1");
System.out.println("Teste 2");
*/
```

Essas linhas não serão executadas enquanto estiverem dentro do comentário.

> 💬 Observação </br> Você pode escrever comentários **com ou sem o asterisco (`*`) em cada linha** — ambos funcionam do mesmo jeito!
</br> O uso dos `*` é apenas **uma convenção visual**, muito comum em códigos Java, para deixar o texto mais alinhado e fácil de ler.

## ⚠️ Atenção

Comentários **não devem substituir a clareza do código**.
Eles servem para **explicar o “porquê”**, não o “como”.

Por exemplo, em vez de:

```
// Soma dois números
int resultado = a + b;
```

Prefira **nomes de variáveis e métodos claros**, e use comentários apenas quando o propósito não for óbvio.

## 💡 Curiosidade

Esse tipo de comentário existe em várias linguagens além do Java, como C, C++, JavaScript e CSS — todas com a mesma sintaxe `/* ... */`.

## 📚 Mais sobre o assunto

🔗 [Documentação oficial — Java Language Specification (Oracle)](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.7)
