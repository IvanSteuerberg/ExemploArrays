package exemploarrays;

import libreria.PedirDatos;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MetodosFutbol {
Futbol [] xogadores = new Futbol[6];

public void crearArray(){
for (int i = 0; i<xogadores.length; i++){
  
}
    
}

public void amosar(){
System.out.println("");
for (int i = 0 ; i<xogadores.length; i++){
    System.out.println(xogadores[i]);    
}
}   
//recibimos o array como parametro
public void visualizar(int []lista){
for (int i = 0 ; i<lista.length; i++){
    System.out.println("**"+lista[i]);    
}
}

public int[] encherArray(int []lista){
for (int i = 0 ; i<lista.length; i++){

}
return lista;
}
}
