package exemploarrays;

/**
 *
 * @author irodriguezsteuerberg
 */
public class ExemploArrays {

    public static void main(String[] args) {
 Metodos a = new Metodos();
 a.crearArray();
 a.amosar();
 //creamos array
 int valores[]={1,2,3,4,5};
 a.visualizar(valores);
        System.out.println("creo array en main");
 int[]datos = new int[3];
 datos=a.encherArray(datos);
 a.visualizar(datos);
 
 }
    
}
