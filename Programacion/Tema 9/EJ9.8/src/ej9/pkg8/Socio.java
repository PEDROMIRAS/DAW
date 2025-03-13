package ej9.pkg8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
    int id; // Número identificativo del socio
    String nombre;
    LocalDate fechaNacimiento;
    
    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    
    int edad() {
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", edad: " + this.edad();
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Socio) o).id;
    }
}
