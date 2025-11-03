# 🧩 Chaves `{ }`

As **chaves** são usadas em Java para **delimitar blocos de código**.
Tudo o que está dentro de um par `{ }` faz parte de um mesmo escopo — como o corpo de uma classe, método, 
ou estrutura de controle (como `if`, `for`, `while`).

Elas ajudam o compilador (e também quem lê o código) a entender **onde um bloco começa e onde termina**.

## 💻 Exemplo:

```
public class ExemploBlocos {
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
```

No exemplo acima:
* As chaves após `class ExemploBlocos` delimitam o **bloco da classe**.
* As chaves após `main` delimitam o **bloco do método**.
* As chaves dentro do `if` e `else` delimitam **blocos condicionais**.

## 💡 Dica:

Use **indentação consistente** dentro das chaves — isso deixa o código mais legível e facilita entender a hierarquia dos blocos.
