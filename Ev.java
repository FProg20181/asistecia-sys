import java.util.Scanner;
public class Ev {
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

  public static double mediana ( int [ ] v ) {
    int pos = 0, n = v.length;
    double temp = 0, temp0 = 0;    
   
    v = t ( v, 0 );

    temp = n / 2;
    if ( n % 2 == 0 ) {
      pos = (int)temp;      
      temp0 = (double)(v [ pos ] / v [ pos + 1 ]);
    }
    if ( n % 2 == 1 ) {
      pos = (int)(temp + 0.5);
      temp0 = (double)(v [ pos ]);  
    }

    return temp0;
  }
    public static int [ ] t ( int [ ] v, int r ) {
    int i, j, n = v.length, a = 0;
    
    for ( i = 0; i < n - 1; i++ )
      for ( j = i + 1; j < n; j++ )
        if ( r == 0 )
          if ( v [ i ] > v [ j ] ) {
            a = v [ j ];
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
    double mediana;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dime la cantidad de numeros : ");
    n = sc.nextInt ( );
    v = array ( n );
    mediana = mediana ( v );
    System.out.println ( " la mediana del vector: " + mediana);
}
}
