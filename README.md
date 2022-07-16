# Curso-Java-Encapsulamento-Override
Exemplo de código com Encapsulamento, construindo uma interface "Controlador" e usando essa mesma interface para construir um "Controle Remoto".

Uma interface em Java seria uma espécie de classe que serve apenas como "forma de bolo" de métodos abstratos* para outras classes que vão usar os mesmos métodos mas que, internamente, vão trabalhar de maneira diferente. *Os métodos são abstraídos na interface pois queremos atribuir funções e valores apenas nas classes que vão usar esses métodos. Abaixo mostro de forma simplificada a declaração de uma interface e a criação de uma classe que implementa ou utiliza os métodos desta interface.

Exemplo da Interface:
```java
public interface Controlador {
    public abstract void ligar();
}
```
Exemplo de Classe fazendo Override da Interface Controlador:
```java
public class ControleRemoto implements Controlador{
    
    //Atributos
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    //Demais Métodos e Getters/Setters
}
```
