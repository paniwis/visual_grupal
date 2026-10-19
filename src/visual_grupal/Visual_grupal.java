  
package visual_grupal;

public class Visual_grupal {


    public static void main(String[] args) {
      
        System.out.println("Hola este es el inicio");
        System.out.println("Holaaaaaaas");
        int a = 1;
        int b=2;
        int c=8;
        int d=2; 
        System.out.println(calculoSuma(a,b));
        System.out.println("");
        System.out.println(calculoResta(c,d));
        System.out.println("");
        System.out.println("Multiplicacion: "+calculoMultiplicacion(b,c));
        System.out.println("hola como estas");
        mensaje();
        
        
        
    }
    
    public static int calculoSuma(int num1, int num2){
        return num1+num2;
    }
    public static int calculoResta(int num1, int num2){
        return num1-num2;
    }
    public static int calculoMultiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static double calculoDivision(int num1, int num2) {
        
        if (num2 == 0) return 0;
        
        return num1 / num2;
        
    }
    public static void mensaje () {
        System.out.println("");
        System.out.println("mensaje");
    }
}
