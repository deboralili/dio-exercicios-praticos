# 📘 Ponto e Vírgula (;)

## 🧩 O que é

O **ponto e vírgula** (**;**) é um **símbolo de terminação de instruções** em Java.
Ele indica ao compilador que **uma instrução chegou ao fim**, permitindo que a próxima seja iniciada.
Em outras palavras, o `;` funciona como um **ponto final nas sentenças do código**.

## ⚙️ Como funciona

Em Java, **cada comando independente precisa terminar com ponto e vírgula**, por exemplo:

```
int numero = 10;
System.out.println(numero);
```

Sem o `;`, o compilador não saberá onde uma instrução termina e a outra começa — resultando em erro de compilação.

## ⚠️ Atenção

Nem todas as linhas em Java terminam com `;`.<br/>
**Blocos de código**, como os definidos por `{ }`, **não precisam** desse símbolo ao final.

Exemplo:

```
if (numero > 5) {
    System.out.println("Maior que 5");
}
```

Observe que:

* O `System.out.println` termina com `;`, pois é uma instrução.
* O `if` e o bloco `{ }` não terminam com `;`, pois são estruturas de controle.

## 💡 Curiosidade

Em algumas linguagens, como Python, o ponto e vírgula é **opcional**.
Mas em Java, ele é **obrigatório** para garantir clareza e precisão na leitura do código pelo compilador.

## 📚 Mais sobre o assunto

Quer se aprofundar mais sobre o uso do ponto e vírgula (`;`) em Java?

🔗 [Semicolons in Java — JavaBook (MCCUE)](https://javabook.mccue.dev/first_steps/semicolon)
