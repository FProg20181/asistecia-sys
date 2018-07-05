
import java.util.Scanner;
public class Ev02 {
  public static int [ ] array ( int vari ) {
    int i; int [ ] v; 
    v = new int [ vari ];
    Scanner sc = new Scanner ( System.in );

    for ( i = 0; i < vari; i++ ) {
      System.out.print ( "v [ " + i + " ] = " );
      v [ i ] = sc.nextInt ( ); 
    }

    return v;
  }
  public static double media ( int [ ] v ) {
    double prom = 0.0;
    for ( int i = 0; i < v.length; i++ )
      prom += v[i];
  return prom / ( double ) v.length;  
  }
 
  public static void main ( String [ ] args ) {
    int n; int [] v;
    double media;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dime la cantidad de numeros : ");
    n = sc.nextInt ( );
    v = array ( n );
    media = media ( v );
    System.out.println ( " la media es : " + media);
}
}
