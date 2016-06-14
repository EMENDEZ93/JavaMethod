
package javamethod;
import static java.lang.System.out;

/*
 * @author Edwin Mendez
 */
public class JavaMethod {

    public static void main(String[] args) {
 
    JavaMethod Cl = new JavaMethod();        
 
    Persona persona = new Persona("Edwin Mendez");
    
    Cl.Saludar(persona.getNombre());
    out.println(Cl.suma(20,3));
    
    }

    
public void Saludar( String Nombre ){
out.println( "********** Hola " + Nombre + "**********");    
}
    

String suma(int S,int S2){
int Suma = S + S2;
return "La suma es " + Suma ;    
}


}
