package EJ4;

/*
 Implementamos las listas de tipo Integer con arrays, que iremos redimensionando 
 seg�n vaya haciendo falta. Los elementos de la lista se insertan desde el 
 principio del array hacia el final. El n�mero de elementos insertados se 
 refleja en el atributo numeroElementos, que son los elementos v�lidos del array.
 El �ndice de un elemento en la lista coincide con el �ndice del lugar que
 ocupa en el array.
 */
import java.util.Arrays;

public class Lista {

    private int numeroElementos;
    protected Integer[] tabla;

    //Por defecto, la capacidad inicial de la lista (tama�o de la lista) es 10
    public Lista() {
        numeroElementos = 0;
        tabla = new Integer[10];
    }

    //Podemos hacer que la capacidad inicial sea cualquier valor pas�ndosela 
    //al constructor
    public Lista(int capacidadInicial) {
        numeroElementos = 0;
        tabla = new Integer[capacidadInicial];
    }

    //El n�mero de elementos de la lista puede leerse desde fuera de la clase
    //aunque no modificarse
    int numeroElementos() {
        return numeroElementos;
    }

    //M�todo de uso interno en la clase
    protected boolean listaLLena() {//No hay elementos libres en el array
        return numeroElementos == tabla.length;
    }

    void insertarPrincipio(Integer nuevo) {
        if (listaLLena()) {//Si el array est� lleno, aumentamos en 10 su tama�o
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        for (int i = numeroElementos; i >= 1; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[0] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(Integer nuevo) {
        if (listaLLena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        tabla[numeroElementos] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(Lista otraLista) {
        //Aumentamos la capacidad hasta que quepan los elementos de las dos
        //listas
        while (numeroElementos + otraLista.numeroElementos > tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
            tabla[i] = otraLista.tabla[j];
            numeroElementos++;
        }

    }

    //El primer par�metro es el �ndice del lugar donde queremos insertar
    //el valor del segundo par�metro
    boolean insertar(int posicion, Integer nuevo) {
        boolean insertado = true;
        if (posicion < 0 || posicion > numeroElementos) {//�ndice no v�lido
            insertado = false;
        } else {
            if (listaLLena()) {
                tabla = Arrays.copyOf(tabla, tabla.length + 10);
            }
            for (int i = numeroElementos; i > posicion; i--) {
                tabla[i] = tabla[i - 1];
            }
            tabla[posicion] = nuevo;
            numeroElementos++;
        }
        return insertado;
    }

    Integer eliminar(int indice) {//si est� vac�a devuelve null
        Integer eliminado = null;
        if (indice >= 0 && indice < numeroElementos) {
            eliminado = tabla[indice];
            for (int i = indice; i < numeroElementos - 1; i++) {
                tabla[i] = tabla[i + 1];
            }
            numeroElementos--;
        }
        return eliminado;
    }

    /*Al siguiente m�todo le pasaremos un �ndice y nos devolver� el
     elemento correspondiente del array sin modificarlo. En el caso de que 
     el �ndice no sea v�lido, devolver� null, con lo cu�l evitamos que el
     programa aborte*/
    Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < numeroElementos) {//�ndice v�lido
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < numeroElementos && indice == -1; i++) {
            if (tabla[i] == claveBusqueda) {
                indice = i;
            }
        }
        return indice;
    }

    void ordenar() {
        //No debemos olvidar que al final del array suele haber elementos 
        //null que, en una ordenaci�n producir�n errores. Por eso hay que 
        //escoger el rango donde hay elementos Integer v�lidos
        Arrays.sort(tabla, 0, numeroElementos);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object otra) {
        boolean iguales = true;
        if (numeroElementos != ((Lista) otra).numeroElementos) {
            iguales = false;
        } else {
            for (int i = 0; i < numeroElementos && iguales; i++) {
                if (!tabla[i].equals(((Lista) otra).tabla[i])) {
                    iguales = false;
                }
            }
        }
        return iguales;
    /*Tambien valdr�a:        
        return Arrays.deepEquals(tabla, ((Lista) otra).tabla);
    */
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < numeroElementos; i++) {
            res += tabla[i] + " ";
        }
        return res;
    }

}
