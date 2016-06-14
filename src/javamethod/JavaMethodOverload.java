
package javamethod;

/*
 * @author Edwin Mendez
 */
public class JavaMethodOverload {
  
public static void main( String[] args ){

JavaMethodOverload No = new JavaMethodOverload();    
    

    System.out.println( "Metodo 1 = " + No.suma(5, 5));
    System.out.println("____________________________________________________________");
    System.out.println( "Metodo Sobreescito = " + No.suma(4.0, 4.5));

}    

public int suma(int N , int N2){
int S = N + N2;    
return S;
}

public double suma(double N , double N2){
double S = N + N2;    
return S;
}

}
