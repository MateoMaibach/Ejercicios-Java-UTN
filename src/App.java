

//Ejercicio-3 
//import java.util.Scanner;

//public class App {
//public static void main(String[] args) throws Exception {
//  Scanner sc = new Scanner(System.in);
//System.out.print("Ingrese cantidad de partidos ganados ");
//int n1 = sc.nextInt();
//n1 = n1*3;
//System.out.print("Ingrese cantidad de partidos empatados ");
//int n2 = sc.nextInt();
//n2 = n2*1; 
//System.out.print("Ingrese cantidad de partidos perdidos ");
//int n3 = sc.nextInt();
//n3 = n3*0;
//int result = n1+n2+n3;
//System.out.println("La cantidad de puntos del equipo es: " + result);

//sc.close();

//    }
//}

//Ejercicio 4
//public class App{
//  public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//int cont = 0;
//System.out.println("Ingrese las tres notas de los parciales");
//int n1 = sc.nextInt();
//cont = cont + n1;
//int n2 = sc.nextInt();
//cont = cont + n2;
//int n3 = sc.nextInt();
//cont = cont + n3;
//int result = (cont)/3;
//System.out.println("El promedio es de " + result);
//sc.close();
//}
//}

//Ejercicio 5 

//public class App{
//  public static void main(String[] args) {
//Scanner sc= new Scanner (System.in); 
//System.out.println("Ingrese el precio a pagar");
//int n1 = sc.nextInt();
//double dto = n1*0.15;
//double result = n1 - dto;
//System.out.println("El precio con descuento es de "+ result); 
//sc.close();       
//}
//}

// Ejercicio 6
//import java.util.Scanner;
//public class App{
//   public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//   System.out.println("Inserte dos números");
// int n1 = sc.nextInt();
//int n2 = sc.nextInt();
//if(n1>n2){;
//int suma = (n1+n2);
//System.out.println("La suma de los números es " + suma);
//}
//else{
//int producto =(n1*n2);
//System.out.println("El producto de los numeros es "+ producto);
//} 
//sc.close();
//}
//}

// Ejercicio 7
//import java.util.Scanner;
//public class App {
//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//int cont = 0;
//System.out.print("Ingrese las tres notas de los parciales ");
//int n1 = sc.nextInt();
//cont = cont + n1;
//int n2 = sc.nextInt();
//cont = cont + n2;
//int n3 = sc.nextInt();
//cont = cont + n3;
//float result = cont / 3.f;
//if (result >= 7) {
//System.out.print("Aprobado");
//} else if (result >= 4) {
//System.out.print("Regular");

//} else {
//System.out.println("Reprobado");
//}
//sc.close();
//}
//}
//import java.util.Scanner;

//public class App {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
//System.out.println("Ingrese un número");
//float n1 = sc.nextFloat();
//if (n1 < 0) {
// System.out.println("El número ingresado es negativo");
//} else if (n1 > 0) {
//System.out.println("El número ingresado es positivo");
//} else {
//System.out.println("El numero ingresado es 0");
//}
//sc.close();
//}
//}

//import java.util.Scanner;

//public class App {
//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//System.out.println("Ingrese tipo de operación:");
//System.out.println("1. Total efectivo");
//System.out.println("2. Mitad efectivo + mitad a 30 días");
//System.out.println("3. Un tercio en efectivo, un tercio a 30 días y un tercio a 60 días");
//int n1 = sc.nextInt();
//System.out.println("Ingrese el precio");
//float precio = sc.nextFloat();
//switch (n1) {
//case 1:
//System.out.println("El monto a pagar es de $ " + precio + " En efectivo");
//break;
//case 2:
//precio = precio / 2;
//System.out.println("El monto a pagar es de $ " + precio + " en efectivo y $ " + precio + " en 30 días");
//break;
//case 3:
//precio = precio / 3;
//System.out.println("El monto a pagar es de $" + precio + " en efectivo, $" + precio + " en 30 dias y $" + precio
//+ " en 60 dias");
//break;  
//default:
//System.out.println("Operación inválida");
//break;
//}
//sc.close();
//}
//}

//Ejercicios Actividad 2
//import java.util.Scanner;

//public class App {
//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//System.out.println("Ingrese el valor de X1:");
//float x1 = sc.nextFloat();
//System.out.println("Ingrese el valor de Y1:");
//float y1 = sc.nextFloat();
//System.out.println("Ingrese el valor de Z1:");
//float z1 = sc.nextFloat();
//float nuevox1 = z1;
//float nuevoy1 = x1;
//float nuevoz1 = y1;
//System.out.println("Los valores rotados son:");
//System.out.println("X1 " + nuevox1);
//System.out.println("Y1 " + nuevoy1);
//System.out.println("Z1 " + nuevoz1);
//sc.close();
//}
//}
//import java.util.Scanner;

//public class App {
 // public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Ingrese edad");
    //int edad = sc.nextInt();
    //System.out.println("¿Posee Documento de identidad nacional, ingrese s = sí o n = no");
    //String respuesta = sc.next();
    //boolean dni = false;
    //if (respuesta.equals("S") || respuesta.equals("s")) {
        //dni = true;
    //}

    //if (edad >= 18 && dni) {
       // System.out.println("Puede votar en las elecciones presidenciales argentinas");
    //} else {
        //System.out.println("No cumple con los requisitos para votar en las elecciones presidenciales argentinas");
    //}
    //sc.close();
  //}
//}

//ejercicio 3 
//import java.util.Scanner;
//public class App{
  //public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Ingrese tres números");
    //int n1 = sc.nextInt();
    //int n2 = sc.nextInt();
    //int n3 = sc.nextInt();
    //if (n1 >= n2 && n1 >= n3) {
      //System.out.println(n1 + " es mayor");
    //}
    //if (n2 >= n1 && n2 >= n3){
      //System.out.println(n2 + " es mayor");
    //}
    //if (n3 >= n2 && n3 >= n1){
      //System.out.println(n3 + " es mayor");
    //}
   
    //sc.close();
//}
  //}

//Ejercicio 4
//import java.util.Scanner;

//public class App{
  //public static void main(String[] args) {
    //Scanner sc= new Scanner(System.in);    
    //System.out.println("Ingrese un número del 1 al 7");
    //int dia = sc.nextInt();
      //switch (dia) {
    //case 1:
      //System.out.println("Lunes");  
      //break;  
    //case 2:
      //System.out.println("Martes");  
      //break;  
    //case 3:
      //System.out.println("Miércoles");  
      //break;
    //case 4:
      //System.out.println("Jueves");  
      //break;
    //case 5:
      //System.out.println("Viernes");  
      //break;
    //case 6:
      //System.out.println("Sábado");  
      //break;
    //case 7:
      //System.out.println("Domingo");  
      //break;
    //default:
      //System.out.println("Operación inválida");                 
    //}
    //sc.close();
  //}
//}
//import java.util.Scanner;
//public class App{
  //public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Ingrese el radio de un circulo");
    //int r = sc.nextInt();
    //double pi =  3.1416;
    //double a = pi * (r * 2);
    //System.out.println("El área de " + r + " es " + a);
    //sc.close();
  //}
//}

// ejercicio 6 
//import java.util.Scanner;
//public class App{
  //public static void main(String[] args) {
    //Scanner sc = new Scanner (System.in);
    //System.out.println("Ingrese dos números");
    //double n1 = sc.nextDouble();
    //double n2 = sc.nextDouble();
      //if (n1 == n2) {
        //System.out.println("Los números son iguales");
    //} else {
       //System.out.println("Los números no son iguales");
    //}
    //sc.close();
  //}
//}

//ejercicio 7

//import java.util.Scanner;
  //public class App{
    //public static void main(String[] args) {
    //Scanner sc = new Scanner (System.in);
    //System.out.println("Ingrese dos números");
    //double n1 = sc.nextDouble();
    //double n2 = sc.nextDouble();
      //if (n1 % n2 == 0) {
        //System.out.println(n1 + " Es múltiplo de " + n2);
    //} else {
       //System.out.println(n1 + " No es múltiplo de " + n2 );
    //}
    //sc.close();
  //}  
//}  

//ejercicio 8 
//import java.util.Scanner;
  //public class App {
  //public static void main(String[] args) {
    //Scanner sc = new Scanner (System.in);
    //System.out.println("Ingrese un número entre 0 y 9999");
    //double n1 = sc.nextDouble();
    //if (n1 >= 0 && n1<9) {
      //System.out.println("El número tiene una sola cifra");
    //}
    //if (n1 > 9 && n1<99) {
      //System.out.println("El número tiene dos cifras");
    //}
    //if (n1 > 99 && n1<999) {
      //System.out.println("El número tiene tres cifras");
    //}
    //if (n1 > 999 && n1<9999) {
      //System.out.println("El número tiene cuatro cifras");
    //}
    //if (n1 < 0 || n1 > 9999) {
      //System.out.println("Operación Inválida");
    //}
    //sc.close();
  //}
//}