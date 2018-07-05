import java.util.Scanner;
public class Ev03 {
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
 
 public static int moda ( int [ ] v ) {
    int i, j, moda = 0, n = v.length, frec;
    int frecTemp, frecModa = 0, moda1 = -1; 
  v = t ( v, 0 );
   for ( i = 0; i < n; i++ ) {
      frecTemp = 1; 
      for ( j = i + 1; j < n; j++ ) {
        if ( v [ i ] == v [ j ] )
          frecTemp++;
      }
      if ( frecTemp > frecModa ) {
        frecModa = frecTemp;
        moda1 = v[ i ];
      }
    }
    return moda1;
  }

    public static int [ ] t ( int [ ] v, int r ) {
    int i, j, n = v.length, a = 0;
    
    for ( i = 0; i < n - 1; i++ )
      for ( j = i + 1; j < n; j++ )
        if ( r == 0 )
          if ( v [ i ] > v [ j ] ) {
            aux = v [ j ];
            v [ j ] = v [ i ];
            v [ i ] = a;
          }
        else if ( r == 1 )
          if ( v [ i ] < v [ j ] ) {
            a = v [ i ];
            v [ i ] = v [ j ];
            v [ j ] = a;
          }

    return v;
  }  
  public static void main ( String [ ] args ) {
    int n; int [] v;
    double moda;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dime la cantidad de numeros : ");
    n = sc.nextInt ( );
    v = array ( n );
    moda = moda ( v );
    System.out.println ( " Media del vector: " + moda);
}
}
