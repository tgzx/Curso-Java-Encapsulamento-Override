# Curso-Java-Encapsulamento-Override
Exemplo de código com Encapsulamento, construindo uma interface "Controlador" e usando essa mesma interface para construir um "Controle Remoto".

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
    
    //Métodos
}
```
