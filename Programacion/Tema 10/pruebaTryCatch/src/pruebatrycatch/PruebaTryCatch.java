/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatrycatch;

/**
 *
 * @author pedromiras
 */
public class PruebaTryCatch {
    static void metodo1(){
           try{
             int a = 10/0;
           }catch(Exception e){
               System.out.println(e);
           } 
           
       } 
       
    static void metodo2()throws Exception{
           int b = 5/0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int a = 10;
            int b = 0;

            try{
            //Ponemos todas la excepciones que pueden generar un error
               int c = a/b; 
               //String cadena = null;
               //cadena.charAt(3);//Si no contemplo el problema pero cojo otra antes no da error
               System.out.println(c);
            }catch(ArithmeticException e){
            //En el caso de que ocurra la execpcion declarada en el catch, 
            //se ejecuta el bloque de codigo del catch, si no salta la excepcion
            //contemplada el programa sigue fallando.
                System.out.println("ERROR: " + e);
            }finally{
                System.out.println("Marti maricon");
            }
           
           //Metodo que controla la excepcion por si mismo
           metodo1();
           
           //Metodo que contempla una excepcion pero no la controla internamente
           try{
              metodo2();
           }catch(Exception e){
               System.out.println(e);
           }  
    }
 }
    

