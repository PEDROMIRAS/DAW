/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8.pkg4;

import java.util.ArrayList;
import java.util.List;

/***
 * Ejercicio 4
* Crear la clase abstracta Instrumento, que almacena en un array las notas musicales
* de una melod�a (dentro de una misma octava). El m�todo add() a�ade nuevas notas 
* musicales. La clase tambi�n dispone de un m�todo abstracto interpretar) que, 
* en cada subclase que herede de Instrumento, mostrar� por consola las notas 
* musicales seg�n las interprete. Utilizar enumerados para definir las notas 
* musicales.
 */
/**
 *
 * @author pedromiras
 */
public abstract class Instrumento {
    
    protected List<NotasMusicales> melodia;

    public Instrumento(String[] melodia) {
        this.melodia = new ArrayList<>();
    }
    
    public void add(NotasMusicales nota){
        melodia.add(nota);
    }
    
    public abstract void interpretar();
    
}
