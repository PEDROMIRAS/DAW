/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej9.pkg7;

/**
 *
 * @author pedromiras
 */
public interface Cola {
    public void enconlar(Integer num);
    public Integer desencolar();
    default void encolarMultiples(Integer num , int veces){
        for (int i = 0; i < veces; i++) {
            this.enconlar(num);
        }
    };
}
