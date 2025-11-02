# 🧠 import

## 💬 O que é

A palavra-chave `import` em Java é usada para **trazer classes ou pacotes externos para dentro do seu código**.

Ela funciona como uma **ponte** entre o arquivo atual e outros arquivos (ou bibliotecas) que você quer utilizar.

Em outras palavras, o `import` **diz ao compilador onde encontrar uma classe** que não está no mesmo pacote do seu código.

Sem ele, o Java **não saberia de onde veio** determinada classe — por exemplo, `Scanner`, `ArrayList`, `List` ou até mesmo suas próprias classes em outros pacotes.

Resumindo:
* Evita que você tenha que digitar o caminho completo de uma classe toda vez que for usá-la;
* Facilita a **leitura e a manutenção** do código;
* Permite **reaproveitar funcionalidades já existentes** em outras partes do projeto ou em bibliotecas externas.

## 🧩 Exemplo prático

No exercício usamos o `Scanner`, que faz parte do pacote `java.util`.

Para utilizá-lo, adicionamos no início do arquivo:

```
import java.util.Scanner;
```

Dessa forma você pode usar diretamente, sem precisar escrever o caminho completo toda vez.

Sem o `import`:
```
java.util.Scanner scanner = new java.util.Scanner(System.in);
```

Com o `import`:
```
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

Podemos ver que o código fica muito mais limpo e fácil de entender.

## 💡 Dica rápida

Se você quiser **importar todas as classes** de um pacote de uma vez, pode usar o caractere `*` (asterisco).

Por exemplo:

```
import java.util.*;
```

Isso importa **todas as classes** do pacote `java.util`, como `Scanner`, `ArrayList`, `List`, etc.

💬 **Mas cuidado**: importar tudo pode deixar seu código menos eficiente e mais confuso, já que você pode acabar usando classes sem perceber de onde vieram.
O ideal é **importar apenas o que for realmente necessário**.

## 📚 Mais sobre o assunto

Quer se aprofundar um pouco mais?

🔗 [Documentação oficial da Oracle](https://docs.oracle.com/javase/tutorial/java/package/usepkgs.html)
