
package projectapplication1;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.util.Random;

/**
 * La Victoria, Edo. Aragua, 2022.
 * U.P.T.A F.B.F.
 * Electiva III, PNF en Informática, Trayecto III.
 * Nombre y Apellido: José Trejo.
 * Cédula : 26.613.476
 * Prof: Karlys Zambrano.
 * Programación en Java.
 * @author jose99
 */
public class ProjectApplication1 {

    
    public static void main(String[] args) {
        
        
       
       System.out.println("---------- Menu de Opciones ---------\n\n");
       opciones();
    }
    
    public static void opciones(){
        
         System.out.println("Presione 1 para calcular la edad de una persona\n\n");
         System.out.println("Presione 2 para transformar una unidad de temperatura de grados Celsius a grados Fahrenheit o grados Kelvin\n\n");
        System.out.println("Presione 3 para ingresar los datos de una persona\n\n");
        System.out.println("Presione 4 para usar la calculadora\n\n");
        System.out.println("Presione 5 para generar una cantidad de numeros aleatorios\n\n");
        System.out.println("Presione 6 para generar una tabla de multiplicar\n\n");
        
        Scanner lectura= new Scanner(System.in);
       int num_escoger=lectura.nextInt();
       seleccion(num_escoger);
    }
    
    public static void seleccion(int opcion){
    switch(opcion){
        case 1:
Calcular_edad();
         break;  
        case 2:
            Calcular_temp();
            break;
        case 3:
            imprimir_usuario();
            break;
        case 4:
            Calculadora();
            break;
        case 5:
            aleatorio();
            break;
        case 6:
            Tabla();
            break;
        default:
           System.out.println("Opción no disponible.\n\n"); 
           opciones();
            break;
    }
    }
    //Apartado de calcular la edad de una persona
    public static void Calcular_edad(){
    
        //--------------- año de nacimiento
            System.out.println("Ingrese el año de nacimiento:");
            Scanner lectura= new Scanner(System.in);
       int ano=lectura.nextInt();
       
       System.out.println("Ingrese el mes de nacimiento:");
       String mes = lectura.next();
       //------- Meses del año
       int mes_nac=0;
       switch(mes){
       
           case "enero":
              mes_nac = 1;
              break;
           case "Enero":
               mes_nac = 1;
              break;
           case "febrero":
               mes_nac=2;
               break;
               case "Febrero":
               mes_nac=2;
               break;
           case "marzo":
               mes_nac=3;
               break;
               case "Marzo":
               mes_nac=3;
               break;
           case "abril":
               mes_nac=4;
               break;
               case "Abril":
               mes_nac=4;
               break;
           case "mayo":
               mes_nac=5;
               break;
               case "Mayo":
               mes_nac=5;
               break;
           case "junio":
               mes_nac=6;
               break;
               case "Junio":
               mes_nac=6;
               break;
           case "julio":
               mes_nac=7;
               break;
               case "Julio":
               mes_nac=7;
               break;
           case "agosto":
               mes_nac=8;
               break;
               case "Agosto":
               mes_nac=8;
               break;
           case "septiembre":
               mes_nac=9;
               break;
               case "Septiembre":
               mes_nac=9;
               break;
           case "octubre":
               mes_nac=10;
               break;
               case "Octubre":
               mes_nac=10;
               break;
           case "noviembre":
               mes_nac=11;
               break;
               case "Noviembre":
               mes_nac=11;
               break;
           case "diciembre":
               mes_nac=12;
               break;
               case "Diciembre":
               mes_nac=12;
           default:
               break;
           
       }
       
       
       //--------- Dia de nacimiento
       System.out.println("Ingrese el dia de nacimiento:");
       int dia = lectura.nextInt();
           Period edad = Period.between(LocalDate.of(ano,mes_nac,dia), LocalDate.now());
           System.out.println(String.format("La persona tiene %d años.\n\n",edad.getYears()));
          // Regreso al menú de opciones 
           System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
           Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
             if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           }
           }
    }
    // Apartado de transformación de unidad de temperatura a otra.
    public static void Calcular_temp(){
    System.out.println("Presione 1 para transformar una unidad de temperatura de grados Celsius a grados Kelvin\n\n");
         System.out.println("Presione 2 para transformar una unidad de temperatura de grados Celsius a grados Fahrenheit\n\n");
    Scanner lectura= new Scanner(System.in);
   // Transformar de grados Celsius a Kelvin
       int opcion=lectura.nextInt();
       if(opcion==1){
           System.out.println("Ingrese la cantidad de grados Celsius:");
       Scanner grados = new Scanner(System.in);
       double grados_cels = grados.nextDouble();
        
   System.out.println("El resultado es  "+(grados_cels+273.00)+" grados Kelvin\n\n");
   // Tranformar grados Celsius a Fahrenheit
       }else if(opcion==2){
        System.out.println("Ingrese la cantidad de grados Celsius:");
       Scanner grados = new Scanner(System.in);
       double grados_farenh = grados.nextDouble();
       
   System.out.println("El resultado es  "+((grados_farenh*1.8)+(32.0))+" grados Fahrenheit\n\n");
       }
       // Regreso al menú de opciones 
        System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
           Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
              if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           }
           }
          
    }
    // Pedido de datos a los usuarios
    public static void imprimir_usuario(){
    
        System.out.println("Ingrese su nombre: ");
           Scanner dato = new Scanner(System.in);
           String nombre = dato.next();
           System.out.println("Ingrese su apellido: ");
        String apellido = dato.next();
        System.out.println("Ingrese su dirección: ");
        String dir = dato.next();
        System.out.println("Ingrese su correo: ");
        String correo = dato.next();
        System.out.println("Ingrese su número de teléfono: ");
        String telf = dato.next();
        System.out.println("Nombre : "+nombre+" Apellido : "+apellido+" Dirección : "+dir+" Correo : "+correo+" N. de telf : "+telf+"\n\n");
       // Regreso al menú de opciones 
        System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
           Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
             if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           }
           }
    
}
    // Creación de calculadora con operaciones básicas
    public static void Calculadora(){
    System.out.println("------------- Elige una operación -------------\n\n");
    System.out.println("1 - Suma -\n\n");
    System.out.println("2 - Resta -\n\n");
    System.out.println("3 - Multiplicación -\n\n");
    System.out.println("4 - División -\n\n");
    System.out.println("Ingrese un número según sea la opción de la calculadora:\n\n");
    Scanner lectura= new Scanner(System.in);
       int opcion=lectura.nextInt();
      
       switch(opcion){
       
           case 1:
               System.out.println("Ingrese el primer número:\n\n");
                double suma1 = lectura.nextDouble();
                System.out.println("Ingrese el segundo número:\n\n");
                 double suma2 = lectura.nextDouble();
                 System.out.println("El resultado de la suma es : "+suma(suma1,suma2)+"\n\n");
                
               break;
               
               case 2:
                  
                   System.out.println("Ingrese el primer número:\n\n");
                double resta1 = lectura.nextDouble();
                System.out.println("Ingrese el segundo número:\n\n");
                 double resta2 = lectura.nextDouble();
                 System.out.println("El resultado de la resta es : "+resta(resta1,resta2)+"\n\n");
                 
                   
               break;
               
               case 3:
                   
                   System.out.println("Ingrese el primer número:\n\n");
                double multi1 = lectura.nextDouble();
                System.out.println("Ingrese el segundo número:\n\n");
                 double multi2 = lectura.nextDouble();
                 System.out.println("El resultado de la multiplicación es : "+multip(multi1,multi2)+"\n\n");
                 
                   break;
               case 4:
                   System.out.println("Ingrese el primer número:\n\n");
                double div1 = lectura.nextDouble();
                System.out.println("Ingrese el segundo número:\n\n");
                 double div2 = lectura.nextDouble();
                 if(div2!=0){
                     System.out.println("El resultado de la división es : "+div(div1,div2)+"\n\n");
                    
                 }else{
                     System.out.println("La división entre 0 no está definida.\n\n");
                 
                 }
                   break;
               default:
                   System.out.println("La opción elegida no se encuentra disponible\n\n");
                   
                   break;
       }
       // Regreso al menú de opciones 
        System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
           Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
           if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           }
           }
    }
    //Operaciones de la calculadora
    public static double suma(double num1, double num2){
    return num1+num2;
    }
    public static double resta(double num1, double num2){
    return num1-num2;
    }
    public static double multip(double num1, double num2){
    return num1*num2;
    }
    public static double div(double num1, double num2){
    return num1/num2;
    }
    // Generación de números aleatorios
   public static void aleatorio(){
   System.out.println("Ingrese el la cantidad de numeros aleatorios que desea ver:");
       Scanner lectura= new Scanner(System.in);
       int numeros=lectura.nextInt();
       Random random = new Random();
       double valores = 0;
       for (int i=1;i<=numeros;i++){
           if(i==1){
            System.out.println("Lista de números aleatorios: \n\n");
           }
       valores = 25d + (75d-25d)* random.nextDouble();
       if( valores>=25d && valores<=75d ){
       
           System.out.println(""+i+" : "+valores+" \n\n");
       }
       }
       // Regreso al menú de opciones 
        System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
       Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
           if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           } 
   }
}// Generador de tabla de multiplicar
   public static void Tabla(){
   System.out.println("Ingrese el número de la tabla de multiplicar que desea conocer:");
       Scanner lectura= new Scanner(System.in);
       int numero=lectura.nextInt();
       System.out.println("Ingrese la cantidad de veces que desea multiplicar el número en la tabla:");
   int total=lectura.nextInt();
   
       System.out.println("Tabla de multiplicar del "+numero+" \n\n");
   for (int j=0 ;j<=total;j++){
   
       System.out.println(""+numero+" * "+j+" = "+(numero*j)+"\n\n");
       
   }
   // Regreso al menú de opciones 
      System.out.println("Presione la tecla 2 para mostrar el menú de opciones:");
       Scanner tecla = new Scanner(System.in);
           int push = tecla.nextInt();
           if(push==2){
           opciones();
           }else{
          while(push!=2){
               if(push!=2){
              push = tecla.nextInt(); }
              if(push==2){
           opciones();
              }
           } 
   }
   }
}
