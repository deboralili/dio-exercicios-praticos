# ⚙️ static

## 💬 O que é

A palavra-chave `static` em Java indica que **um membro (atributo, método ou bloco) pertence à classe**, e **não a uma instância específica** dela.

Isso significa que você pode **acessar algo `static` sem precisar criar um objeto** da classe.

Por exemplo: o método `main` é `static` justamente para que o Java possa executá-lo **sem precisar criar um objeto** antes.
Assim, o programa pode começar a rodar diretamente.

## 💻 Exemplo

```
public class ExemploStatic {
    static int contador = 0;

    static void mostrarMensagem() {
        System.out.println("Método static chamado!");
    }

    public static void main(String[] args) {
        // Acessando membros static diretamente, sem criar objetos
        ExemploStatic.mostrarMensagem();
        System.out.println("Contador: " + ExemploStatic.contador);
    }
}
```

No exemplo:
* `contador` e `mostrarMensagem()` são **membros estáticos**, pertencem à classe;
* não precisamos criar um `new ExemploStatic()` para usá-los;
* podemos acessá-los diretamente pelo nome da classe.
