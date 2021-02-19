package practica.variables.y.constantes;

public class PracticaVariablesYConstantes {

    public static void main(String[] args) {

        int n1=4;
        int n2;
        int n3=8;
        final int n4=2; //Definimos n4 como una constante que consrvara su valor
        
        //Estos son los operadores aritmeticos en Java
        n2 = n1+n3;  //Asi se hace una suma
        System.out.println("El nuevo valor de n2 es " + n2); //Vemos como el valor de la variable ha cambiado y lo imprimimos para verificarlo
       
        n3= n2-n1;  //Asi se hace una resta
        System.out.println("El nuevo valor de n3 es " + n3);
        
        n1= n3/n4;  //Asi se hace una division
        System.out.println("El nuevo valor de n1 es " + n1);
        //n4= n1+n2;  al tratar de alterar el valor de n4 saltara el error por que no podemos asignar valor a una variable "final"
        
        n3=n1*n4;  //Asi multiplicamos
        System.out.println("El nuevo valor de n3 es " + n3);
        
        n1=n2%n4;  //Este operador aritmetico devuelve el resto, por ejemplo al dividir 8/4 el resultado es 2 y nos sobra 0
        System.out.println("El nuevo valor de n1 es " + n1);
        
        
        System.out.println(" ");
        
        
        System.out.println("El valor final de n1 es " + n1);
        System.out.println("El valor final de n2 es " + n2);
        System.out.println("El valor final de n3 es " + n3);
        System.out.println("El valor final de n4 es " + n4);
        
        
        //Los operadores logicos siempre devuelven resultados booleanos, es decir VERDADERO o FALSO. Los operadores logicos en Java son los siguientes
        boolean igual = n1==n2; //Evalua si dos valores son iguales
        System.out.println(igual);
        
        boolean esDistintoA = n3!=n4; //Evalua si un valor es distinto a otro
        System.out.println(esDistintoA);
        
        boolean esMenorA = n4<n3;  //Evalua si un valor es menor a otro
        System.out.println(esMenorA);
        
        boolean esMayorA = n2>n1;  //Evalura si un valor es mayor que otro
        System.out.println(esMayorA);
        
        boolean esMenorOIgualA = n1<=n4; //Evalua si un valor es menor o igual a otro
        System.out.println(esMenorOIgualA);
        
        boolean esMayorOIgualA = n2>=n3;  //Evalua si un valor es igual o mayor que otro
        System.out.println(esMayorOIgualA);
        
        boolean and = n2>n1 && n3>n4; //Operador AND (y) requiere que dos condiciones se cumplan
        System.out.println(and);
        
        boolean or = n1>n3 || n4>n2;  //Operador OR (o) requiere que solo una de las condiciones se cumpla
        System.out.println(or);
       
        // el operador ! (NOT) sirve para excluir
    
                }
    
}
